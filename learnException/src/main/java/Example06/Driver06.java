package Example06;
/**
 *
 * @author rizky
 */
public class Driver06 {
    /*
    Case : 
    Kata kunci : finallys
    */
    public static void main(String[] args) {
        TryException t = new TryException();
        try {
            t.setNumber(8, 10);
        } catch (Exception e) {
                System.out.println("Exception occurs");
        }
    }
}
