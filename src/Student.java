import java.util.List;
import java.util.Random;

/**
 * Created by Richard on 10/12/16.
 */
// This class represents the student and its attributes
public class Student {

    // student attributes
    private int id;      // student's ID as a string
    private String submission;  // student's answer submission

    private Classroom classObj;

    private Generator g;

    // default constructor
    Student() {
        classObj = new Classroom();
    }

    // constructor
    Student(int id) {
        this.id = id;
        classObj = new Classroom();
        g = new Generator();
    }

    // returns the student's assigned id
    public int getId() {
        return this.id;
    }

    // this method checks the question format and random number of submissions
    // for each student picks for student based on the format
    public void pickSubmission(Question questionType) {
        List<String> list = classObj.getChoices(questionType);

        int numOfSubmissions = g.genNumOfSubmissions();

        for(int i = 0; i < numOfSubmissions; i++) {
            this.submission = list.get(new Random().nextInt(list.size()));
        }
    }

    // returns this student's submission
    public String getSubmission() {
        return this.submission;
    }
}
