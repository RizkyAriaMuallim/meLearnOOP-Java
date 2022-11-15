package learnclassrelationships.Composition;
/*
    Tujuannya → Kita membuat sebuah komputer yang dimana komputer ini membutuhkan
                beberapa komponen atau class lain untuk dapat dijalankan.
    Relasi → Composition. Karena class komputer tidak dapat berdiri sendiri
*/
public class Komputer {
    /*
    Ini merupakan contoh pembuatan relasi class komposisi.
    Composition → Cara agar kita menggunakan class lain karena kita sangat butuh
                  atau "part-of". ( Class komputer tidak dapat berdiri sendiri
                  tanpa bantuan dari class lain, itu dinamakan composition. )
    */
    private Monitor monitor;
    private Mouse mouse;
    private CPU cpu;
    
    public Komputer(String brand, String tipe, int kecepatan)
    {
        this.monitor = new Monitor(brand);
        this.mouse = new Mouse(brand, tipe);
        this.cpu = new CPU(brand, kecepatan);
    }
    
    public void getDataMonitor()
    {
        monitor.DisplaySpecMonitor();
    }
    public void getDataMouse()
    {
        mouse.DisplaySpecMouse();
    }
    public void getDataCPU()
    {
        cpu.DisplaySpecCPU();
    }
}
