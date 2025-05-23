package P2jobsheet10;
    
public class Mahasiswa07 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa07(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampikanData(){
        System.out.println((nim + " - " + nama + " - " + prodi + " - " + kelas));
    }
    

    
}
