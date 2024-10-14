import java.util.Scanner;

public class Test01_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("실수 a:"); double a = stdIn.nextDouble();
        System.out.print("실수 b:"); double b = stdIn.nextDouble();

        double max = a > b ? a : b;
        
    }
}
