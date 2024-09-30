package bangun_datar;


/**
 *
 * @author Shifaa
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
