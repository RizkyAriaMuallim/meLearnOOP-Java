package learnclassrelationships.Agregation;
/*
    Tujuannya → Kita membuat sebuah object jurusan yang dimana dapat menambahkan
                class mahasiswa dan mahasiswa dapat memutuskan ikatan dengan
                jurusan. Namun, class jurusan masih dapat berjalan sendiri tanpa
                bantuan class mahasiswa.
    Relasi → Agregation. Karena class Jurusan dapat berdiri sendiri dan kedua
             class dapat berdiri sendiri tanpa membutuhkan satu sama lain.
*/
public class Jurusan {
    final private String KodeJurusan, NamaJurusan;
    final private Mahasiswa[] Daftar = new Mahasiswa[30];
    private static int JmlMhs=0;
    
    public Jurusan(String KodeJurusan, String NamaJurusan)
    {
        this.KodeJurusan=KodeJurusan;
        this.NamaJurusan=NamaJurusan;
    }
    // Agregasi
    public void addMahasiswa(Mahasiswa data)
    {
        this.Daftar[JmlMhs]=data;
        this.JmlMhs++;
    }
    public void displayMahasiswa()
    {
        System.out.println("Kode Jurusan : "+this.KodeJurusan);
        System.out.println("Nama Jurusan : "+this.NamaJurusan);
        System.out.println("---Daftar Mahasiswa---");
        for(int i=0; i< JmlMhs; i++)
        {
            System.out.println((i+1)+"] Nama = "+Daftar[i].getName()+". NIM = "+
                    Daftar[i].getNIM());
        }
    }
}
