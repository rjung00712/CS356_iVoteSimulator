import java.util.ArrayList;

public class SimulationDriver {


    public static void main(String[] args) {


        IVoteService iv = new IVoteService();
//        System.out.println(iv.generateStudents());

        ArrayList<Student> list = iv.getList();
        System.out.println(list);

        Student s = new Student(30);
        s.test();
    }

}
