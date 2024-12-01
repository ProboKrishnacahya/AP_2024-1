import java.util.Scanner;

public class Nomor6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Masukkan ukuran array (minimal 3): ");
            size = scanner.nextInt();
        } while (size < 3);

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Masukkan angka untuk indeks ke-" + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Angka yang dimasukkan:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.print("Indeks ke- berapa yang ingin dijumlahkan lebih dulu? ");
        int index1 = scanner.nextInt();
        System.out.print("Indeks ke- berapa yang ingin dijumlahkan setelahnya? ");
        int index2 = scanner.nextInt();

        int sum = numbers[index1] + numbers[index2];
        System.out
                .println("Hasil penjumlahan angka dari indeks ke-" + index1 + " dan ke-" + index2 + " adalah = " + sum);

        scanner.close();
    }
}