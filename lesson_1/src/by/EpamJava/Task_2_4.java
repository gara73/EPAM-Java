package by.EpamJava;

import java.util.Scanner;

public class Task_2_4 {
    public static void main(String[] args) {
        double A, B, x, y, z;
        Scanner in = new Scanner(System.in);
        A = in.nextDouble();
        B = in.nextDouble();
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        if ((A <= x) && ((B <= y) || (B <= z)))
            System.out.print("Yes");
        else if ((A <= y) && ((B <= x) || (B <= z)))
            System.out.print("Yes");
        else if ((A <= z) && ((B <= x) || (B <= y)))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
