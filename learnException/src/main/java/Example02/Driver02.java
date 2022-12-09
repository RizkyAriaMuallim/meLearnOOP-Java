package Example02;

import java.util.Scanner;

/**
 *
 * @author rizky
 */
public class Driver02 {
    public static void main(String[] args) {
        /*
        Case dimana kita mengandalkan Exception sesuai batasan yang kita buat
        
        -- Common Exception --
        ►ArtihmeticException
        ►NullPointerException
        ►NegativeArraySizeException
        ►ArrayIndexOutOfBoundsException
        ►SecurityException
        
        */
        People02[] listPeople = new People02[4];
        listPeople[0] = new People02("dadang");
        listPeople[1] = new People02("adam");
        listPeople[2] = new People02("turu");
        
        Scanner s = new Scanner(System.in);
        int id=0;
        try{
            System.out.print("Masukan index untuk melihat data : ");
            id = s.nextInt();
            System.out.println(listPeople[id].getName());
        } catch (java.util.InputMismatchException e){ // case input not a number
            System.out.println("Input not a number");
        } catch (ArrayIndexOutOfBoundsException e) { // input number > 3
            System.out.println("input > array size");
        } catch (NullPointerException e) { // index has not been instantiateds
            System.out.println("array "+id+" has not been instantiated");
        } catch (Exception e) {
            System.out.println("if everthing else fails");
        }
    }
}
