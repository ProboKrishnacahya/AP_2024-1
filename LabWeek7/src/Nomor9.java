import java.util.Scanner;

public class Nomor9 {
    static String[] namaMurid = new String[10];
    static int[] umurMurid = new int[10];
    static String[] tingkatSekolah = new String[10];
    static String[] bidangBelajar = new String[10];
    static int jumlahMurid = 0;
    static int totalPendapatan = 0;

    public static void daftarMuridBaru() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== DAFTAR MURID BARU ====");
        System.out.print("Nama: ");
        namaMurid[jumlahMurid] = scanner.nextLine();
        System.out.print("Umur (15-19 tahun): ");
        umurMurid[jumlahMurid] = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tingkat Sekolah: ");
        tingkatSekolah[jumlahMurid] = scanner.nextLine();

        System.out.println("Bidang Belajar: ");
        System.out.println("1. Semua Dasar Programming");
        System.out.println("2. Full-Stack Developer");
        System.out.println("3. Artificial Intelligent");
        System.out.print("Pilih Bidang Belajar (1-3): ");
        int pilihanBidang = scanner.nextInt();
        scanner.nextLine();

        switch (pilihanBidang) {
            case 1 -> bidangBelajar[jumlahMurid] = "Semua Dasar Programming";
            case 2 -> bidangBelajar[jumlahMurid] = "Full-Stack Developer";
            case 3 -> bidangBelajar[jumlahMurid] = "Artificial Intelligent";
            default -> bidangBelajar[jumlahMurid] = "Unknown";
        }

        switch (umurMurid[jumlahMurid]) {
            case 15 -> totalPendapatan += 100000;
            case 16 -> totalPendapatan += 120000;
            case 17 -> totalPendapatan += 130000;
            case 18 -> totalPendapatan += 140000;
            case 19 -> totalPendapatan += 190000;
            default -> System.out.println("Umur tidak valid.");
        }

        System.out.println("Murid baru berhasil ditambahkan!");
        jumlahMurid++;
    }

    public static void tampilPendapatanBulanan() {
        System.out.println("Total pendapatan per bulan: Rp " + totalPendapatan);
    }

    public static void tampilkanSemuaMurid() {
        System.out.println("==== DAFTAR SEMUA MURID ====");
        for (int i = 0; i < jumlahMurid; i++) {
            System.out.println("Nama: " + namaMurid[i] + ", Umur: " + umurMurid[i] + ", Tingkat Sekolah: "
                    + tingkatSekolah[i] + ", Bidang Belajar: " + bidangBelajar[i]);
        }
    }

    public static void cariMurid() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama murid: ");
        String namaCari = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < jumlahMurid; i++) {
            if (namaMurid[i].equalsIgnoreCase(namaCari)) {
                System.out.println("Nama: " + namaMurid[i] + ", Umur: " + umurMurid[i] + ", Tingkat Sekolah: "
                        + tingkatSekolah[i] + ", Bidang Belajar: " + bidangBelajar[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Murid dengan nama tersebut tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("====== BIMBEL KEVIN ======");
            System.out.println("==== DIJAMIN JAGO KODING ====");
            System.out.println("1. Daftar Murid Baru");
            System.out.println("2. Total Pendapatan per Bulan");
            System.out.println("3. Tampilkan Semua Daftar Murid");
            System.out.println("4. Cari Murid");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> daftarMuridBaru();
                case 2 -> tampilPendapatanBulanan();
                case 3 -> tampilkanSemuaMurid();
                case 4 -> cariMurid();
                case 5 -> System.out.println("Terima kasih!");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}