import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 5, 4, 6, 7, 1};
        printArray(array);
        System.out.println();
        System.out.print("Nhập vị trí cần xóa trong mảng: ");
        int index = scanner.nextInt();
    }

    public static void printArray(int[] array) {
        System.out.print("Mảng: " + "\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
