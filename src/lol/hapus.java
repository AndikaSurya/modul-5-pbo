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
public class hapus {
  public static void main (String[] args){
        String[] Infobuku = new String[5]; 
        int code;
        KelolaBuku kb = new KelolaBuku();
        Scanner input = new Scanner(System.in);
            int data = 0; //tipe data buat simpan inputan

           
            try {

                do {
                    
                        System.out.println("masukkan data dengan format = Judul | Jumlah Halaman | Tipe Buku");
                        System.out.println("masukkan judul buku :");
                        String judul = input.next();
                        System.out.println("masukkan Jumlah Hal :");
                        int jumhal = input.nextInt();
                        System.out.println("masukkan type buku :");
                        String type = input.next();

                        kb.setJudul_buku(judul);
                        kb.setJumlah_hal(jumhal);
                        kb.setType_buku(type);
                        Infobuku[data] ="Judul: "+ kb.getJudul_buku() + ", Jumlah Halaman: " + kb.getJumlah_hal()+ ", Type: " + kb.getType_buku();
                    data++;
                    System.out.println("apakah ingin mengulang?");
                    System.out.println("jika ya 1)");
                    System.out.println("jika tidak 0)");
                    code = input.nextInt();
                    
                } while (code != 0);
            } catch (java.util.InputMismatchException | ArrayIndexOutOfBoundsException nama) {
                System.out.println(nama);
            }
            for (int i = 0; i < data; i++) {
                System.out.println(Infobuku[i]);
            }
        }  
    
}

