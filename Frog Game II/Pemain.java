/**
 * Class Pemain contain various methods that can be use 
 *
 * @author Furqan Al Ghifari Zulva 
 * @version 1.0
 */
public class Pemain{
    private String nama;
    private int nilai;

    /**
     * Constructor for objects of class Pemain
     */
    public Pemain(String nama){
        this.nama = nama;
    }

    /**
     * @return nama
     */
    public String getNama(){
        return nama;
    }
    
    /**
     * @param nama
     */
    public void setNama(String nama){
        this.nama = nama;
    }
    
    /**
     * @return nilai
     */
    public int getNilai(){
        return nilai;
    }
    
    /**
     * @param nilaibaru
     */
    public void setNilai(int nilaibaru){
        nilai = nilaibaru;
    }
}
