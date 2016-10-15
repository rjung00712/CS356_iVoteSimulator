import java.util.ArrayList;

/**
 * Created by Richard on 10/12/16.
 */
// This is the main class that manages the utility and component class of
// the whole iVote System
public class IVoteService implements IVoteService_Interface {

//    public ArrayList<Student> students;

    IVoteService() {
//        students = new ArrayList<>();
    }

    @Override
    public void displayQuestion(Question question) {
        System.out.println("This is the question:");
        System.out.println(question.getQuestion());
        System.out.println("Correct Answer: " + question.getAnswer());
    }

    @Override
    public void displayStatistics() {

    }

    @Override
    public void acceptSubmissions() {

    }

    @Override
    public void arrangeQuestions() {

    }
}
