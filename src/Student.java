import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Richard on 10/12/16.
 *
 * This class represents the student and its attributes
 */
public class Student {

    // student attributes
    private int id;      // student's ID as a string
    private String submission;  // student's answer submission

    private PossibleAnswers possibleAnswers;
    private GenerateRandom randomSubmission;

    // default constructor
    Student() {}

    // constructor
    Student(int id) {
        this.id = id;
        possibleAnswers = new PossibleAnswers();
        randomSubmission = new GenerateRandom();
    }

    // returns the student's assigned id
    public int getId() {
        return this.id;
    }

    // this method checks the question format and
    // picks for student based on the format
    public void pickSubmission(Question questionType) {
        List<String> list;
        if(questionType instanceof MultipleChoice) {
            list = possibleAnswers.getMultChoices();
        } else {
            list = possibleAnswers.getTFChoices();
        }

        this.submission = list.get(randomSubmission.getSubmission(list.size()));
    }

    public String getSubmission() {
        return this.submission;
    }

    public String print() {
        return Integer.toString(id);
    }

}
