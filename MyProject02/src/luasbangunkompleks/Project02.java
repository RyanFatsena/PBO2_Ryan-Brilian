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
public class Project02 {
    public static void main (String args []) {
        
        double LingkaranBesar = Lingkaran.hitungLuas(14) / 2;
        double LingkaranKecil = Lingkaran.hitungLuas(7);
        
        double LuasDaerahAbuabu = LingkaranBesar - LingkaranKecil;
        
        System.out.println("Luas daerah yang berwarna abu-abu yaitu : " + LuasDaerahAbuabu);
    }
}
