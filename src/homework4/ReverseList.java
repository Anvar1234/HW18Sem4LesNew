package homework4;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */

public class ReverseList {
    public static void reversList(LinkedList<Integer> linkLArray) {

        Collections.reverse(linkLArray);
        System.out.println(linkLArray);

    }
}
