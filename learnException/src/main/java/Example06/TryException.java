package Example06;
/**
 *
 * @author rizky
 */
public class TryException {
    int number[] = new int[5];
    public void setNumber(int id, int number)
    {
        try {
            this.number[id] = 5/id;
        } catch (ArrayIndexOutOfBoundsException e) {
            // Menggunakan throw
            throw new ArrayIndexOutOfBoundsException("Error in setNumber");
        } finally {
            System.out.println("Finally dibuat untuk code diluar catch dapat digunakan");
        }
    }
}
