package by.EpamJava;

import java.util.Scanner;

public class Task_3_7 {
    public static void main(String[] args) {
        int m, n;
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        for (int i = m; i <= n; i++){
            System.out.println("Делители числа" + i + ": ");
            for(int j = 2; j < i; j++)
                if (i % j == 0)
                    System.out.print(j + ", ");
            System.out.println();
        }
    }
}
