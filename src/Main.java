import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] weights = {1.57, 7.654, 9.986};

        double[] temperatures = {36.6, 36.5, 37.0, 37.1};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int index = 0; index < arr.length; index++) {
            if (index == arr.length - 1) {
                System.out.print(arr[index]);
                break;
            }
            System.out.print(arr[index] + ", ");
        }
        System.out.println();

        double[] weights = {1.57, 7.654, 9.986};
        for (int i = 0; i < weights.length; i++) {
            if (i == weights.length - 1) {
                System.out.print(weights[i]);
                break;
            }
            System.out.print(weights[i] + ", ");
        }
        System.out.println();

        double[] temperatures = {36.6, 36.5, 37.0, 37.1};
        for (int i = 0; i < temperatures.length; i++) {
            if (i == temperatures.length - 1) {
                System.out.print(temperatures[i]);
                break;
            }
            System.out.print(temperatures[i] + ", ");
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int index = arr.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(arr[index]);
                break;
            }
            System.out.print(arr[index] + ", ");
        }
        System.out.println();

        double[] weights = {1.57, 7.654, 9.986};
        for (int i = weights.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(weights[i]);
                break;
            }
            System.out.print(weights[i] + ", ");
        }
        System.out.println();

        double[] temperatures = {36.6, 36.5, 37.0, 37.1};
        for (int i = temperatures.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(temperatures[i]);
                break;
            }
            System.out.print(temperatures[i] + ", ");
        }
    }

    public static void task4() {
        System.out.println();
        System.out.println("Задача 4");
        int[] numbers = {1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i]++;
            }
        }
        System.out.print(Arrays.toString(numbers) + " ");
    }
}