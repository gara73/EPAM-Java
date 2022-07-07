package by.EpamJava;

import java.util.Scanner;

public class Task_1_5 {
    public static void main(String[] args) {
        int T, HH, MM, SS;
        Scanner in = new Scanner(System.in);
        T = in.nextInt();
        HH = T / 3600;
        T = T - HH * 3600;
        MM = T / 60;
        SS = T - MM * 60;
        System.out.print(HH + "ч " + MM + "мин " + SS + "c ");
    }
}
