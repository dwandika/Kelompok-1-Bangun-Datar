package bangun_datar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shifaaun Nuriyah
 */
public class Persegi {

    int sisi,luas, keliling;

    public void setsisi(int sisi) {
        this.sisi = sisi;
    }

    public void setluas() {
        this.luas = sisi * sisi;
    }
    public void setkeliling() {
        this.keliling = sisi + sisi + sisi;
    }
    public int getluas() {
        return luas;
    }
    public int getkeliling() {
        return keliling;
    }
}
