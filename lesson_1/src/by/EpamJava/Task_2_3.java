package by.EpamJava;

import java.util.Scanner;

public class Task_2_3 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3;
        Scanner in = new Scanner(System.in);
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        x3 = in.nextDouble();
        y3 = in.nextDouble();
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
