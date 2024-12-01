import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ukuran array: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Masukkan kata pada indeks " + i + ": ");
            words[i] = scanner.nextLine();
        }

        for (int i = 0; i < words.length; i++) {
            int vowelCount = 0;

            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].toLowerCase().charAt(j);
                if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
                    vowelCount++;
                }
            }

            System.out.println("Jumlah huruf vokal dalam kata \"" + words[i] + "\" : " + vowelCount);
        }

        scanner.close();
    }
}