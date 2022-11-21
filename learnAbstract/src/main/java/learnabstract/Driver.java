package learnabstract;
/**
 *
 * @author rizky
 */
public class Driver {
    public static void main(String[] args) {
        manusia m1 = new manusia("Dudi","Lk","Anime");
        m1.info();
        m1.kepercayaan();
        System.out.println();
        // constructor
        mahlukHidup m2 = new manusia("Uci","Pr","Batu");
        m2.info();
    }
}
