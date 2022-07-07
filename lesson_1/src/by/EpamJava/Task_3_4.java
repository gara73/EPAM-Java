package by.EpamJava;

public class Task_3_4 {
    public static void main(String[] args) {
        long sum = 1;
        for (int i = 1;  i < 201; i++)
            sum = sum * (long)Math.pow(i, 2);
        System.out.print(sum);
    }
}
