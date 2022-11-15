package learnclassrelationships.Association;
public class Dosen {
    private String kodeDosen;
    private String namaDosen;
    
    public Dosen(String KodeDSN, String namaDSN)
    {
        this.setKodeDosen(KodeDSN);
        this.setNamaDosen(namaDSN);
    }
    final public void setKodeDosen(String kodeDSN)
    {
        this.kodeDosen=kodeDSN;
    }
    final public void setNamaDosen(String namaDSN)
    {
        this.namaDosen=namaDSN;
    }
    public String getKodeDosen()
    {
        return kodeDosen;
    }
    public String getNamaDosen()
    {
        return namaDosen;
    }
    
    public void giveScore(Mahasiswa data, int nilai)
    {
        data.setNilai(nilai);
    }
    public int getScore(Mahasiswa data)
    {
        return data.getNilai();
    }
}
