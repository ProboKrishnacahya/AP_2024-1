import java.util.Scanner;

public class TamagotchiGame {
    public static void main(String[] args) {
        int lapar = 5;
        int bosan = 5;
        int tidur = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah hari: ");
        int hari = Integer.parseInt(scanner.nextLine());

        boolean tamagotchiHidup = true;

        // Loop untuk setiap hari
        for (int currentHari = 1; currentHari <= hari && tamagotchiHidup; currentHari++) {
            System.out.println("Hari ke-" + currentHari);

            // Loop untuk 3 kegiatan per hari
            for (int kegiatan = 1; kegiatan <= 3; kegiatan++) {
                System.out.println("\nKegiatan ke-" + kegiatan);
                System.out.println("Status Tamagotchi - Lapar: " + lapar + ", Bosan: " + bosan + ", Tidur: " + tidur);
                System.out.println("Pilih aksi:");
                System.out.println("1. Memberi Makan");
                System.out.println("2. Bermain");
                System.out.println("3. Tidur");

                System.out.print("Masukkan pilihan aksi (1/2/3): ");
                int aksi = Integer.parseInt(scanner.nextLine());

                switch (aksi) {
                    case 1:
                        lapar = Math.max(0, lapar - 4);  // Mengurangi lapar hingga 0 (tidak negatif)
                        bosan = Math.min(10, bosan + 2); // Menambah bosan maksimal hingga 10
                        break;
                    case 2:
                        bosan = Math.max(0, bosan - 3);  // Mengurangi bosan hingga 0
                        lapar = Math.min(10, lapar + 2); // Menambah lapar maksimal hingga 10
                        tidur = Math.min(10, tidur + 2); // Menambah tidur maksimal hingga 10
                        break;
                    case 3:
                        tidur = Math.max(0, tidur - 5);  // Mengurangi tidur hingga 0
                        lapar = Math.min(10, lapar + 3); // Menambah lapar maksimal hingga 10
                        break;
                    default:
                        System.out.println("Aksi tidak valid, coba lagi.");
                        kegiatan--; // Mengulangi kegiatan jika aksi tidak valid
                        continue;
                }

                System.out.println("Status setelah aksi - Lapar: " + lapar + ", Bosan: " + bosan + ", Tidur: " + tidur);

                // Memeriksa apakah Tamagotchi mati
                if (lapar >= 10 || bosan >= 10 || tidur >= 10) {
                    System.out.println("Tamagotchi mati pada hari ke-" + currentHari + ", kegiatan ke-" + kegiatan);
                    tamagotchiHidup = false;
                    break;
                }
            }
        }

        if (tamagotchiHidup) {
            System.out.println("Selamat! Tamagotchi kamu berhasil melewati " + hari + " hari.");
        }

        scanner.close();
    }
}