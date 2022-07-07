package by.EpamJava;

import java.util.Scanner;

public class Task_2_2 {
    public static void main(String[] args) {
        float a,b,c,d;
        Scanner in = new Scanner(System.in);
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        d = in.nextFloat();
        if (a > b) a = b;
        if (c > d) c = d;
        if (a < c) a = c;
        System.out.print(a);
    }
}
