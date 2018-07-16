import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter values: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println();

        int temp1 = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp1 = array[j];
                    array[j] = array[i];
                    array[i] = temp1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println();

        int temp2 = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp2 = array[j];
                    array[j] = array[i];
                    array[i] = temp2;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}