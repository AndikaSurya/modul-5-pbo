/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lol;
import java.util.Scanner;
/**
 *
 * @author SISTEM
 */
public class Lol {


   private String type_buku;
   private String judul_buku;
   private int jumlah_halaman;

    public String getType_buku() {
        return type_buku;
    }

    public void setType_buku(String type_buku) {
        this.type_buku = type_buku;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public int getJumlah_halaman() {
        return jumlah_halaman;
    }

    public void setJumlah_halaman(int jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    
    }
    
   
    
    
    public void ankas(){
        Scanner keyboard = new Scanner(System.in);
    System.out.print("Masukkan Tipe Buku: ");
        type_buku = keyboard.nextLine();
        System.out.print("Masukkan Judul Buku: ");
        judul_buku = keyboard.nextLine();
        setType_buku(type_buku); 
     setJudul_buku(judul_buku);
     setJumlah_halaman(jumlah_halaman);
                }
        public void jumlahHal(){
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Masukkan Jumlah Halaman: ");
            jumlah_halaman = keyboard.nextInt();
            
        }

        
            
            
        }
        
    

   
