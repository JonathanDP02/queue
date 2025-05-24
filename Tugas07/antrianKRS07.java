package Tugas07;

public class antrianKRS07 {
    mahasiswa07[] data;
    int front, rear, size, max;
    int totalDilayani = 0;

    public antrianKRS07(int max) {
        this.max = max;
        data = new mahasiswa07[max];
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

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void tambahAntrian(mahasiswa07 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, tidak bisa proses KRS.");
            return;
        }
        System.out.println("Memproses KRS untuk:");
        for (int i = 0; i < 2; i++) {
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            totalDilayani++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[idx].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2.");
            return;
        }
        System.out.println("2 Mahasiswa terdepan:");
        for (int i = 0; i < 2; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }

    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa paling akhir:");
        data[rear].tampilkanData();
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahDilayani() {
        return totalDilayani;
    }

    public int getSisaKRS() {
        return 30 - totalDilayani;
    }
}
