/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;



/**
 *
 * @author b404-3
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("notu giriniz");
     
        Scanner girdi = new Scanner(System.in);
        
        int sonuc=girdi.nextInt();
        
        
   if(sonuc>85)
            System.out.println("AA");
   else if (sonuc>75)
            System.out.println("BB");
   else if (sonuc>65)
            System.out.println("CC");
   else if(sonuc>55)
            System.out.println("DD");
   else 
            System.out.println("FF");
   

    }}