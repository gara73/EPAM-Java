package by.EpamJava;

import java.util.Scanner;

public class Task_1_3 {
    public static void main(String[] args) {
        double x, y, z;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        y = in.nextDouble();
        z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
        System.out.print(z);
    }
}
