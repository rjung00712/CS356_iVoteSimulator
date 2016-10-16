/**
 * Created by Richard on 10/12/16.
 */

// This is the iVote Service interface
public interface IVoteService_Interface {

    // shows the question and its type
    void displayQuestion(Question q);

    // shows the answer choices
    void displayChoices(Question q);

    // shows the results of student answers
    void displayStatistics(Question q);

    // accepts student answer submissions
    void acceptSubmissions(Question q);
}
