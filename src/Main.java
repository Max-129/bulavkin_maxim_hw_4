import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Заполните список A");

        for (int i = 0; i < 5; i++) {
            String score = scanner.next();
            A.add(score);
        }

        System.out.println("Заполните список B");

        for (int i = 0; i < 5; i++) {
            String score = scanner.next();
            B.add(score);
        }
        C.addAll(A);
        C.add(1, B.get(4));
        C.add(3, B.get(3));
        C.add(5, B.get(2));
        C.add(7, B.get(1));
        C.add(9, B.get(0));

        System.out.println(C);

        Collections.sort(C, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(C);
    }


}