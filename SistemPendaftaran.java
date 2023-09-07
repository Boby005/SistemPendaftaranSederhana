import java.util.Scanner;

public class SistemPendaftaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Pendaftaran Acara XYZ");
        System.out.println("Silakan isi informasi pribadi Anda:");

        System.out.print("Nama Lengkap*: ");
        String namaLengkap = input.nextLine();

        System.out.print("Alamat Email*: ");
        String email = input.nextLine();

        System.out.print("Nomor Telepon*: ");
        String nomorTelepon = input.nextLine();

        System.out.print("Alamat Rumah*: ");
        String alamatRumah = input.nextLine();

        System.out.print("Umur*: ");
        int umur = input.nextInt();
        input.nextLine(); // Membuang karakter newline

        System.out.print("Jenis Kelamin (L/P)*: ");
        char jenisKelamin = input.nextLine().charAt(0);

        System.out.print("Pendidikan Terakhir*: ");
        String pendidikanTerakhir = input.nextLine();

        System.out.print("Apakah Anda memiliki pengalaman sebelumnya dalam acara serupa? (Ya/Tidak)*: ");
        String pengalaman = input.nextLine();

        System.out.print("Apa yang menjadi motivasi Anda untuk mengikuti acara ini?*: ");
        String motivasi = input.nextLine();

        System.out.println("\nTerima kasih atas pendaftaran Anda!");
        System.out.println("Berikut adalah informasi pendaftaran Anda:");

        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("Alamat Email: " + email);
        System.out.println("Nomor Telepon: " + nomorTelepon);
        System.out.println("Alamat Rumah: " + alamatRumah);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Pendidikan Terakhir: " + pendidikanTerakhir);
        System.out.println("Pengalaman Acara: " + pengalaman);
        System.out.println("Motivasi Anda: " + motivasi);

        input.close();
    }
}
