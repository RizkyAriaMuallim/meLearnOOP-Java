package learnStatic;
/**
 *
 * @author rizky
 */
public class MesinPenghitung {
    // Static method
    public static int sum(int... values)
    {
        int total=0;
        for (var value : values)
        {
            total += value;
        }
        return total;
    }
    // Static Block 
    public static final int PROCESSOR;
    /*
    Static block akan di-load sebelum operasi lainnya dimulai
    */
    static 
    {
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
