package Example04;
/**
 *
 * @author rizky
 */
public class TryException {
    int number[] = new int[5];
    // Case dimana ada error pada method
    public void setNumber(int id, int number)
    {
        try {
            this.number[id] = 5/id;
        } catch (Exception e) {
            // Menggunakan throw
            throw new ArrayIndexOutOfBoundsException("Error in setNumber");
        }
    }
    public int getNumber(int id)
    {
        try {
            return this.number[id];
        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
    }
}
