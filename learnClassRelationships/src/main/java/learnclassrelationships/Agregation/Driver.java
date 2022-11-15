package learnclassrelationships.Agregation;
public class Driver {
    public static void main(String[] args) {
        /*
        
        */
        Jurusan jurusan1 = new Jurusan("IF", "Informatika");
        /*
        Jika salah satu objek mahasiswa di hapus, maka objek jurusan masih dapat
        berdiri sendiri.
        */
        Mahasiswa mhs1 = new Mahasiswa("1343531431","Jamal Udin");
        Mahasiswa mhs2 = new Mahasiswa("1343531683","Udin Petot");
        
        jurusan1.addMahasiswa(mhs1);
        jurusan1.addMahasiswa(mhs2);
        jurusan1.displayMahasiswa();
    }
}
