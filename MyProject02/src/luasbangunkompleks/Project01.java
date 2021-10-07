/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luasbangunkompleks;

/**
 *
 * @author ryanbrilianfatsena
 */
public class Project01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // To do code application logic here.
        double lingkaran = Lingkaran.hitungLuas(21);
        double persegi = Persegi.hitungLuas(42);
        
        double HasilTotalLuas = (lingkaran * 2) + persegi;
        
        System.out.println("Hasil dari Luas Bangun Datar tersebut yaitu : " + HasilTotalLuas);
    }
}
