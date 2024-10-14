import java.util.Scanner;

public class Test02 {
    static void printBits(int x) {
        for(int i=31; i>=0; i--)
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }

    static int setN(int x, int pos, int n) {
        return x | (~(~0 << n) << pos);
    }

    static int resetN(int x, int pos, int n) {
        return x & ~(~(~0 << n) << pos);
    }

    static int inverseN(int x, int pos, int n) {
        return x ^ (~(~0 << n) << pos);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("정수x의 pos번째 비트부터 n개 비트를 변경합니다.");
        System.out.print("x   : "); int x = stdIn.nextInt();
        System.out.print("pos : "); int pos = stdIn.nextInt();
        System.out.print("n   : "); int n = stdIn.nextInt();

        System.out.print("b                   = 10987654321098765432109876543210");
        System.out.print("\nx                   = "); printBits(x);
        System.out.print("\nsetN(x, pos, n)     = "); printBits(setN(x, pos, n));
        System.out.print("\nresetN(x, pos, n)   = "); printBits(resetN(x, pos, n));
        System.out.print("\ninverseN(x, pos, n) = "); printBits(inverseN(x, pos, n));
        System.out.println();
        System.out.println((~0) + ", " + (0 << 6) + ", " + (~0 << 6));
    }
}
