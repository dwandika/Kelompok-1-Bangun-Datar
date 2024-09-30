package bangun_datar;

/**
 *
 * @author ADMIN
 */
public class jajargenjang {
    int alas,tinggi,panjang,lebar, luas,keliling;
    
    public void setAlas(int alas){
        this.alas = alas;
    }
    public void setTinggi(int tinggi){
        this.tinggi=tinggi;
    }
    public void setPanjang(int panjang){
        this.panjang=panjang;
    }
    public void setLebar(int lebar){
        this.lebar= lebar;
    }
    public void setLuas(){
        this.luas= alas*tinggi;
    }
    public void setKeliling(){
        this.keliling=2*(panjang+lebar);
    }
    public int getLuas(){
    return luas;
    }
    public int getKeliling(){
    return keliling;
    }
}
