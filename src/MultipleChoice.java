/**
 * Created by Richard on 10/12/16.
 */
public class MultipleChoice extends Question {

    private String question;
    private String answer;

    // constructor
    public MultipleChoice(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    @Override
    public MultipleChoice getQuestionAndAnswer() {
        return this;
    }

//    public String getQuestion() {
//        return this.question;
//    }
}
