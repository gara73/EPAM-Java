package by.EpamJava;

import java.util.Scanner;

public class Task_2_5 {
    public static void main(String[] args) {
        double x;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        if (x <= 3)
            System.out.print(Math.pow(x, 2) - 3 * x + 9);
        else
            System.out.print(1 / (Math.pow(x,3) + 6));
    }
}
