/**
 * Class Kotak contain various methods that can be use
 *
 * @author Furqan Al Ghifari Zulva
 * @version 1.0
 */

public class Kotak{
    private KoinI coinI;
    private KoinII coinII;
    private KoinIII coinIII;
    private MonsterI monstaI;
    private MonsterII monstaII;
    private MonsterIII monstaIII;

    /**
     * Constructor for objects of class Katak
     */
    public Kotak(){
        coinI = null;
        coinII = null;
        coinIII = null;
        monstaI = null;
        monstaII = null;
        monstaIII = null;
    }
    
    /**
     * @param cI
     */
    public void addKoinI(KoinI cI){  
        coinI = cI;
    }

    /**
     * @param cII
     */
    public void addKoinII(KoinII cII){  
        coinII = cII;
    }

    /**
     * @param cIII
     */
    public void addKoinIII(KoinIII cIII){  
        coinIII = cIII;
    }
    
    /**
     * @param mI
     */
    public void addMonsterI(MonsterI mI){   
        monstaI = mI;
    }

    /**
     * @param mII
     */
    public void addMonsterII(MonsterII mII){   
        monstaII = mII;
    }

    /**
     * @param mIII
     */
    public void addMonsterIII(MonsterIII mIII){   
        monstaIII = mIII;
    }

    /**
     * @return coinI
     */
    public Koin getKoinI(){
        return coinI;
    }

    /**
     * @return coinII
     */
    public Koin getKoinII(){
        return coinII;
    }

    /**
     * @return coinIII
     */
    public Koin getKoinIII(){
        return coinIII;
    }
    
    /**
     * @return monstaI
     */
    public Monster getMonsterI(){
        return monstaI;
    }

    /**
     * @return monstaII
     */
    public Monster getMonsterII(){
        return monstaII;
    }

    /**
     * @return monstaIII
     */
    public Monster getMonsterIII(){
        return monstaIII;
    }
    
    /**
     * @return true or false
     */
    public boolean isThereKoinI(){
        if(coinI != null){  
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @return true or false
     */
    public boolean isThereKoinII(){
        if(coinII != null){  
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @return true or false
     */
    public boolean isThereKoinIII(){
        if(coinIII != null){  
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * @return true or false
     */
    public boolean isThereMonsterI(){
        if(monstaI != null){  
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @return true or false
     */
    public boolean isThereMonsterII(){
        if(monstaII != null){  
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @return true or false
     */
    public boolean isThereMonsterIII(){
        if(monstaIII != null){  
            return true;
        }
        else{
            return false;
        }
    }

}
