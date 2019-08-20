/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek.pkg1;

/**
 *
 * @author USER
 */
public class datadiri {
    
    public static void main(String[] args) {
        // membuat variabel
        String nama, motto, pekerjaan, alamat;
        int  penghasilan, usia;
        double tinggi;
  
        // mengisi variabel 
        nama = "Cimeng Bin Gomeng";
        motto = "Sebelum janur kuning melengkung, masih bisa di tikung";
        pekerjaan = "Jual Cireng ireng";
        alamat = "Di Pinggir Surga sebelum pertigaan neraka";
        penghasilan = 1000;
        usia = 250;
        tinggi = 350;
    
        // mencetak ke layar isi variabel
        System.out.println("Nama: " + nama);
        System.out.println("Motto: " + motto);
        System.out.println("Alamat: " + alamat);
        System.out.println("Penghasilan: " + "Rp." + penghasilan + "kuadraliun");
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");
    }
}