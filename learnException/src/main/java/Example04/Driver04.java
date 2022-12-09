package Example04;

/**
 *
 * @author rizky
 */
public class Driver04 {
    /*
    Case : Menggunakan throw the Exception
    */
    public static void main(String[] args) {
        TryException t = new TryException();
        
        try {
            t.setNumber(7, 5);
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
        try {
            t.getNumber(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
