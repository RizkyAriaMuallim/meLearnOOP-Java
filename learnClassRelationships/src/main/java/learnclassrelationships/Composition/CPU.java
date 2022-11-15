package learnclassrelationships.Composition;
public class CPU {
    private String Brand;
    private int Kecepatan;
    public CPU(String brand, int kecepatan)
    {
        this.Brand=brand;
        this.Kecepatan=kecepatan;
    }
    public void DisplaySpecCPU()
    {
        System.out.println("Spesifikasi CPU ini yaitu dengan brand "+this.Brand+
                " dan kecepatan "+this.Kecepatan);
    }
}
