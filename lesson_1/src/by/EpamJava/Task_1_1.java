package by.EpamJava;

import java.util.Scanner;

public class Task_1_1 {
    public static void main(String[] args) {
    float a,b,c,z;
    Scanner in = new Scanner(System.in);
    a = in.nextFloat();
    b = in.nextFloat();
    c = in.nextFloat();
    z = ((a - 3) * b / 2) + c;
    System.out.print(z);
    }
}
