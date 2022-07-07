package by.EpamJava;

import java.util.Scanner;

public class Task_1_4 {
    public static void main(String[] args) {
        double R;
        Scanner in = new Scanner(System.in);
        R = in.nextDouble();
        R = (Math.round(R % 1 * 1000)) + (int)R / (double)1000;
        System.out.printf("%.3f",R);
    }
}