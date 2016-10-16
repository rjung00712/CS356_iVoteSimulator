import java.util.ArrayList;
import java.util.List;

import static javax.swing.UIManager.get;

/**
 * Created by Richard on 10/12/16.
 */
// This is the main class that manages the utility and component class of
// the whole iVote System
public class IVoteService implements IVoteService_Interface {

    private ArrayList<Student> students;
    private List<String> list;
    private Classroom classObj;

    IVoteService() {
        classObj = new Classroom();
        classObj.arrangeStudents();
        students = classObj.getStudents();
    }

    @Override
    public void displayQuestion(Question question) {
        System.out.println("This is the question: " + question.getQuestion());
    }

    @Override
    public void displayChoices(Question questionType) {
        System.out.print("These are the answer choices: ");
        list = classObj.getChoices(questionType);

        for(int i = 0; i < classObj.getChoices(questionType).size(); i++) {

            System.out.print(list.get(i) + ". ");
        }
        System.out.println();
    }

    @Override
    public void displayStatistics(Question questionType) {
//        classObj.arrangeStudents();

//        students = classObj.getStudents();

        for(Student s : students) {
            String submission = s.getSubmission();
            int id = s.getId();
            System.out.print(id + ":" + submission + " ");
        }



    }

    @Override
    public void acceptSubmissions(Question questionType) {
        System.out.println(students.size());

        for(Student s : students) {
            s.pickSubmission(questionType);
        }
    }

//    public List<String> getChoices(Question questionType) {
//        PossibleAnswers possibleAnswers = new PossibleAnswers();
//        List<String> list;
//
//        if(questionType instanceof MultipleChoice) {
//            list = possibleAnswers.getMultChoices();
//        } else {
//            list = possibleAnswers.getTFChoices();
//        }
//
//        return list;
//    }
}
