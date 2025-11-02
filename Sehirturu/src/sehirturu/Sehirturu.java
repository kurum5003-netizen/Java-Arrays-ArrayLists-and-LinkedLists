/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sehirturu;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author BERK
 */
public class Sehirturu {
    public static void islemler(){
        String islem="0-İslemleri gorüntüle\n" +"1-İleri sehir turu\n" +"2-Geri sehir turu\n" +"3-cıkıs";
        
        System.out.println(islem +"\nSeciniz:");
        
        
    }
    
    public static void sehrigez(LinkedList<String> st){
        ListIterator<String> a=st.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean cıkıs=true;
        boolean ileri=false;
         if(!a.hasNext()) {
               System.out.println("şehir bulunamadı!!!");
               return;
           }
        while(cıkıs){
             islemler();
            int islem=scanner.nextInt();
          
          
        switch(islem){
             case 0:{ break;}
             case 1:{ 
                   if(a.hasNext()){
                    System.out.println("diger sehre ilerleniyor");
                       System.out.println("ilerlenilen sehir:" + a.next());
                       ileri=true;
                }
                   else{
                       System.out.println("şehir bulunamadı!");
                    cıkıs=false;
                   }
            
            break;
            
            
            }
            case 2:{ 
                if(ileri){
                    a.previous();
                    ileri=false;
                }
                if(a.hasPrevious()){
                    System.out.println("geri gidiliyor");
                    System.out.println("dönülen sehir:" + a.previous());
                }
                else{
                    System.out.println("şehir bulunamadı!");
                    cıkıs=false;
                }
                   
                    
                    break;
                    
                             }
            case 3:{ System.out.println("cıkıs yapılıyor..."); cıkıs=false; break;}
            
            
        }
        }
        
        
        
        
        
       
        
    }
    
   

    public static void main(String[] args) {
       LinkedList<String> sehirturu = new LinkedList<String>(); 
        sehirturu.add("adana");
        sehirturu.add("zonguldak");
        sehirturu.add("izmir");
        sehirturu.add("ankara");
        
        sehrigez(sehirturu);
        
        
        
        
   
    }
    
}
