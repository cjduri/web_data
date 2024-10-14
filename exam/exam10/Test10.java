import java.util.Scanner;

public class Test10 {
    static void printBits(int x) {
        for(int i=31; i>=0; i--)
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }

    static int rRotate(int x, int n) {
        if(n < 0) return lRotate(x, -n);
        n %= 32;
        return (n == 0 ? x : (x >>> n) | (x << (32 - n)));
    }

    static int lRotate(int x, int n) {
        if(n < 0) return rRotate(x, -n);
        n %= 32;
        return (n == 0 ? x : (x << n) | (x >>> (32 -n)));
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수x를 n비트 회전합니다.");
        System.out.print("x:"); int x = stdIn.nextInt();
        System.out.print("n:"); int n = stdIn.nextInt();
        System.out.println("회전 전 = "); printBits(x);

        System.out.println("\n오른쪽 회전 = "); printBits(rRotate(x, n));
        System.out.println("\n왼쪽 회선 = "); printBits(lRotate(x, n));
        System.out.println();
    }
}
