import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Richard on 10/13/16.
 */
// this class holds the possible answer choices
public class PossibleAnswers {

    private static final List<String> multChoices = Collections.unmodifiableList(new ArrayList<String>() {{
        add("A");
        add("B");
        add("C");
        add("D"); }});

    private static final List<String> tfChoices = Collections.unmodifiableList(new ArrayList<String>() {{
        add("Right");
        add("Wrong"); }});

    public PossibleAnswers()  {}

    // returns the multiple choice selections
    public List getMultChoices() { return multChoices; }

    // returns the single choice selections
    public List getTFChoices() {
        return tfChoices;
    }
}
