/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sarkıcılar;

import java.util.ArrayList;

/**
 *
 * @author BERK
 */
public class Sarkıcılar {
private ArrayList<String> arrayl = new ArrayList<String>();


public void sarkıcıları_bastır(){
    System.out.println("şarkıcı listesinde\t" + arrayl.size() + " " +"tane şarkıcı var"); 
    for(int i=0;i<arrayl.size();i++){
        System.out.println((i+1) + " " +".şarkıcı\t" + arrayl.get(i));
        
    }
    
    
}

public void sarkıcıları_sil(int a){
  String isim=arrayl.get(a);
  arrayl.remove(a);
    System.out.println(isim + "isimli şarkıcı listeden silindi\n");
    
    
}

public void sarkıcıları_güncelle(int a,String isim){
   arrayl.set(a, isim);
    System.out.println("\nkişi güncellendi");
    
    
}

public void sarkıcıları_ekle(String isimm){
    arrayl.add(isimm);
    System.out.println("\nlisteniz güncellendi...");
    
    
}

public void sarkıcıları_ara(String isim){
    int pozisyon=arrayl.indexOf(isim);
    
    if(pozisyon>=0){
        System.out.println("\nşarkıcı bulundu");
        System.out.println("\nşarkıcı adı:" + isim + "\t\npozisyonu:" + (pozisyon + 1));
    }
    
    
    
}








   
    
}
