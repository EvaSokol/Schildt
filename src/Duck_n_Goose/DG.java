package Duck_n_Goose;

import java.util.ArrayList;
import java.util.List;

public class DG {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        clear(list);
        System.out.println(list);
    }

    static void clear(List<String> list) {
        list = new ArrayList<>();
    }

}
