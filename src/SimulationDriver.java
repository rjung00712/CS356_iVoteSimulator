import java.util.ArrayList;

public class SimulationDriver {


    public static void main(String[] args) {


        IVoteService iv = new IVoteService();
//        System.out.println(iv.generateStudents());

//        ArrayList<Student> list = iv.getList();
//        System.out.println(list);

        Question q = new MultipleChoice("Who is the " +
                "professor for CS 356? ", "Dr. Yu Sun");

//        Student s = new Student(30);
//        s.pickSubmission(q);

        iv.displayQuestion(q);
    }

}
