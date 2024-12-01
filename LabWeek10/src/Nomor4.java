import java.util.Scanner;

public class Nomor4 {
    // Find the longest word in a sentence
    public String findLongestWord(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        // Assume the first word is the longest
        String longestWord = words[0];

        // Loop through the remaining words
        for (int i = 1; i < words.length; i++) {
            // Update the longest word if a longer word is found
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    // Replace the longest word in a sentence with a given replacement
    public String replaceLongestWord(String sentence, String longestWord, String replacement) {
        return sentence.replace(longestWord, replacement);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Nomor4 nomor4 = new Nomor4();

        while (true) {
            System.out.print("\nMasukkan kalimat (ketik 'q' untuk keluar): ");
            String input = scanner.nextLine();

            // Exit the program if the user types 'q'
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Program selesai");
                System.exit(0);
            }

            // Find the longest word in the input
            String longestWord = nomor4.findLongestWord(input);

            // Display the longest word
            System.out.println("Kata terpanjang = " + longestWord);

            // Prompt the user to enter a replacement for the longest word
            System.out.print("Masukkan angka untuk menggantikan kata terpanjang: ");
            String replacement = scanner.nextLine();

            // Replace the longest word with the replacement
            String updatedSentence = nomor4.replaceLongestWord(input, longestWord, replacement);

            // Display the updated sentence
            System.out.println("Kalimat baru setelah perubahan = " + updatedSentence);
        }
    }
}