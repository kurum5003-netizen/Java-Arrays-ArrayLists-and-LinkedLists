/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hafızatahminoyunu;

import java.util.Scanner;


/**
 *
 * @author BERK
 */
public class Hafızatahminoyunu {
  private static  Kart[][] kart = new Kart[4][4];
  private static Scanner scanner =new Scanner(System.in); 
  
    

    
    public static void main(String[] args) {
        kart[0][0] = new Kart('A');
        kart[0][1] = new Kart('C');
        kart[0][2] = new Kart('B');
        kart[0][3] = new Kart('D');
        kart[1][0] = new Kart('G');
        kart[1][1] = new Kart('E');
        kart[1][2] = new Kart('F');
        kart[1][3] = new Kart('H');
        kart[2][0] = new Kart('D');
        kart[2][1] = new Kart('F');
        kart[2][2] = new Kart('C');
        kart[2][3] = new Kart('H');
        kart[3][0] = new Kart('E');
        kart[3][1] = new Kart('A');
        kart[3][2] = new Kart('G');
        kart[3][3] = new Kart('B');
        
        int i=0;
        
        
        
        
        while(!oyunBittiMi()){
            
            oyuntahtası();
            oyun(i);
            
            
            
            
        }
        
        
       
    }
    
    public static void oyuntahtası(){
        int i,j;
        for( i =0;i<kart.length;i++){
            for( j=0;j<kart.length;j++){
                 if(kart[i][j].isTahmin()){
                     System.out.print("|" + kart[i][j].getIsim() +"|\t");
                 }
                 else{
                     System.out.print("| |\t");
                 }
                
            }
            System.out.println("");
        }
        
        
        
       
    }
    
    public static void oyun(int o){
        
        int i ,j,a,b;
        System.out.println("(yalnızca 0 ve 3 arası değerler geçerli)boşluk bırakarak i ve j değerlerini giriniz(1.kartı seçiniz:");
        i=scanner.nextInt();
        j=scanner.nextInt();
   

        kart[i][j].setTahmin(true);
        oyuntahtası();
       System.out.println("(yalnızca 0 ve 3 arası değerler geçerli)boşluk bırakarak a ve b değerlerini giriniz(1.kartı seçiniz:");
        a=scanner.nextInt();
        b=scanner.nextInt();
      
        if (i == a && j == b) {
    System.out.println("Aynı kartı iki kez seçemezsin!");
    kart[i][j].setTahmin(false); 
    return;
}


        if(kart[i][j].getIsim()==kart[a][b].getIsim()){
            kart[a][b].setTahmin(true);
        
           
        }
        else
        {
            kart[i][j].setTahmin(false);
            
        }
        
        
        
        
    }
    
    public static boolean oyunBittiMi() {
    for (int i = 0; i < kart.length; i++) {
        for (int j = 0; j < kart[i].length; j++) {
            if (!kart[i][j].isTahmin()) { // hala açılmamış kart varsa
                return false;
            }
        }
    }
    return true; 
}

    
    
    
    
    
    

   
    
}
