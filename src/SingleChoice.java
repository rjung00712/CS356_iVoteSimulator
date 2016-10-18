/**
 * Created by Richard on 10/13/16.
 */
// this class holds the single choice abstraction
public class SingleChoice extends Question {

    // question and its answer
    private String question;
    private String answer;

    // constructor
    protected SingleChoice(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    @Override
    protected String getQuestion()  {
        return this.question;
    }

    @Override
    protected String getAnswer() {
        return this.answer;
    }

}
