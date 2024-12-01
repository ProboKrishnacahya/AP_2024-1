// import java.util.Scanner;

// public class FibonacciSequence {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         char opsi;

//         do {
//             System.out.print("Masukkan panjang deret Fibonacci: ");
//             int length = scanner.nextInt();

//             int a = 0, b = 1;
//             if (length >= 1) {
//                 System.out.print(a); // Print first number
//             }
//             if (length >= 2) {
//                 System.out.print(" " + b); // Print second number
//             }

//             // Loop to print the rest of the Fibonacci sequence
//             for (int i = 3; i <= length; i++) {
//                 int next = a + b;
//                 System.out.print(" " + next);
//                 a = b;
//                 b = next;
//             }

//             System.out.println(); // Move to the next line after printing the series

//             // Ask if the user wants to continue
//             System.out.print("Lanjutkan? (Y/N): ");
//             opsi = scanner.next().charAt(0);
//         } while (opsi == 'Y' || opsi == 'y');

//         scanner.close();
//     }
// }

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        char opsi;

        do {
            System.out.println("Masukan angka");
            int length = scanner.nextInt();

            int x = 0, y = 1;

            if (length >= 1) {
                System.out.println(x);
            }

            if (length >= 2) {
                System.out.println(" " + y);
            }

            for (int i = 3; i <= length; i++) {
                int next = x + y;
                System.out.println(" " + next);
                x = y;
                y = next;
            }
            System.out.println();
            System.out.println("Continue?");
            opsi = scanner.next().charAt(0);

        } while (opsi == 'y' || opsi == 'Y');
    }
}