/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6kambingstatic;

/**
 *
 * @author Muhammad Alvin Rizqi Ramadhan
 * @author NIM 10119913
 */

public class PBO10119913Latihan6KambingStatic {

    public static final String NAMA_KAMBING = "MIDUN";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING +
                " memiliki kambing sebanyak "+ 
                Mamalia.jumlahKambing);
    }
    
}
