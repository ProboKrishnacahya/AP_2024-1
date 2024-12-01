import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ukuran array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Masukkan angka untuk indeks ke-" + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Elemen genap dalam array: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        scanner.close();
    }
}