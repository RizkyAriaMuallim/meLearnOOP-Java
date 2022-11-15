package learnclassrelationships.Composition;
public class Monitor {
    private String Brand;
    public Monitor(String brand)
    {
        this.Brand=brand;
    }
    public void DisplaySpecMonitor()
    {
        System.out.println("Spesifikasi Monitor ini adalah "+this.Brand);
    }
}
