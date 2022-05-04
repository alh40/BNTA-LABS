package _4_todo;

import java.util.ArrayList;
import java.util.List;

public class WildcardsExample{

    void printNames_allFamily(List<? super Child> allFamily) {
        System.out.println(allFamily);
    }
    void printNames_grampasAndFathersOnly(List<? super Father> grampasAndFathers) {
        System.out.println(grampasAndFathers);
    }

    void printNames_fathersAndChildrenOnly(List<? extends Father> fathersAndChildren) {
        System.out.println(fathersAndChildren);
    }


}
