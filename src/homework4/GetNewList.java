package homework4;

import java.util.*;

public class GetNewList {
    public static LinkedList<Integer> getArray() {
        System.out.print("Введите длину массива N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Введите максимальное значение массива: ");
        int max = sc.nextInt();

        LinkedList<Integer> arrayLL = new LinkedList<>();
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            arrayLL.add(i, r.nextInt(max + 1));
        }
        sc.close();
        return arrayLL;
    }

}