public class SimulationDriver {

    public static void main(String[] args) {
        IVoteService iv = new IVoteService();

//        IVoteService iv2 = new IVoteService();

        Question q = new MultipleChoice("Who is the " +
                "professor for CS 356?", "Dr. Yu Sun");

        Question r = new SingleChoice("Richard will get an A " +
                "on this project", "Right");

        iv.displayQuestion(q);
        iv.displayAnswer(q);
        iv.displayChoices(q);
        iv.acceptSubmissions(q);
        iv.displayStatistics(q);
        System.out.println();

        System.out.println();

        iv.displayQuestion(r);
        iv.displayAnswer(r);
        iv.displayChoices(r);
        iv.acceptSubmissions(r);
        iv.displayStatistics(r);
        System.out.println();

//        iv2.displayQuestion(r);
//        iv2.displayAnswer(r);
//        iv2.displayChoices(r);
//        iv2.acceptSubmissions(r);
//        iv2.displayStatistics(r);
//        System.out.println();
    }
}
