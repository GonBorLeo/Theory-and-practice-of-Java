package JavaCollectionsFramework.LinkedList;
/*
3. Напишите Java-программу для итерации по всем элементам в связанном списке, начиная с указанной позиции.
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_3_tlistIterator {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(colors);

        Iterator<String> p = colors.listIterator(0);
        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}
