package learnabstract;
/**
 *
 * @author rizky
 */
public class manusia extends mahlukHidup{
    String percaya;
    public void kepercayaan()
    {
        System.out.println("Manusia ini percaya dengan "+this.percaya);
    }
    public manusia(String name, String gender, String percaya)
    {
        this.nama=name;
        this.jenisKelamin=gender;
        this.percaya=percaya;
    }
}
