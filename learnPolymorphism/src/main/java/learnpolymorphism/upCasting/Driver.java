package learnpolymorphism.upCasting;
import KumpulanClass.*;
/**
 *
 * @author rizky
 */
/*
    Up-Casting → Sebuah cara untuk melakukan perubahan referensi dari parent
                menuju child-class-nya. Note: Yang melakukan up-casting 
                hanya dapat mengakses method yang ada pada dirinya!!!
               → Child kelas dari parent akan menjadi referensi untuk
                 kelas parent.
               → Kelas yang lebih tinggi dapat berubah menjadi child kelasnya
               → Casting secara implisit.
*/
public class Driver {
    public static void main(String[] args){
        System.out.println("Melakukan up-casting ke ChildPertama");
        Parent p = new ChildPertama();
        p.info();
        System.out.println();
        System.out.println("Melakukan up-casting ke ChildKedua");
        p = new ChildKedua();
        p.info();
        System.out.println();
        System.out.println("Melakukan up-casting ke ChildPertama");
        p = new ChildPertama();
        p.info();
        /*
        // Akan error jika coba mengakses method yang tidak dimiliki.
        p.citaCita();
        */
    }
}
