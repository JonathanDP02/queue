package Tugas07;

import java.util.Scanner;

public class mainKRS07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antrianKRS07 antrian = new antrianKRS07(10);

        while (true) {
            System.out.println("\nMenu Antrian KRS:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa sekaligus)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cetak Jumlah Antrian & Sudah Proses KRS & Sisa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    antrian.tambahAntrian(new mahasiswa07(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrian.tampilkanAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    System.out.println("Jumlah sudah proses KRS: " + antrian.getJumlahDilayani());
                    System.out.println("Sisa mahasiswa belum proses KRS: " + antrian.getSisaKRS());
                    break;
                case 0:
                    System.out.println("Keluar.");
                    return;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
    }
}
