import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ukuran array: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Masukkan kata pada indeks ke-" + i + ": ");
            words[i] = scanner.nextLine();
        }

        System.out.print("Masukkan indeks untuk mengganti kata: ");
        int indexToReplace = scanner.nextInt();
        scanner.nextLine();

        if (indexToReplace >= 0 && indexToReplace < size) {
            System.out.print("Masukkan kata pengganti: ");
            String newWord = scanner.nextLine();
            words[indexToReplace] = newWord;
        } else {
            System.out.println("Indeks tidak valid.");
        }

        System.out.print("Array setelah perubahan: ");
        for (String word : words) {
            System.out.print(word + " ");
        }

        scanner.close();
    }
}