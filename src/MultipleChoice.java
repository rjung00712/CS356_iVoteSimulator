/**
 * Created by Richard on 10/12/16.
 */
// this class abstracts the multiple choice type
public class MultipleChoice extends Question {

    private String question;
    private String answer;

    // constructor
    protected MultipleChoice(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    protected String getQuestion() {
        return this.question;
    }

    protected String getAnswer() {
        return this.answer;
    }
}
