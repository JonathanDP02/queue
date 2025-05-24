package P2jobsheet10;

public class antrianLayanan07 {

    Mahasiswa07[] data;
    int front;
    int rear;
    int size;
    int max;

    public antrianLayanan07(int max) {
        this.max = max;
        this.data = new Mahasiswa07[max];
        this.front = 0;
        this.size = 0; 
        this.rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull() {
        if (size == max){
            return true;
        }else{
            return false;
        }
    }

    public void peek(){
        if (!isEmpty()){
            System.out.println("Elemen terdepan: " + data[front]);
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while (i != rear){
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
        }
        System.out.println(data[i]+" ");
        System.out.println("Jumlah elemen: " + size);
        }
    }

    public void clear(){
        if(!isEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa07 mhs){
        if(isFull()){
            System.out.println("Antrian penuh, tidak dapat menabah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear]=mhs;
        size++;
        System.out.println(mhs.nama+" berhasil masuk ke antrian");
    }

    public Mahasiswa07 layaniMahasiswa(){
        if(isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa07 mhs = data[front];
        front =(front + 1) % max;
        size--;
        return mhs;
    }

    public void lihatTerdepan(){
        if(isEmpty()){
            System.out.println("Antria kosong.");
        }else{
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampikanData();
        }
    }

    public void tampilkanSemua(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for(int i =0; i < size; i++){
            int index = (front + i ) % max;
            System.out.print((i+1) + ". ");
            data[index].tampikanData();
        }
    }

    public int getJumlahAntrian(){
        return size;
    }
    
    public void lihatAkhir(){
    if(isEmpty()){
        System.out.println("Antrian kosong.");
    }else{
        System.out.println("Mahasiswa di posisi paling belakang: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data[rear].tampikanData();
    }
}


}


