/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_datar;

/**
 *
 * @author Aprilia
 */
public class PersegiPanjang {
    public class Persegi_Panjang {
    int p,l,luas,keliling;
    
    public void setPanjang(int p) {
        this.p = p;
    }
    
    public void setLebar(int L) {
        this.l= L;
    }
    
    public void setLuas() {
        this.luas = p * l;
    }
    
    public void setKeliling() {
        this.keliling = 2 * (p+l);
    } 
    
    public int getLuas() {
        return luas;
    }
    
    public int getKeliling() {
        return keliling;
    }
        
    
}
    
}
