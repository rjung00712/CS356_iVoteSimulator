import java.util.Random;

/**
 * Created by Richard on 10/13/16.
 */
public class Generator {

    // range for number of students
    private static final int minNumStudents = 10;
    private static final int maxNumStudents = 40;

    // number range for student id
    private static final int highestID = 99999;
    private static final int lowestID = 11111;

    private Random rand;

    private int studentID;
    private int numOfStudents;

    public Generator() {
        rand = new Random();

        numOfStudents = generateStudents();
    }

    // randomly generates the number of students
    public int generateStudents() {
        numOfStudents = rand.nextInt(maxNumStudents - minNumStudents) + minNumStudents;
        return numOfStudents;
    }

    private int generateStudentID() {
        studentID = rand.nextInt(highestID - lowestID) + lowestID;
        return studentID;
    }

    public void arrangeStudents() {
        int i;
        int id = generateStudentID();

        while(students.size() != numOfStudents) {
            if(isInList(id)) {
                id = generateStudentID();
            } else {
                students.add(new Student(id));
            }
        }
    }

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
