package by.EpamJava;

import java.util.Scanner;

public class Task_2_1 {
    public static void main(String[] args) {
        double x, y, z;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        y = in.nextDouble();
        z = 180 - x - y;
        if ((z > 0) && (x > 0) && (y > 0)){
            if ((x == 90) || (y == 90) || (z == 90))
                System.out.println("Существует. Прямоугольный");
            else
                System.out.println("Существует. Непрямоугольный");
        }
        else
            System.out.println("Не существует");
    }
}
