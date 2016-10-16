import java.util.ArrayList;
import java.util.List;

/**
 * Created by Richard on 10/15/16.
 */
public class Classroom {

    private ArrayList<Student> students;
    private Generator g;
    private PossibleAnswers possibleAnswers;

    Classroom() {
        g = new Generator();
        possibleAnswers = new PossibleAnswers();
        students = new ArrayList<>();
    }

    // makes a list of all the students
    public void arrangeStudents() {
        int id = g.generateStudentID();

        while(students.size() != g.generateStudents()) {
            if (isInList(id)) {
                id = g.generateStudentID();
            } else {
                students.add(new Student(id));
            }
        }
    }

    public List<String> getChoices(Question questionType) {
        PossibleAnswers possibleAnswers = new PossibleAnswers();
        List<String> list;

        if(questionType instanceof MultipleChoice) {
            list = possibleAnswers.getMultChoices();
        } else {
            list = possibleAnswers.getTFChoices();
        }

        return list;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    // checks to see if the id is already taken
    private boolean isInList(int id) {
        for(Student student : students) {
            if(student.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
