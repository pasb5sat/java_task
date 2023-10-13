import java.util.Arrays;

public class Random {
    public static void main(String[] args) {
        int size = 10;
        double[] randomArray1 = new double[size];
        for (int i = 0; i < size; i++) {
            randomArray1[i] = Math.random();
        }
        System.out.println("Массив, созданный с использованием Math.random():");
        printArray(randomArray1);

        Arrays.sort(randomArray1);

        System.out.println("Отсортированный массив (с использованием Math.random()):");
        printArray(randomArray1);

        // Создание массива с использованием класса Random
        double[] randomArray2 = new double[size];
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < size; i++) {
            randomArray2[i] = random.nextDouble();
        }

        System.out.println("Массив, созданный с использованием класса Random:");
        printArray(randomArray2);

        Arrays.sort(randomArray2);

        System.out.println("Отсортированный массив (с использованием класса Random):");
        printArray(randomArray2);
    }

    // Метод для вывода массива на экран
    public static void printArray(double[] arr) {
        for (double value : arr) {
            System.out.println(value);
        }
        System.out.println();
    }
}