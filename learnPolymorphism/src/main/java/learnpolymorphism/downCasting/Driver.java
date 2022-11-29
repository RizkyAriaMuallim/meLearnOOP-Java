package learnpolymorphism.downCasting;
import KumpulanClass.*;
/**
 *
 * @author rizky
 */
/*
    down-casting → Sebuah cara untuk mengakses variable dari parent-class 
                   (Biasanya dipakai ketika mengetes aksesibilitas dari parent)
                 → Casting secara eksplisit.
*/
public class Driver {
    public static void main(String[] args){
        Parent p = new Parent();
        p.keturunan = 10;
        p = new ChildPertama();
        p.info();
        ChildPertama cp = new ChildPertama();
        /*
        // Akan error ketika mencoba melakukan casting secara implisit
        ChildPertama cp = new Parent();
        */
        // Cek apakah 'cp' merupakan child dari class Parent
        if(cp instanceof Parent)
        {
            // Casting secara eksplisit
            /*
            Akan error jika penulisan seperti ini
            → cp = (ChildPertama)new Parent();
            */
            cp = (ChildPertama)p;
            System.out.println(cp.keturunan);
            cp.citaCita();
        }
    }
}
