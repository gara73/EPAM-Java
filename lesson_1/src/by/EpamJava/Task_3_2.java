package by.EpamJava;

import java.util.Scanner;

public class Task_3_2 {
    public static void main(String[] args) {
        double a,b,h,sum = 0;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        h = in.nextDouble();

        if (a < b){
            while (a <= b){
                if (a > 2)
                    sum = sum + a;
                else
                    sum = sum - a;
                a = a + h;
            }
        }
        else{
            while (a >= b){
                if (a > 2)
                    sum = sum + a;
                else
                    sum = sum - a;
                a = a + h;
            }
        }

        System.out.print(sum);
    }
}
