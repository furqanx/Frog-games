/**
 * Class Koin contain various methods that can be use
 *
 * @author Furqan Al Ghifari Zulva
 * @version 1.0
 */
public class Koin{
    private int nilai;

    /**
     * Constructor for objects of class Katak
     */
    public Koin(){  
        nilai = 0;  
    }

    /**
     * @param nilai 
     */
    public Koin(int nilai){
        this.nilai = nilai;
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
