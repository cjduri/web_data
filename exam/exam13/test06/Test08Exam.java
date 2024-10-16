package test06;

import java.util.Scanner;

public class Test08Exam {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("좌표는 몇 개:");
        int n = stdIn.nextInt();

        Coordinate[] a = new Coordinate[n];

        System.out.println("1");

        for(int i=0; i<a.length; i++)
            a[i].set(5.5, 7.7);

        System.out.println("2");

        for(int i=0; i<a.length; i++)
            System.out.printf("a[%d] = (%.1f, %.1f)\n", i, a[i].getX(), a[i].getY());
    }
}
