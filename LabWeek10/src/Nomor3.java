import java.util.Scanner;

public class Nomor3 {
    public boolean isPalindrome(String word) {
        // Loop through the first half of the input
        for (int i = 0; i < word.length() / 2; i++) {
            // Compare the character at index i with the character at the opposite index
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Nomor3 nomor3 = new Nomor3();

        while (true) {
            System.out.print("\nMasukkan kata (ketik 'q' untuk keluar): ");
            String input = scanner.nextLine();

            // Exit the program if the user types 'q'
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Program selesai");
                System.exit(0);
            }

            // Check if the input is a palindrome
            boolean result = nomor3.isPalindrome(input);
            
            if (result) {
                System.out.println("Hasil = True");
            } else {
                System.out.println("Hasil = False");
            }
        }
    }
}