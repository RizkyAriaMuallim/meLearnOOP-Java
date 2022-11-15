package learnclassrelationships.Composition;
public class Driver {
    public static void main(String[] args) {
        Komputer komp = new Komputer("Asus", "MSI", 1080);
        komp.getDataCPU();
        komp.getDataMonitor();
        komp.getDataMouse();
    }
}
