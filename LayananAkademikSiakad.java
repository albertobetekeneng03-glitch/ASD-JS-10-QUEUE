package P1Jobsheet10.P2Jobsheet10;

import java.util.Scanner;

public class LayananAkademikSiakad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan antrian = new AntrianLayanan(5);

        int pilih;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil");
            System.out.println("3. Lihat Depan");
            System.out.println("4. Lihat Semua");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Lihat Akhir");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
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

                    antrian.enqueue(new Mahasiswa(nim, nama, prodi, kelas));
                    break;

                case 2:
                    Mahasiswa m = antrian.dequeue();
                    if (m != null) {
                        System.out.println("Dipanggil:");
                        m.tampilkanData();
                    }
                    break;

                case 3:
                    antrian.peek();
                    break;

                case 4:
                    antrian.print();
                    break;

                case 5:
                    System.out.println("Jumlah: " + antrian.getJumlahAntrian());
                    break;

                case 6:
                    antrian.lihatAkhir();
                    break;
            }
        } while (pilih != 0);
    }
}