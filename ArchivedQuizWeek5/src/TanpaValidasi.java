import java.util.Scanner;

public class TanpaValidasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lanjut;

        do {
            double ipk;
            String predikat = "";

            // Input IPK tanpa validasi rentang 0.00 - 4.00
            System.out.print("Masukkan IPK (0.00 - 4.00): ");
            ipk = scanner.nextDouble();

            if (ipk < 3.01) {
                System.out.println("IPK < 3.01, tidak memenuhi standar kelulusan.");
            } else if (ipk == 4.00) {
                predikat = "Maxima Cum Laude";
            } else if (ipk >= 3.71) {
                predikat = "Summa Cum Laude";
            } else if (ipk >= 3.41) {
                predikat = "Magna Cum Laude";
            } else if (ipk >= 3.01) {
                predikat = "Cum Laude";

                System.out.print("Masukkan Poin Penelitian: ");
                int poinPenelitian = scanner.nextInt();

                // Jika Poin Penelitian tidak cukup, langsung tanyakan lulusan lainnya
                if (poinPenelitian < 25) {
                    System.out.println("Poin Penelitian < 25, tidak bisa meningkatkan predikat.");
                } else {
                    System.out.print("Masukkan Poin Prestasi Kemahasiswaan: ");
                    int poinPrestasi = scanner.nextInt();

                    // Validasi poin Prestasi Kemahasiswaan
                    if (poinPrestasi >= 25) {
                        predikat = "Magna Cum Laude (Peningkatan dari Cum Laude)";
                    } else {
                        System.out.println("Poin Prestasi Kemahasiswaan < 25, tidak bisa meningkatkan predikat.");
                    }
                }
            }

            if (!predikat.isEmpty()) {
                System.out.println("Predikat: " + predikat);
            }

            System.out.print("Apakah ingin memasukkan data lulusan lain? (y/n): ");
            lanjut = scanner.next();
        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("Terima kasih.");

        scanner.close();
    }
}