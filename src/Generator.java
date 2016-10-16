import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Richard on 10/13/16.
 */

// This class handles all the random generating and
public class Generator {

    private Random rand;

    // range for number of students
    private static final int minNumStudents = 10;
    private static final int maxNumStudents = 40;

    // number range for student id
    private static final int highestID = 99999;
    private static final int lowestID = 11111;

    private int studentID;

    private PossibleAnswers possibleAnswers;

    /////////////////////////////////////

    public ArrayList<Student> students = new ArrayList<>();
    //////////////////////////////////////

    public Generator() {
        rand = new Random();
        possibleAnswers = new PossibleAnswers();
    }

    // randomly generates the number of students
    public int generateStudents() {
        int numOfStudents;
        numOfStudents = rand.nextInt(maxNumStudents - minNumStudents) + minNumStudents;

        return numOfStudents;
    }

//    // picks random index out of the list of possible answer choices and returns it
//    public int getSubmission(int length) {
//        return rand.nextInt(length);
//    }

    // generates a random number of students
    public int generateStudentID() {
        studentID = rand.nextInt(highestID - lowestID) + lowestID;
        return studentID;
    }
}
