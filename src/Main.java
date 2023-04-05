import homework4.GetNewList;
import homework4.ReverseList;
import homework4.ThreeMethods;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer> newLL1 = new LinkedList<>(GetNewList.getArray());
//        System.out.println("Первоначальный список_1: ");
//        System.out.println(newLL1);
//        System.out.println("Реверсивный список_1: ");
//        ReverseList.reversList(newLL1);

        LinkedList<Integer> newLL2 = new LinkedList<>(GetNewList.getArray());
        System.out.println("Первоначальный список_2: ");
        System.out.println(newLL2);

        ThreeMethods.enqueue(newLL2);

        ThreeMethods.dequeue(newLL2);

        ThreeMethods.first(newLL2);


    }
}