package P1Jobsheet10.P2Jobsheet10;

public class AntrianLayanan {
    Mahasiswa[] data;
    int front, rear, size, max;

    public AntrianLayanan(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = mhs;
        size++;
    }

    public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa mhs = data[front];
        size--;
        if (size == 0) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }
        return mhs;
    }

    public void peek() {
        if (!isEmpty()) {
            data[front].tampilkanData();
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Kosong");
        } else {
            int i = front;
            while (i != rear) {
                data[i].tampilkanData();
                i = (i + 1) % max;
            }
            data[i].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (!isEmpty()) {
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }
}