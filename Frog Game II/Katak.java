/**
 * Class Katak contain various methods that can be use 
 *
 * @author Furqan Al Ghifari Zulva
 * @version 1.0
 */
public class Katak{
    private int posisi;
    private int skor;

    /**
     * Constructor for objects of class Katak
     */
    public Katak(){
        posisi = 0;
        skor = 100;
    }
    
    /**
     * @return posisi
     */
    public int getPosisi(){
        return posisi;
    }
    
    /**
     * @param posisiBaru
     */
    public void setPosisi(int posisiBaru){
        posisi = posisiBaru;
    }
    
    /**
     * @return skor
     */
    public int getSkor(){
        return skor;
    }
    
    /**
     * @param skorBaru
     */
    public void setSkor(int skorBaru){
        skor = skorBaru;
    }
    
    /**
     * Setting frog movements
     */
    public void loncatDekatDepan(){   
        posisi += 1;
    }

    public void loncatJauhDepan(){
        posisi += 2;
    }
    
    public void loncatDekatBelakang(){   
        posisi -= 1;
    }

    public void loncatJauhBelakang(){
        posisi -= 2;
    }
    
}
