package learnStatic;
/**
 *
 * @author rizky
 */
public class Duck {
    private int size;
    // Static Field
    private static int DUCKCOUNT=0;
    public static final int VERSION=1;
    public Duck(int size)
    {
        this.size=size;
        DUCKCOUNT++;
    }
    public int getSize()
    {
        return size;
    }
    public int getCount()
    {
        return DUCKCOUNT;
    }
    // Static Inner Class
    public static class Asal 
    {
        private String name;
        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name=name;
        }
    }
}
