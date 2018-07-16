import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter values: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter values: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }

        System.out.print("Array 1: " + "\t");
        printArray(array1);
        System.out.println();
        System.out.print("Array 2: " + "\t");
        printArray(array2);

        System.out.println();
        System.out.print("Array 3: " + "\t");
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int j = array1.length; j < array3.length; j++) {
                array3[j] = array2[j-array1.length];
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
