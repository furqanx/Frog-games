/**
 * SuperClass Monster
 *
 * @author Furqan Al Ghifari Zulva
 * @version 1.0
 */
public class Monster{
    private int nilai;
    private String nama;

    /**
    * Constructor for objects of class Katak
    */
    public Monster(){  
        nama = "Monster";  
        nilai = 0;  
    }

    /**
     * @param nilai 
     * @param nama 
     */
    public Monster(int nilai, String nama){
        this.nilai = nilai;
        this.nama = nama;
    }
    
    /**
     * @return nilai 
     */
    public int getNilai(){
        return nilai;
    }
}
