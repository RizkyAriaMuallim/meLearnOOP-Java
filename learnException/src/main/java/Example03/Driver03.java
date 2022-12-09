/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example03;

/**
 *
 * @author rizky
 */
public class Driver03 {
    /*
    Case : Error pada method menggunakan cara biasa
    */
    public static void main(String[] args) {
        TryException t = new TryException();
        
        t.setNumber(8, 10);
        System.out.println(t.getNumber(4));
    }
}
