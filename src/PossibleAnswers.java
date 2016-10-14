import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Richard on 10/13/16.
 */
public class PossibleAnswers {

    private static final List<String> multChoices = Collections.unmodifiableList(new ArrayList<String>() {{
        add("A");
        add("B");
        add("C");
        add("D"); }});

    private static final List<String> tfChoices = Collections.unmodifiableList(new ArrayList<String>() {{
        add("Right");
        add("Wrong"); }});

    PossibleAnswers()  {}

    public List getMultChoices() {
        return multChoices;
    }

    public List getTFChoices() {
        return tfChoices;
    }
}
