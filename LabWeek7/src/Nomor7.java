import java.util.Scanner;

public class Nomor7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] titles = new String[100];
        int[] prices = new int[100];
        int count = 0;

        while (true) {
            System.out.println("\nWelcome to Catat Saku Program");
            System.out.println("=========================");
            System.out.println("0. Finish");
            System.out.println("1. Add Catatan");
            System.out.println("2. Show Catatan");
            System.out.print("Input: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 0) {
                System.out.println("Selamat tinggal");
                break;
            } else if (option == 1) {
                System.out.print("Masukkan judul: ");
                titles[count] = scanner.nextLine();
                System.out.print("Masukkan harga: ");
                prices[count] = scanner.nextInt();
                count++;
            } else if (option == 2) {
                int total = 0;
                System.out.println("No   Judul          Harga");
                for (int i = 0; i < count; i++) {
                    System.out.printf("%d    %-15s %d\n", i + 1, titles[i], prices[i]);
                    total += prices[i];
                }
                System.out.println("Total = " + total);
            } else {
                System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
        scanner.close();
    }
}