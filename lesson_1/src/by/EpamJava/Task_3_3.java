package by.EpamJava;

public class Task_3_3 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1;  i < 101; i++)
            sum = sum + (long)Math.pow(i, 2);
        System.out.print(sum);
    }
}
