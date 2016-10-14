/**
 * Created by Richard on 10/13/16.
 */
public class SingleChoice extends Question {

    // question and its answer
    private String question;
    private String answer;

    // constructor
    public SingleChoice(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    // returns the object with the question and the variable
    @Override
    public SingleChoice getQuestionAndAnswer() {
        return this;
    }


//    @Override
//    public String getQuestion()  {
//        return this.question;
//    }

}
