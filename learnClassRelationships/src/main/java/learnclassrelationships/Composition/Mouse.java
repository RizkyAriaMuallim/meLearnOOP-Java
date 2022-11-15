package learnclassrelationships.Composition;
public class Mouse {
    private String Brand, Type;
    public Mouse(String brand, String type)
    {
        this.Brand=brand;
        this.Type=type;
    }
    public void DisplaySpecMouse()
    {
        System.out.println("Spesifikasi mouse ini adalah brand "+this.Brand+
                " dan tipe "+this.Type);
    }
}
