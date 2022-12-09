package Example05;
/**
 *
 * @author rizky
 */
public class TryException {
    int number[] = new int[5];
    // Case dimana kemungkinan method ini akan menimbulkan error
    public void setNumber(int id, int number) throws Exception
    {
        this.number[id] = 5/id;
    }
    public int getNumber(int id)
    {
        try {
            return this.number[id];
        } catch (Exception e) {
            return 0;
        }
    }
}
