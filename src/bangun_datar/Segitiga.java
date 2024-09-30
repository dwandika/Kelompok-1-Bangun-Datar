/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_datar;

/**
 *
 * @author MyBook Hype
 */

public class Segitiga {
    double Sisi, alas, tinggi;
    double luas, keliling;
    public void setSisi(double sisi){
    this.Sisi = sisi;
    }
    public void setAlas(double alas){
    this.alas = alas;
    }
    public void setTinggi(double tinggi){
    this.tinggi = tinggi;
    
}
    public void setLuas(){
        this.luas = 0.5 * alas * tinggi;
    }
    public void setKeliling(){
        this.keliling = Sisi+Sisi+Sisi;
        
    }
    public double getLuas(){
     return luas;
    }
    public double getKeliling(){
        return keliling;
    }
}
