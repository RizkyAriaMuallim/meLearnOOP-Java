package learnclassrelationships.Association;
/*
    Tujuannya → Kita membuat sebuah hubungan satu sama lain tanpa menggunakan
                class di dalam class. 
    Relasi → Association. Karena class Dosen dapat mengubah class Mahasiswa 
             tanpa menginisiasi pada class Dosen terlebih dahulu.
*/
public class Driver {
    public static void main(String[] args) {
        Dosen ds1 = new Dosen("RAM","Rambutan Apel Mangga");
        Mahasiswa mhs1 = new Mahasiswa("Dudung", "12398743");
        
        ds1.giveScore(mhs1, 90);
        System.out.println(ds1.getScore(mhs1));
    }
}
