package P1Jobsheet10.P2Jobsheet10.TugasQueue;
import java.util.Scanner;

public class AntrianKRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);

        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS (max 2 orang)");
            System.out.println("3. Lihat 2 terdepan");
            System.out.println("4. Lihat semua");
            System.out.println("5. Lihat terakhir");
            System.out.println("6. Jumlah antrian");
            System.out.println("7. Jumlah diproses");
            System.out.println("8. Sisa kuota DPA");
            System.out.println("9. Clear");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            while (!sc.hasNextInt()) {
                System.out.print("Input harus angka: ");
                sc.next();
            }

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

                    Mahasiswa m = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.enqueue(m);
                    break;

                case 2:
                    antrian.dequeue2();
                    break;

                case 3:
                    antrian.peek2();
                    break;

                case 4:
                    antrian.print();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;

                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getJumlah());
                    break;

                case 7:
                    System.out.println("Sudah diproses: " + antrian.getDiproses());
                    break;

                case 8:
                    System.out.println("Sisa kuota DPA: " + antrian.getSisaKRS());
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);

        sc.close();
    }
}