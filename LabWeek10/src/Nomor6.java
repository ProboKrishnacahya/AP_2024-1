import java.util.Scanner;

public class Nomor6 {
    public String encrypt(String text, int shift) {
        String encryptedText = "";
        // Loop through each character in the text
        for (int i = 0; i < text.length(); i++) {
            // Get the character at index i
            char character = text.charAt(i);
            // Check if the character is a letter
            if (character >= 'a' && character <= 'z') {
                // Encrypt for lowercase letters
                character = (char) ((character - 'a' + shift) % 26 + 'a');
            } else if (character >= 'A' && character <= 'Z') {
                // Encrypt for uppercase letters
                character = (char) ((character - 'A' + shift) % 26 + 'A');
            }
            // Add the encrypted character to encryptedText
            encryptedText += character;
        }
        return encryptedText;
    }

    public String decrypt(String text, int shift) {
        String decryptedText = "";
        // Loop through each character in the text
        for (int i = 0; i < text.length(); i++) {
            // Get the character at index i
            char character = text.charAt(i);
            // Check if the character is a letter
            if (character >= 'a' && character <= 'z') {
                // Decrypt for lowercase letters
                character = (char) ((character - 'a' - shift + 26) % 26 + 'a');
            } else if (character >= 'A' && character <= 'Z') {
                // Decrypt for uppercase letters
                character = (char) ((character - 'A' - shift + 26) % 26 + 'A');
            }
            // Add the decrypted character to decryptedText
            decryptedText += character;
        }
        return decryptedText;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Nomor6 nomor6 = new Nomor6();

        int choice = 0;

        while (choice != 3) {
            System.out.println("\n1. Enkripsi");
            System.out.println("2. Dekripsi");
            System.out.println("3. Exit");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                // Encrypt
                System.out.print("Masukkan pesan: ");
                String text = scanner.nextLine();
                System.out.print("Masukkan jumlah kunci pergeseran: ");
                int shift = scanner.nextInt();

                String encryptedText = nomor6.encrypt(text, shift);
                System.out.println("Ciphertext = " + encryptedText);
            } else if (choice == 2) {
                // Decrypt
                System.out.print("Masukkan ciphertext: ");
                String text = scanner.nextLine();
                System.out.print("Masukkan jumlah kunci pergeseran: ");
                int shift = scanner.nextInt();

                String decryptedText = nomor6.decrypt(text, shift);
                System.out.println("Teks dekripsi = " + decryptedText);
            } else if (choice == 3) {
                System.out.println("Program selesai");
            } else {
                System.out.println("Pilihan tidak valid. Harus di antara 1 hingga 3");
            }
        }

        scanner.close();
    }
}