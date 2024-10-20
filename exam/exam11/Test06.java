import java.util.Scanner;

public class Test06 {
    static int aryRmv(int[] a, int idx) {
        if (idx>=0 && idx<a.length) {
            for (int i = idx; i < a.length - 1; i++)
                a[i] = a[i + 1];
            return a.length - 1;
        }
        return a.length;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 수:");
        int num = stdIn.nextInt();
        int[] a = new int[num];

        for(int i=0; i<num; i++) {
            System.out.print("a[" + i + "]:");
            a[i] = stdIn.nextInt();
        }

        System.out.print("삭제할 요소의 인덱스:");
        int idx = stdIn.nextInt();

        int k = aryRmv(a, idx);
        for(int i=0; i<k; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
