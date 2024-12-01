// import java.util.Scanner;

// public class Soal16 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("masukan angka ");
//         int angka = scan.nextInt();

//         for (int i = 1; i <= angka; i++) {
//             for (int j = 1; j <= angka; j++) {
//                 if (i == 1 || i == angka || j == 1 || j == angka) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.Scanner;

public class soal16PersegiBintangKosong {
    public static void main(String[] args) {

        Scanner p = new Scanner(System.in);

        System.out.print("Masukan N = ");
        int N = p.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
            }
        }
        System.out.println();
    }
}}