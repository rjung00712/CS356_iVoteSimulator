import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Richard on 10/13/16.
 *
 * This class does all the random number generating
 */
public class GenerateRandom {

    private Random rand;

    // range for number of students
    private static final int minNumStudents = 10;
    private static final int maxNumStudents = 40;

    // number range for student id
    private static final int highestID = 99999;
    private static final int lowestID = 11111;

    private int studentID;
    private int numOfStudents;

    /////////////////////////////////////

    public ArrayList<Student> students = new ArrayList<>();
    //////////////////////////////////////

    public GenerateRandom() {
        rand = new Random();
        numOfStudents = generateStudents();
    }

    // randomly generates the number of students
    public int generateStudents() {
        numOfStudents = rand.nextInt(maxNumStudents - minNumStudents) + minNumStudents;
        return numOfStudents;
    }

    // makes a list of all the students
    public void arrangeStudents() {
        int id = generateStudentID();

        while(students.size() != numOfStudents) {
            if(isInList(id)) {
                id = generateStudentID();
            } else {
                students.add(new Student(id));
            }
        }
    }

    // picks random index out of the list of possible answer choices and returns it
    public int getSubmission(int length) {
        return rand.nextInt(length);
    }

    // generates a random number of students
    private int generateStudentID() {
        studentID = rand.nextInt(highestID - lowestID) + lowestID;
        return studentID;
    }

    // checks to see if the id is already taken
    private boolean isInList(int id) {
        int i;

        for(Student student : students) {
            if(student.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
