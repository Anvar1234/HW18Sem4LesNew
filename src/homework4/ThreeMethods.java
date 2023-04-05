package homework4;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый
 * элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
 */
public class ThreeMethods {

    //enqueue() - метод помещает элемент в конец очереди.
    public static void enqueue(LinkedList<Integer> linkLArray) {
        LinkedList<Integer> tempA = new LinkedList<>(linkLArray);
        tempA.addLast(555);
        System.out.println("Добавление в конец очереди: ");
        System.out.println(tempA+"\n");
    }

    //dequeue() - возвращает первый элемент из очереди и удаляет его.
    public static void dequeue(LinkedList<Integer> linkLArray) {
        LinkedList<Integer> tempB = new LinkedList<>(linkLArray);
        System.out.println("Первый элемент из очереди с последующ удалением: ");
        System.out.println(tempB.pollFirst());
        System.out.println("Очередь без первого элемента: ");
        System.out.println(tempB+"\n");
    }

    //first() - возвращает первый элемент из очереди, не удаляя.
    public static void first(LinkedList<Integer> linkLArray) {
        LinkedList<Integer> tempC = new LinkedList<>(linkLArray);
        System.out.println("Первый элемент из очереди, не удаляя: ");
        System.out.println(tempC.peekFirst());
        System.out.println("Очередь: ");
        System.out.println(tempC);
    }

}
