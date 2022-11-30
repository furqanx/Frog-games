/**
 * Class Kotak contain various methods that can be use
 *
 * @author Furqan Al Ghifari Zulva
 * @version 1.0
 */

public class Kotak{
    private Koin coin;
    private Monster monsta;

    /**
     * Constructor for objects of class Katak
     */
    public Kotak(){
        coin = null;
        monsta = null;
    }
    
    /**
     * @param c
     */
    public void addKoin(Koin c){  
        coin = c;
    }
    
    /**
     * @param m
     */
    public void addMonster(Monster m){   
        monsta = m;
    }
    
    /**
     * @return coin
     */
    public Koin getKoin(){
        return coin;
    }
    
    /**
     * @return monsta
     */
    public Monster getMonster(){
        return monsta;
    }
    
    /**
     * @return true or false
     */
    public boolean isThereKoin(){
        if(coin != null){  
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * @return true or false
     */
    public boolean isThereMonster(){
        if(monsta != null){  
            return true;
        }
        else{
            return false;
        }
    }
}
