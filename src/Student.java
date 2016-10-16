import java.util.List;
import java.util.Random;

/**
 * Created by Richard on 10/12/16.
 *
 * This class represents the student and its attributes
 */
public class Student {

    // student attributes
    private int id;      // student's ID as a string
    private String submission;  // student's answer submission

    private Generator randomSubmission;

    private Classroom classObj;

    // default constructor
    Student() {
        classObj = new Classroom();
    }

    // constructor
    Student(int id) {
        this.id = id;
        randomSubmission = new Generator();
        classObj = new Classroom();
    }

    // returns the student's assigned id
    public int getId() {
        return this.id;
    }

    // this method checks the question format and
    // picks for student based on the format
    public void pickSubmission(Question questionType) {
        List<String> list = classObj.getChoices(questionType);
        this.submission = list.get(new Random().nextInt(list.size()));
    }

    public String getSubmission() {
        return this.submission;
    }
}
