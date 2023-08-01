import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pengecekan validitas nama pengguna!");

        String username;
        boolean valid;

        do {
            System.out.print("\nMasukkan nama pengguna (username): ");
            username = scanner.nextLine();
            valid = true;

            if (!Character.isLetter(username.charAt(0))) {
                System.out.println("Maaf, nama pengguna harus dimulai dengan huruf.");
                valid = false;
            } else if (!username.matches("^[a-zA-Z0-9]+$")) {
                System.out.println("Maaf, nama pengguna hanya boleh mengandung huruf dan angka.");
                valid = false;
            } else if (username.length() < 5 || username.length() > 12) {
                System.out.println("Maaf, nama pengguna harus terdiri dari 5 hingga 12 karakter.");
                valid = false;
            } else {
                System.out.println("Selamat, nama pengguna valid!");
                valid = true;
            }
        } while (!valid);
    }
}
