/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sarkıcılar;

import java.util.Scanner;

/**
 *
 * @author BERK
 */
public class Test {
    private static Scanner scanner=new Scanner(System.in);
    private static Sarkıcılar sarkıcılar=new Sarkıcılar();
    
    
    
     public static void main(String[] args) {
         int i=1,a; 
         System.out.println("** ŞARKICILAR PROGRAMINA HOŞGELDİN **");
        
         
          while(i>0){
              Islemler();
              a=scanner.nextInt();
              scanner.nextLine();
              if(a>5 || a<0){
                  System.out.println("lütfen geçerli bir sayı giriniz!!");
                  continue;
              }
              switch(a){
                  case 1:{
                      System.out.println("aramak istedğiniz şarkıcının ismi nedir"); 
                       String b=scanner.nextLine();
                       sarkıcılar.sarkıcıları_ara(b);
                       break;
                  }
                  case 2:{
                      System.out.println("listeye eklemek istedğiniz şarkıcının adı");
                      String b=scanner.nextLine();
                      sarkıcılar.sarkıcıları_ekle(b);
                      break;
                      
                  }
                  case 3:{
                      System.out.println("silmek istedğiniz şarkıcının pozisyonu");
                      int c=scanner.nextInt();
                      int d=c-1;
                      sarkıcılar.sarkıcıları_sil(d);
                      break;
                      
                  }
                  case 4:{
                      int c; String d;
                      System.out.println("güncellemek istedğiniz şarkıcının pozisyonu:");
                      c=scanner.nextInt();
                      int f=c-1;
                      scanner.nextLine();
                      System.out.println("istedğiniz yeni isim:");
                      d=scanner.nextLine();
                      sarkıcılar.sarkıcıları_güncelle(f, d);
                      break;
                  }
                  
                  case 5:{
                      
                     sarkıcılar.sarkıcıları_bastır();
                      break;
                  }
                  case 0:{
                      System.out.println("programdan çıkılıyor...");
                      i=0;
                      break;
                  }
                  
                  
                  
                  
              }
              
              
              
              
              
          }
        
        
        
        
        
        
        
        
        
        
 
    }
     
     public static void Islemler(){
         
         System.out.println("\n1.Şarkıcı ara\n" + "2.Şarkıcı ekle\n" +"3.Şarkıcı sil\n"+"4.Şarkıcı güncelle\n" +"5.şarkıcıları göster\n" +" çıkış için 0 a basın\n" );
         
         System.out.println("lütfen işlem numaralarına göre işlem seçiniz");
         
         
         
         
     }
     
     
     
     
     
    
}
