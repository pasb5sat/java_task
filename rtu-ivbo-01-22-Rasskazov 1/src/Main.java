import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int factorial(int f){
        int factorial = 1;
        for (int i = 1; i <= f; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println("ЗАДАНИЕ 3 " );
        int[] Array = {20,40};
        System.out.println(Arrays.toString(Array));
        double sum=0;
        for (int i = 0; i < Array.length ; i++) {
            sum = sum + Array[i];
        }
        double arsum= sum/Array.length;
        System.out.println(String.valueOf(sum));
        System.out.println(String.valueOf(arsum));

        System.out.println("ЗАДАНИЕ 4 " );
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер: " );
        int size = input.nextInt();
        int[] Array1 = new int[size];
        System.out.println("Введите элементы массива: " );
        for (int i = 0; i < size ; i++) {
            Array1[i] = input.nextInt();
        }
        int j=0;
        double sum1=0;
        do{
            sum1 = sum1 + Array1[j];
            j++;
        }
        while (j<size);
        System.out.println("Cумма: " + sum1);
        int min = Arrays.stream(Array1).min().getAsInt();
        int max = Arrays.stream(Array1).max().getAsInt();
        System.out.println("Минимальное: " + min);
        System.out.println("Максимальное: " + max);

        System.out.println("ЗАДАНИЕ 5 " );
        int X = 1;
        for (String arg : args) {
            System.out.println("Аргумент " + X + ": " + arg);
            X++;
        }
        System.out.println("ЗАДАНИЕ 6 " );
        System.out.println("Первые 10 чисел гармонического ряда: " );
        for (int i = 1; i < 11; i++) {
            System.out.println(1./i);
        }
        System.out.println("ЗАДАНИЕ 7 " );
        Scanner number = new Scanner(System.in);
        System.out.println("Введите число : " );
        int size1 = number.nextInt();
        System.out.println("Факториал этого числа: " + factorial(size1));
    }

}