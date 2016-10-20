import java.util.*;

/**
 * Created by Richard on 10/12/16.
 */
// This is the main class that manages the utility
// and component class of the whole iVote System
public class IVoteService implements IVoteService_Interface {

    // data members that represent the classroom and student objects
    private ArrayList<Student> students;
    private List<String> listOfChoices;
    private Classroom classObj;

    // constructor creates instances
    public IVoteService() {
        classObj = new Classroom();
        classObj.arrangeStudents();
        students = classObj.getStudents();
    }

    // displays the question that is proposed to the students
    @Override
    public void displayQuestion(Question question) {
        System.out.println("This is the question: \"" + question.getQuestion() + "\"");
    }


    @Override
    public void displayAnswer(Question question) {
        System.out.println("The answer is: " + question.getAnswer());
    }

    // displays the answer choices that students have to choose from
    @Override
    public void displayChoices(Question questionType) {
        System.out.print("The answer choices are: ");
        listOfChoices = classObj.getChoices(questionType);

        for(int i = 0; i < classObj.getChoices(questionType).size(); i++) {
            System.out.print(listOfChoices.get(i) + ". ");
        }
        System.out.println();
    }

    // displays the number of student selections for each answer choice
    @Override
    public void displayStatistics(Question questionType) {
        listOfChoices = classObj.getChoices(questionType);
        HashMap<String, HashSet<Integer>> studentAnswers = new HashMap<>();

        String answerSubmissions;
        String answerChoice;
        int i, j;

        for(i = 0; i < listOfChoices.size(); i++) {
            HashSet<Integer> set = new HashSet<>();
            answerChoice = listOfChoices.get(i);
            for(j = 0; j < students.size(); j++) {
                answerSubmissions = students.get(j).getSubmission();
                if(answerChoice == answerSubmissions) {
                    set.add(students.get(j).getId());
                }
            }
            studentAnswers.put(answerChoice, set);
        }

        for(i = 0; i < studentAnswers.size(); i++) {
            System.out.print(listOfChoices.get(i) + ":" + studentAnswers.get(listOfChoices.get(i)).size() + " ");
        }

        System.out.println();
        System.out.println("Answer Choice = [set of Student IDs who selected this choice]");
        System.out.print(studentAnswers);


//        int[] frequency = new int[listOfChoices.size()];
//
//        for(int i = 0; i < listOfChoices.size(); i++) {
//            System.out.print(listOfChoices.get(i) + " : ");
//            for(int j = 0; j < students.size(); j++) {
//                if(listOfChoices.get(i) == students.get(j).getSubmission()) {
//                    ++frequency[i];
//                }
//            }
//            System.out.print(frequency[i] + "  ");
//        }
////        System.out.println(Arrays.toString(frequency));
//        System.out.println();
//        System.out.println("Student ID : answer submission");
//        for(Student s : students) {
//            String submission = s.getSubmission();
//            int id = s.getId();
//            System.out.print(id + ":" + submission + " ");
//        }
    }

    // collects all the selections from the student objects
    @Override
    public void acceptSubmissions(Question questionType) {
        System.out.println(students.size() + " students");

        for(Student s : students) {
            s.pickSubmission(questionType);
        }
    }
}
