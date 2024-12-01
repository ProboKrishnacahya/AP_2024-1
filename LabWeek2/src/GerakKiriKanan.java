// public class TowerOfHanoi {
//     static void towerOfHanoi(int n, char source, char destination, char auxiliary) {
//         // Base case
//         if (n == 1) {
//             System.out.println("Take disk 1 from rod " + source + " to rod " + destination);
//             return;
//         }

//         // Recursive calls
//         towerOfHanoi(n - 1, source, auxiliary, destination);
//         System.out.println("Take disk " + n + " from rod " + source + " to rod " + destination);
//         towerOfHanoi(n - 1, auxiliary, destination, source);
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         towerOfHanoi(n, 'A', 'C', 'B');
//     }
// }

import java.util.Arrays;
import java.util.Scanner;

public class GerakKiriKanan {
    public static void main(String[] args) {
        char[] posisi = {'a', 'b', 'c', 'd'};
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan perintah (L/R): ");
        String perintah = scanner.nextLine().toUpperCase();
        
        if (!isValidInput(perintah)) {
            System.out.println("Input tidak valid. Gunakan hanya L atau R.");
            return;
        }
        
        for (int i = 0; i < perintah.length(); i++) {
            char ins = perintah.charAt(i);
            if (ins == 'L') {
                for (int index = 3; index > 0; index--) {
                    if (posisi[index - 1] == ' ') {
                        swap(posisi, index, index - 1);
                        break;
                    }
                }
            } else { // ins == 'R'
                for (int index = 0; index < 3; index++) {
                    if (posisi[index + 1] == ' ') {
                        swap(posisi, index, index + 1);
                        break;
                    }
                }
            }
            System.out.println("Setelah perintah " + ins + ": " + Arrays.toString(posisi));
        }
        
        System.out.println("Posisi akhir: " + Arrays.toString(posisi));
    }
    
    private static boolean isValidInput(String perintah) {
        return perintah.matches("[LR]+");
    }
    
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
