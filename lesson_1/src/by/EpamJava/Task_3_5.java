package by.EpamJava;

import java.util.Scanner;

public class Task_3_5 {
    public static void main(String[] args) {
        double e, sum = 0;
        Scanner in = new Scanner(System.in);
        e = in.nextDouble();
        for (int i = 1; i < 4; i++)
            sum = sum + 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
        if (sum >= e)
            System.out.print(sum);
    }
}