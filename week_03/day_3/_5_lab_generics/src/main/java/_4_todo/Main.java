package _4_todo;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Grampa> grampas = List.of(
                new Grampa("Christopher"),
                new Grampa("Theodore"),
                new Grampa("Rudolph")
        );

        List<Father> fathers = List.of(
                new Father("Max"),
                new Father("Christopher"),
                new Father("Andrew")
        );

        List<Child> children = List.of(
                new Child("Henry"),
                new Child("Owen"),
                new Child("Noah")
        );

        WildcardsExample wildEx = new WildcardsExample();

        wildEx.printNames_allFamily(grampas);
        wildEx.printNames_allFamily(fathers);
        wildEx.printNames_allFamily(children);

        wildEx.printNames_fathersAndChildrenOnly(fathers);
        wildEx.printNames_fathersAndChildrenOnly(children);

        wildEx.printNames_grampasAndFathersOnly(grampas);
        wildEx.printNames_grampasAndFathersOnly(fathers);
    }
}
