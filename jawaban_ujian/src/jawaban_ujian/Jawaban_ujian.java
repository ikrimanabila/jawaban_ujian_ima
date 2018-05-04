/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jawaban_ujian;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Jawaban_ujian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jk,jam,film,total,harga = 0,teater = 0;
        String nama_film,jam_ke,teater_brp = null;
        Scanner inputan = new Scanner(System.in);
        
        for(int i=1;i<=2;i++){
        System.out.println("film : ");
        System.out.println("1.Avengers : infinity war -> 50.000");
        System.out.println("19.00 : Theater 2");
        System.out.println("23.00 : Theater 1");
        System.out.println("2.Rampage -> 50.000");
        System.out.println("19.00 : Theater 1");
        System.out.println("23.00 : Theater 2");
        System.out.print("masukan film [1/2] : ");
        film=inputan.nextInt();
        
        System.out.print("masukan jam [19/23] : ");
        jam = inputan.nextInt();
        
        System.out.print("pesan jumlah kursi : ");
        jk=inputan.nextInt();
     
        switch(film){
                 case 1:
                     nama_film="Avengers : ifinity war";
                     harga=50000;
                     break;
                 case 2:
                     nama_film="Rampage";
                     harga=50000;
                     break;
                 default:
                      nama_film="film tidak tersedia";
                     break;
        }
        switch(jam){
                 case 19:
                     jam_ke="19.00";
                     teater_brp="teater 1";
                     teater_brp="teater 2";
                     break;
                 case 23:
                     jam_ke="23.00";
                     teater_brp="teater 1";
                     teater_brp="teater 2";
                     break;
                 default:
                     jam_ke="tidak tersedia";
                     teater_brp="tidak tersedia";                    
                     break;
            }
       
        total=harga*jk;
        System.out.println("terimakasih telah memesan tiket bioskop dengan rincian sebagai berikut : ");
        System.out.println("film : "+nama_film);
        System.out.println("jam : "+jam_ke);
        System.out.println("teater : "+teater_brp);
        System.out.println("harga satuan : "+harga);
        System.out.println("jumlah kursi : "+jk);
        System.out.println("total bayar : "+total);
        System.out.println("silahkan membayar");
            System.out.println();
    }
    
}
}
