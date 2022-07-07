package by.EpamJava;

import java.util.Scanner;

public class Task_1_2 {
    public static void main(String[] args) {
        double a,b,c,z;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.print(z);
    }
}
