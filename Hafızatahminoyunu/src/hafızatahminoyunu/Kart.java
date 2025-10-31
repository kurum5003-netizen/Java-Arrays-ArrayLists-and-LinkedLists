package hafızatahminoyunu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BERK
 */
public class Kart {
    private char isim;
    private boolean tahmin=false;
    
    public Kart(char isim){
        this.isim=isim;
        
        
    }

    
    public char getIsim() {
        return isim;
    }

    
    public void setIsim(char isim) {
        this.isim = isim;
    }

    
    public boolean isTahmin() {
        return tahmin;
    }

    
    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }
    
    
    
    
    
    
    
    
}
