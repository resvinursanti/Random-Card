/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarandomcard;

/**
 *
 * @author Evi
 */
public class JAVARANDOMCARD {
  

    public static void main(String[] args) {
        String[] jenisKartu = {
            "Hearts", "Diamonds", "Spades", "Clubs"
        };

        String[] Angka = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "J", "Q", "K", "AS"
        };

        // initialize KartuRemi
        int n = jenisKartu.length * Angka.length;
        String[] KartuRemi = new String[n];
        for (int i = 0; i < Angka.length; i++) {
            for (int j = 0; j < jenisKartu.length; j++) {
                KartuRemi[jenisKartu.length * i + j] = Angka[i] + "-" + jenisKartu[j];
            }
        }

        // Acak
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = KartuRemi[r];
            KartuRemi[r] = KartuRemi[i];
            KartuRemi[i] = temp;
        }

        // tampiilkan kartu
        int jumlahkartu = 52;
        int jmlOrg = 4;
        int jmlKartuperorang =  13;
        int sisa = jumlahkartu - (jmlOrg * jmlKartuperorang);
        int pakai = jmlOrg * jmlKartuperorang;
        int jenis_kartu= 4;
        for (int i = 0; i < jmlOrg; i++) {
            System.out.println("** Player " + (i + 1) + " **");
            for (int j = 0; j < jmlKartuperorang; j++) {
                System.out.println(KartuRemi[i + j * jenis_kartu] + " (Kartu " + (i + j * jenis_kartu) + ")");
            }
            
        }
        System.out.println("sisa kartu =" + sisa
       
        );
        for (int i = pakai; i < jumlahkartu; i++) {
            System.out.println(KartuRemi[i]);
        }

    }

}
