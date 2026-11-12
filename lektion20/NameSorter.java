import java.util.*;

public class NameSorter implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.equals("Kalle")) {
            return -1;
        }
        else if (o2.equals("Kalle")) {
            return 1;
        }
        else {
            return o1.compareTo(o2);
        }
    }
    
}
