import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수 A:"); int a = stdIn.nextInt();
        System.out.print("정수 B:"); int b = stdIn.nextInt();
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }

        do {
            System.out.print(a + " ");
            a += 1;
        } while (a <= b);
        System.out.println();

    }
}
