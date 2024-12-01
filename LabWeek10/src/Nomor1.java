import java.util.Scanner;

public class Nomor1 {
    // Count the total characters in a word
    public int countCharacters(String word) {
        return word.length();
    }

    // Count the total words in a sentence
    public int countWords(String sentence) {
        String[] words = sentence.split(" ");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Nomor1 nomor1 = new Nomor1();

        while (true) {
            System.out.print("\nMasukkan nama lengkap (ketik 'q' untuk keluar): ");
            String fullName = scanner.nextLine();

            // Exit the program if the user types 'q'
            if (fullName.equalsIgnoreCase("q")) {
                System.out.println("Program selesai");
                break;
            }

            System.out.print("Masukkan kata yang dicari: ");
            String searchWord = scanner.nextLine();

            // Count the total words in the full name
            int wordCount = nomor1.countWords(fullName);

            // Check if the search word is contained in the full name
            if (fullName.contains(searchWord)) {
                int charCount = nomor1.countCharacters(searchWord);
                System.out.println("Total karakter dari " + searchWord + " = " + charCount);
            } else {
                System.out.println("Total karakter dari " + searchWord + " = Tidak ditemukan");
            }

            System.out.println("Total kata dari " + fullName + " = " + wordCount);
        }
    }
}