/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator1;

/**
 *
 * @author Praktikan
 */
public class Kalkulator1 {
 public static void main(String[] args) {

        secondcalss aw = new secondcalss();
        aw.setangka1(5);
        aw.setangka2(10);
        System.out.println("");
        System.out.println("penjumlahan");
        aw.setHasil(aw.getangka1() + aw.getangka2());
        System.out.println("Angka 1  = " + aw.getangka1());
        System.out.println("Angka 2  = " + aw.getangka2());
        System.out.println("Hasilnya = " + aw.getHasil());

       
        aw.setangka1(5);
        aw.setangka2(10);
        System.out.println("");
        System.out.println("perkalian");
        aw.setHasil(aw.getangka1() * aw.getangka2());
        System.out.println("Angka 1  = " + aw.getangka1());
        System.out.println("Angka 2  = " + aw.getangka2());
        System.out.println("Hasilnya = " + aw.getHasil());
     
   
        aw.setangka1(100);
        aw.setangka2(5);
        System.out.println("");
        System.out.println("pembangian ");
        aw.setHasil(aw.getangka1() / aw.getangka2());
        System.out.println("Angka 1  = " + aw.getangka1());
        System.out.println("Angka 2  = " + aw.getangka2());
        System.out.println("Hasilnya = " + aw.getHasil());

        
        aw.setangka1(20);
        aw.setangka2(10);
        System.out.println("");
        System.out.println("pengurangan");
        aw.setHasil(aw.getangka1() - aw.getangka2());
        System.out.println("Angka 1  = " + aw.getangka1());
        System.out.println("Angka 2  = " + aw.getangka2());
        System.out.println("Hasilnya = " + aw.getHasil());

    }
}

