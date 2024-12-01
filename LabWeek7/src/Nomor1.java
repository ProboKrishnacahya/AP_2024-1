import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        int[] numbers = new int[size]; // Simpan angka sebanyak size
        for (int i = 0; i < size; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // Simpan angka ke-i
        }

        // Tampilkan angka yang dimasukkan dengan perulangan for-each
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}