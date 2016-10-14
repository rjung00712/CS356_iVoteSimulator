/**
 * Created by Richard on 10/12/16.
 */
public class Student {

    private int id;      // student's ID as a string
    private String submission;  // student's answer submission

    Student() {}

    Student(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void test() {
        Question q = new MultipleChoice("this", "that");
        if(q instanceof MultipleChoice) {

        } else {

        }
    }

    public String print() {
        return Integer.toString(id);
    }

}
