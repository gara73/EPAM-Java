package by.EpamJava;

import java.util.Scanner;

public class Task_3_8 {
    public static void main(String[] args) {
        int m, n;
        int[] ind = new int[10];
        Scanner in = new Scanner(System.in);
        m = Math.abs(in.nextInt());
        n = Math.abs(in.nextInt());

        String str1 = String.valueOf(m), str2 = String.valueOf(n);

        for (int i = 0; i < str1.length(); i++){
            m = (int)str2.indexOf(str1.charAt(i));
            if (m != -1)
                ind[m] = 1;
        }

        for (int i = 0; i < 10; i++){
            if (ind[i] == 1)
                System.out.print(i + 1 + " ");
        }
    }
}