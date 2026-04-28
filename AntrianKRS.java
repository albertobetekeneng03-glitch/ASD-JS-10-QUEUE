package P1Jobsheet10.P2Jobsheet10.TugasQueue;
public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int totalDiproses = 0;
    final int MAKS_DPA = 30;

    public AntrianKRS(int n) {
        max = n;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println("Mahasiswa masuk antrian.");
    }

    public void dequeue2() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        int jumlah = Math.min(2, size);

        System.out.println("Diproses:");
        for (int i = 0; i < jumlah; i++) {
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            totalDiproses++;
        }

        if (size == 0) {
            front = 0;
            rear = -1;
        }
    }

    public void peek2() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        int jumlah = Math.min(2, size);
        int i = front;

        System.out.println("Antrian terdepan:");
        for (int j = 0; j < jumlah; j++) {
            data[i].tampilkanData();
            i = (i + 1) % max;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        int i = front;
        System.out.println("Isi antrian:");
        for (int j = 0; j < size; j++) {
            data[i].tampilkanData();
            i = (i + 1) % max;
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian terakhir:");
            data[rear].tampilkanData();
        }
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public int getJumlah() {
        return size;
    }

    public int getDiproses() {
        return totalDiproses;
    }

    public int getSisaKRS() {
        return Math.max(MAKS_DPA - totalDiproses, 0);
    }
}