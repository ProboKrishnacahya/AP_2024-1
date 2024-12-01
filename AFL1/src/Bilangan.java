import java.util.Scanner;

public class Bilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input bilangan
        System.out.print("Masukkan bilangan: ");
        float bilangan = input.nextFloat();

        // Logika untuk menentukan apakah bilangan positif atau negatif dan besar atau kecil
        if (bilangan > 0) {
            // Bilangan positif
            if (bilangan < 1) {
                System.out.println("Bilangan kecil positif");
            } else if (bilangan > 1000000) {
                System.out.println("Bilangan besar positif");
            } else {
                System.out.println("Bilangan positif");
            }
        } else if (bilangan < 0) {
            // Bilangan negatif
            if (bilangan > -1) {
                System.out.println("Bilangan kecil negatif");
            } else if (bilangan < -1000000) {
                System.out.println("Bilangan besar negatif");
            } else {
                System.out.println("Bilangan negatif");
            }
        } else {
            // Jika bilangan adalah 0
            System.out.println("Nol");
        }

        // Menutup input
        input.close();
    }
}