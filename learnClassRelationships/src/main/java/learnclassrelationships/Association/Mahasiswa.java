package learnclassrelationships.Association;
public class Mahasiswa {
    private String NIM;
    private String name;
    private int nilai;
    
    public Mahasiswa(String name, String nim)
    {
        this.setNama(name);
        this.setNim(nim);
    }
    final public void setNama(String nama)
    {
        this.name=nama;
    }
    final public void setNim(String nim)
    {
        this.NIM=nim;
    }
    public void setNilai(int nilai)
    {
        this.nilai=nilai;
    }
    public String getNama()
    {
        return name;
    }
    public String getNim()
    {
        return NIM;
    }
    public int getNilai()
    {
        return nilai;
    }
}
