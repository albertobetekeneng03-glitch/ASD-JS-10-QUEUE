package P1Jobsheet10;

import java.util.ArrayDeque;
import java.util.Scanner;


public class QueueMain {
    public static void menu() {
        System.out.println("\nMENU");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Peek");
        System.out.println("4. Print");
        System.out.println("5. Clear");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();

        ArrayDeque<Integer> Q = new ArrayDeque<>(n);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data: ");
                    int data = sc.nextInt();
                    Q.add(data);
                    break;

                case 2:
                    Integer keluar = Q.poll();
                    if (keluar != null) {
                        System.out.println("Data keluar: " + keluar);
                    } else {
                        System.out.println("Queue kosong!");
                    }
                    break;

                case 3:
                    Integer front = Q.peek();
                    if (front != null) {
                        System.out.println("Data depan: " + front);
                    } else {
                        System.out.println("Queue kosong!");
                    }
                    break;

                case 4:
                    if (Q.isEmpty()) {
                        System.out.println("Queue kosong!");
                    } else {
                        System.out.println("Queue: " + Q);
                    }
                    break;

                case 5:
                    Q.clear();
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