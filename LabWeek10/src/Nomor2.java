import java.util.Scanner;

public class Nomor2 {
    public String reverseAndUppercase(String input) {
        String reversed = "";
        // Reverse the input string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        // Convert the reversed string to uppercase
        return reversed.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Nomor2 nomor2 = new Nomor2();

        while (true) {
            System.out.print("\nMasukkan kata (ketik 'q' untuk keluar): ");
            String input = scanner.nextLine();

            // Exit the program if the user types 'q'
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Program selesai");
                System.exit(0);
            }

            // Reverse the input string and convert it to uppercase
            String result = nomor2.reverseAndUppercase(input);

            // Print the result after trimming the trailing whitespace
            System.out.println("Hasil = " + result.trim());            
        }
    }
}