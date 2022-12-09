package Example05;
/**
 *
 * @author rizky
 */
public class Driver05 {
    /*
    Case : Kita memaksa untuk menggunakan try-catch dalam menggunakan methods
    Kata kunci : throws
    */
    public static void main(String[] args) {
        TryException t = new TryException();
        try {
            t.setNumber(8, 10);
        } catch (Exception e) {
                System.out.println("Exception occurs");
        }
        System.out.println(t.getNumber(5));
    }
}
