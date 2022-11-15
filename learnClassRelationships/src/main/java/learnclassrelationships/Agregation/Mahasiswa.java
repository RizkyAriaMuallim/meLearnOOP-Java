package learnclassrelationships.Agregation;
public class Mahasiswa {
    private String NIM, Nama;
    public Mahasiswa(String NIM, String Nama)
    {
        this.NIM=NIM;
        this.Nama=Nama;
    }
    public String getNIM()
    {
        return this.NIM;
    }
    public String getName()
    {
        return this.Nama;
    }
}
