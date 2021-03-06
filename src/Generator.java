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

    // constructor
    Generator() {
        rand = new Random();
    }

    // randomly generates the number of students
    public int generateStudents() {
        int numOfStudents;
        numOfStudents = rand.nextInt(maxNumStudents - minNumStudents) + minNumStudents;

        return numOfStudents;
    }

    // generates a random number of students
    public int generateStudentID() {
        studentID = rand.nextInt(highestID - lowestID) + lowestID;
        return studentID;
    }

    public int genNumOfSubmissions() {
        return rand.nextInt(3) + 1;
    }
}
