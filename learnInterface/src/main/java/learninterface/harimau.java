package learninterface;
import learninterface.Interface.Habitat;
import learninterface.Interface.karnivora;
// ternyata bisa implementasi lebih dari 1 interface
public class harimau implements karnivora,Habitat {
    String name, jenis, makan;
    
    public harimau(String nama, String jenis, String makanan)
    {
        this.name=nama;
        this.jenis=jenis;
        this.makan=makanan;
        this.favoriteFood(makanan);
    }
    @Override
    public void info()
    {
        System.out.println("Harimau berjenis "+this.jenis+" ini bernama "
                +this.name+". Makanan favorit-nya adalah "+this.makan);
    }
    @Override
    public final void favoriteFood(String makanan)
    {
        this.makan=makanan;
    }
}
