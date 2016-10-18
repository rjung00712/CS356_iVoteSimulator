import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.doclint.Entity.nu;

/**
 * Created by Richard on 10/15/16.
 */
// This class represents a classroom with students and their attributes
public class Classroom {

    // data members
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
        int numOfStudents = g.generateStudents();
        while(students.size() <= numOfStudents) {
            if (isInList(id)) {
                id = g.generateStudentID();
            } else {
                students.add(new Student(id));
            }
        }
    }

    // returns the possible choices for students
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

    // returns a list of students in the class
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
