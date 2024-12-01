import java.util.Scanner;

public class Nomor4 {
    String[][] tenantsWithMenuAndPrice = {
            { "Coffee Corner", "Espresso", "15000", "Latte", "25000", "Cappuccino", "30000" },
            { "Sushi House", "California Roll", "40000", "Sashimi", "60000", "Nigiri", "50000" },
            { "Dragon Wok", "Kung Pao Chicken", "50000", "Sweet and Sour Fish", "55000", "Spring Rolls", "30000" },
            { "IndoTaste", "Nasi Goreng", "25000", "Sate Ayam", "30000", "Rendang", "45000" },
            { "Pasta Deli", "Spaghetti Bolognese", "45000", "Carbonara", "50000", "Lasagna", "60000" }
    };

    String[][] cart = new String[100][4]; // [menu][harga][jumlah][catatan]
    int cartIndex = 0; // Indeks terakhir keranjang
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Nomor4().run();
    }

    public void run() {
        while (true) {
            System.out.println("\n--- Food Court PoS ---");
            System.out.println("1. Lihat tenant");
            System.out.println("2. Lihat keranjang belanja");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> showTenants();
                case 2 -> viewCart();
                case 3 -> {
                    System.out.println("Terima kasih telah berbelanja!");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public void showTenants() {
        System.out.println("\n--- Daftar Tenant & Menu ---");
        for (int i = 0; i < tenantsWithMenuAndPrice.length; i++) {
            System.out.println((i + 1) + ". " + tenantsWithMenuAndPrice[i][0]);
            char menuOption = 'a';
            for (int j = 1; j < tenantsWithMenuAndPrice[i].length; j += 2) {
                System.out.println("   " + menuOption + ". " + tenantsWithMenuAndPrice[i][j] + " (Rp"
                        + tenantsWithMenuAndPrice[i][j + 1] + ")");
                menuOption++;
            }
        }
        orderMenu();
    }

    public void orderMenu() {
        while (true) {
            System.out.print("\nMasukkan nomor tenant: ");
            int tenantChoice = scanner.nextInt();
            if (tenantChoice < 1 || tenantChoice > tenantsWithMenuAndPrice.length) {
                System.out.println("Tenant tidak valid.");
                continue;
            }

            String[] selectedTenant = tenantsWithMenuAndPrice[tenantChoice - 1];
            System.out.println("Anda memilih tenant = " + selectedTenant[0]);

            while (true) {
                System.out.print("Pilih menu (a/b/c) atau 0 untuk kembali: ");
                String menuChoice = scanner.next().toUpperCase();
                if (menuChoice.equals("0"))
                    return;

                int menuIndex = -1;
                if (menuChoice.equalsIgnoreCase("a"))
                    menuIndex = 1;
                else if (menuChoice.equalsIgnoreCase("b"))
                    menuIndex = 3;
                else if (menuChoice.equalsIgnoreCase("c"))
                    menuIndex = 5;

                if (menuIndex == -1 || menuIndex >= selectedTenant.length) {
                    System.out.println("Menu tidak valid.");
                    continue;
                }

                System.out.print("Jumlah porsi: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Catatan untuk pesanan (opsional/tekan Enter jika ingin dikosongi): ");
                String notes = scanner.nextLine();
                if (notes.isBlank())
                    notes = "-";

                String menuName = selectedTenant[menuIndex];
                String menuPrice = selectedTenant[menuIndex + 1];

                // Simpan ke keranjang
                cart[cartIndex][0] = menuName;
                cart[cartIndex][1] = menuPrice;
                cart[cartIndex][2] = String.valueOf(quantity);
                cart[cartIndex][3] = notes;
                cartIndex++;
                System.out.println("Menu ditambahkan ke keranjang.");

                System.out.print("Belanja lagi? (Y/N): ");
                char continueShopping = scanner.next().toUpperCase().charAt(0);
                if (continueShopping == 'N')
                    return;
            }
        }
    }

    public void viewCart() {
        if (cartIndex == 0) {
            System.out.println("Keranjang belanja kosong.");
            return;
        }

        System.out.println("\n--- Keranjang Belanja ---");
        int total = 0;
        for (int i = 0; i < cartIndex; i++) {
            int subtotal = Integer.parseInt(cart[i][1]) * Integer.parseInt(cart[i][2]);
            total += subtotal;
            System.out.println((i + 1) + ". " + cart[i][0] + " - " + cart[i][2] + " porsi (Rp" + subtotal + ")");
            System.out.println("   Catatan: " + cart[i][3]);
        }
        System.out.println("Total Bayar: Rp" + total);

        System.out.println("\n1. Ubah item");
        System.out.println("2. Hapus item");
        System.out.println("3. Kembali");
        System.out.print("Pilih opsi: ");
        int option = scanner.nextInt();

        if (option == 1) {
            editCart();
        } else if (option == 2) {
            deleteCartItem();
        }
    }

    public void editCart() {
        System.out.print("\nMasukkan nomor item yang ingin diubah: ");
        int editChoice = scanner.nextInt();
        if (editChoice > 0 && editChoice <= cartIndex) {
            System.out.print("Masukkan jumlah porsi baru: ");
            int newQuantity = scanner.nextInt();
            cart[editChoice - 1][2] = String.valueOf(newQuantity); // Timpa nilai jumlah
            System.out.println("Jumlah porsi berhasil diperbarui.");
        } else {
            System.out.println("Nomor item tidak valid.");
        }
    }

    public void deleteCartItem() {
        System.out.print("\nHapus item (masukkan nomor atau 0 untuk kembali): ");
        int deleteChoice = scanner.nextInt();
        if (deleteChoice > 0 && deleteChoice <= cartIndex) {
            for (int i = deleteChoice - 1; i < cartIndex - 1; i++) {
                cart[i] = cart[i + 1];
            }
            cartIndex--;
            System.out.println("Item dihapus dari keranjang.");
        } else {
            System.out.println("Nomor item tidak valid.");
        }
    }
}