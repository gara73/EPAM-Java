package by.EpamJava;

import java.util.Scanner;

public class Task_3_1 {
    public static void main(String[] args) {
        int x, sum = 0;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        for (int i = 1; i < x; i++)
            sum = sum + i;
        System.out.print(sum);
    }
}
