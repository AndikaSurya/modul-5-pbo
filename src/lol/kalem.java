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
public class kalem {
    public void enter(){
        
        
    }
    public static void main(String[] args) {
        exception();
      
    
    
    
    }

    public static void exception() {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        String type_buku;
        int jumlah_halaman = 0;
        String judul_buku ;
        int code;
        
        Lol o = new Lol();
        
        
            o.ankas();    
            
            
            kalem k = new kalem();
            boolean lanjutkanInput = true;
            
            
            
            do{
                try{
                    System.out.print("Masukkan Jumlah Halaman: ");
                    jumlah_halaman = keyboard.nextInt();
                    lanjutkanInput = false;
                    
                    
                    
                    o.setJumlah_halaman(jumlah_halaman);
                    System.out.println("Tipe Buku: "+o.getType_buku());
                    System.out.println("Judul Buku: "+o.getJudul_buku());
                    System.out.println("Jumlah halaman: "+o.getJumlah_halaman());
                     System.out.println("apakah ingin mengulang?");
                    System.out.println("jika ya 1)");
                    System.out.println("jika tidak 0)");
                    code = keyboard.nextInt();
                    
                }
                catch(Exception e){
                    System.out.println("Silahkan Coba Lagi jumlah halaman harus int");
                    keyboard.nextLine();
                    o.setJumlah_halaman(jumlah_halaman);
                    System.out.println("Tipe Buku: "+o.getType_buku());
                    System.out.println("Judul Buku: "+o.getJudul_buku());
                    System.out.println("Jumlah halaman: "+o.getJumlah_halaman());
                    System.out.println("apakah ingin mengulang?");
                    System.out.println("jika ya 1)");
                    System.out.println("jika tidak 0)");
                    code = keyboard.nextInt();
                }
                
            }
            
            while(code != 0);//
        }
    }

