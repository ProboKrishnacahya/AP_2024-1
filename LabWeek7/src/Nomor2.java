import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[5];

        for (int i = 0; i < words.length; i++) {
            System.out.print("Masukkan kata " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }

        for (String word : words) {
            System.out.println("Panjang kata " + word + " : " + word.length());
        }
        scanner.close();
    }
}