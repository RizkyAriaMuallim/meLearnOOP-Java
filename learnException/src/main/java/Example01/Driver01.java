package Example01;
import java.util.Scanner;
/**
 *
 * @author rizkyAriaMu'allim
 */
public class Driver01 {
    public static void main(String[] args) {
        TryException01 t = new TryException01();
        Scanner s = new Scanner(System.in);
        int number=0;
        try {
            System.out.print("Angka masukan : ");
            number = s.nextInt();
            // dibawah sini engga akan di eksekusi jika diatas sudah gagal
        } catch (Exception e){
            System.out.println("Exception Occurs");
        }
        t.setNumber(number);
        System.out.println(t.getNumber());
    }
}
