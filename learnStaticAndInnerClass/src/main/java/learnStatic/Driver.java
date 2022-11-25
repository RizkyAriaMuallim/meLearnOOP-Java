package learnStatic;
// Import variable static
import static learnStatic.Duck.VERSION;
import static learnStatic.MesinPenghitung.PROCESSOR;
// import static variable
/**
 *
 * @author rizky
 */
public class Driver {
    /*
    ]1 Variable atau method static hanya dapat dipanggil 
    oleh Variable atau method static.
    2] Variable atau method dapat di-akses tanpa membuat object
    terlebih dahulu.
    */
    public static void main(String[] args) {
        Duck bebek;
        /*
        Variable yang dikenakan static, dia tidak akan melekat
        kepada class-nya
        */
        bebek = new Duck(4);
        System.out.println(bebek.getCount()+" "+bebek.getSize());
        bebek = new Duck(10);
        System.out.println(bebek.getCount()+" "+bebek.getSize());
        bebek = new Duck(16);
        System.out.println(bebek.getCount()+" "+bebek.getSize());
        bebek = new Duck(5);
        System.out.println(bebek.getCount()+" "+bebek.getSize());
        System.out.println();
        // mengakses variable static
        System.out.println("mengakses variable static "+VERSION);
        // mengakses method static
        System.out.println("mengakses method static "+MesinPenghitung.sum(1,2,3,4,5, 6));
        // Mengakses static block
        System.out.println("Mengakses static block "+PROCESSOR);
        // Mengakses dan membuat inner-class dari Duck
        Duck.Asal jawa = new Duck.Asal();
        jawa.setName("saka");
        System.out.println(jawa.getName());
    }
}
