import java.util.ArrayList;
import java.util.Collections;

/**
 * Class KotakPermainan contain various methods that can be use
 *
 * @author Furqan Al Ghifari Zulva
 * @version 1.0
 */
public class KotakPermainan{
    private Kotak[] boardGame;
    private int jumlahKotak;
    private int jumlahKoinI;
    private int jumlahKoinII;
    private int jumlahKoinIII;
    private int jumlahMonsterI;
    private int jumlahMonsterII;
    private int jumlahMonsterIII;
    private int[] acakKoin;
    private int[] acakMonster;

    /**
     * Constructor for objects of class KotakPermainan
     */
    public KotakPermainan(int j, int jkI, int jmI){
        jumlahKotak = j;
        jumlahKoinI = jkI;
        jumlahMonsterI = jmI;

        generateAcakI();
        inisialisasiKotakI();
    }

    public KotakPermainan(int j, int jkI, int jkII, int jmI, int jmII){
        jumlahKotak = j;
        jumlahKoinI = jkI;
        jumlahKoinII = jkII;
        jumlahMonsterI = jmI;
        jumlahMonsterII = jmII;

        generateAcakII();
        inisialisasiKotakII();
    }

    public KotakPermainan(int j, int jkI, int jkII, int jkIII, int jmI, int jmII, int jmIII){
        jumlahKotak = j;
        jumlahKoinI = jkI;
        jumlahKoinII = jkII;
        jumlahKoinIII = jkIII;
        jumlahMonsterI = jmI;
        jumlahMonsterII = jmII;
        jumlahMonsterIII = jmIII;

        generateAcakIII();
        inisialisasiKotakIII();
    }
 
    /**
     * Method for generating random number and store it in arrays
     */
    private void generateAcakI(){  
        ArrayList<Integer> list = new ArrayList<Integer>();
        acakKoin = new int[jumlahKoinI];
        acakMonster = new int[jumlahMonsterI];

        for(int i=0; i<jumlahKotak; i++){ 
            list.add(i);
            Collections.shuffle(list);
        }
        
        for(int i=0; i<jumlahKoinI; i++){
            acakKoin[i] = list.get(i); 
        }
        
        for(int i=jumlahKoinI; i<jumlahKoinI+jumlahMonsterI; i++){
            acakMonster[i-jumlahKoinI] = list.get(i);
        }
        
    }

    private void generateAcakII(){  
        ArrayList<Integer> list = new ArrayList<Integer>();
        acakKoin = new int[jumlahKoinI+jumlahKoinII];
        acakMonster = new int[jumlahMonsterI+jumlahMonsterII]; 

        for(int i=0; i<jumlahKotak; i++){ 
            list.add(i);
            Collections.shuffle(list);
        }
        
        for(int i=0; i<jumlahKoinI; i++){
            acakKoin[i] = list.get(i); 
        }
        
        for(int i=jumlahKoinI; i<jumlahKoinI+jumlahKoinII; i++){
            acakKoin[i] = list.get(i); 
        }
        
        for(int i=jumlahKoinI+jumlahKoinII; i<jumlahKoinI+jumlahKoinII+jumlahMonsterI; i++){
            acakMonster[i-(jumlahKoinI+jumlahKoinII)] = list.get(i);
        }

        for(int i=jumlahKoinI+jumlahKoinII+jumlahMonsterI; i<jumlahKoinI+jumlahKoinII+jumlahMonsterI+jumlahMonsterII; i++){
            acakMonster[i-(jumlahKoinI+jumlahKoinII)] = list.get(i);
        }
        
    }

    private void generateAcakIII(){  
        ArrayList<Integer> list = new ArrayList<Integer>();
        acakKoin = new int[jumlahKoinI+jumlahKoinII+jumlahKoinIII]; 
        acakMonster = new int[jumlahMonsterI+jumlahMonsterII+jumlahMonsterIII]; 

        for(int i=0; i<jumlahKotak; i++){ 
            list.add(i);
            Collections.shuffle(list);
        }
        
        for(int i=0; i<jumlahKoinI; i++){
            acakKoin[i] = list.get(i); 
        }

        for(int i=jumlahKoinI; i<jumlahKoinI+jumlahKoinII; i++){
            acakKoin[i] = list.get(i); 
        }

        for(int i=jumlahKoinI+jumlahKoinII; i<jumlahKoinI+jumlahKoinII+jumlahKoinIII; i++){
            acakKoin[i] = list.get(i); 
        }
        
        for(int i=jumlahKoinI+jumlahKoinII+jumlahKoinIII; i<jumlahKoinI+jumlahKoinII+jumlahKoinIII+jumlahMonsterI; i++){
            acakMonster[i-(jumlahKoinI+jumlahKoinII+jumlahKoinIII)] = list.get(i);
        }                          

        for(int i=jumlahKoinI+jumlahKoinII+jumlahKoinIII+jumlahMonsterI; i<jumlahKoinI+jumlahKoinII+jumlahKoinIII+jumlahMonsterI+jumlahMonsterII; i++){
            acakMonster[i-(jumlahKoinI+jumlahKoinII+jumlahKoinIII)] = list.get(i);
        }                         
        
        for(int i=jumlahKoinI+jumlahKoinII+jumlahKoinIII+jumlahMonsterI+jumlahMonsterII; i<jumlahKoinI+jumlahKoinII+jumlahKoinIII+jumlahMonsterI+jumlahMonsterII+jumlahMonsterIII; i++){
            acakMonster[i-(jumlahKoinI+jumlahKoinII+jumlahKoinIII)] = list.get(i);
        }
    }
    
    /**
     * Method for initialiate board games and spread Coins and Monsters to each indexes 
     */
    private void inisialisasiKotakI(){
        boardGame = new Kotak[jumlahKotak];
        KoinI koinI = new KoinI(10);
        MonsterI monsterI = new MonsterI(-5, "Hydra");

        for(int i=0; i<jumlahKotak; i++){
            boardGame[i] = new Kotak();
        }
        
        for(int i=0; i<jumlahKoinI; i++){
            boardGame[acakKoin[i]].addKoinI(koinI);    
        }                        
        
        for(int i=0; i<jumlahMonsterI; i++){
            boardGame[acakMonster[i]].addMonsterI(monsterI);
        }                            
        
    }

    private void inisialisasiKotakII(){
        boardGame = new Kotak[jumlahKotak];
        KoinI koinI = new KoinI(10);
        KoinII koinII = new KoinII(20);
        MonsterI monsterI = new MonsterI(-5, "Hydra");
        MonsterII monsterII = new MonsterII(-25, "Troll");

        for(int i=0; i<jumlahKotak; i++){
            boardGame[i] = new Kotak();
        }
        
        for(int i=0; i<jumlahKoinI; i++){
            boardGame[acakKoin[i]].addKoinI(koinI);    
        }
        
        for(int i=0; i<jumlahKoinII; i++){
            boardGame[acakKoin[i]].addKoinII(koinII);    
        }
        
        for(int i=0; i<jumlahMonsterI; i++){
            boardGame[acakMonster[i]].addMonsterI(monsterI);
        }                            
        
        for(int i=0; i<jumlahMonsterII; i++){
            boardGame[acakMonster[i]].addMonsterII(monsterII);
        }  

    }

    private void inisialisasiKotakIII(){
        boardGame = new Kotak[jumlahKotak];
        KoinI koinI = new KoinI(10);
        KoinII koinII = new KoinII(20);
        KoinIII koinIII = new KoinIII(100);
        MonsterI monsterI = new MonsterI(-5, "Hydra");
        MonsterII monsterII = new MonsterII(-25, "Troll");
        MonsterIII monsterIII = new MonsterIII(-50, "Cerberus");

        for(int i=0; i<jumlahKotak; i++){
            boardGame[i] = new Kotak();
        }
        
        for(int i=0; i<jumlahKoinI; i++){
            boardGame[acakKoin[i]].addKoinI(koinI);    
        }
        
        for(int i=0; i<jumlahKoinII; i++){
            boardGame[acakKoin[i]].addKoinII(koinII);    
        }

        for(int i=0; i<jumlahKoinIII; i++){
            boardGame[acakKoin[i]].addKoinIII(koinIII);    
        }
        
        for(int i=0; i<jumlahMonsterI; i++){
            boardGame[acakMonster[i]].addMonsterI(monsterI);
        }                            
        
        for(int i=0; i<jumlahMonsterII; i++){
            boardGame[acakMonster[i]].addMonsterII(monsterII);
        }
        
        for(int i=0; i<jumlahMonsterIII; i++){
            boardGame[acakMonster[i]].addMonsterIII(monsterIII);
        }  

    }
    
    /** 
     * if each index has  :
     * - Coin : therefore increase it's value
     * - Monster : therefore decrease it's value
     * 
     * @param posisi 
     * @return getNilai()
     */
    public int contain(int posisi){
        if(boardGame[posisi].isThereKoinI()){   
            return boardGame[posisi].getKoinI().getNilai(); 
        }
        else if(boardGame[posisi].isThereKoinII()){   
            return boardGame[posisi].getKoinII().getNilai(); 
        }
        else if(boardGame[posisi].isThereKoinIII()){   
            return boardGame[posisi].getKoinIII().getNilai(); 
        }
        else if(boardGame[posisi].isThereMonsterI()){   
            return boardGame[posisi].getMonsterI().getNilai();
        }
        else if(boardGame[posisi].isThereMonsterII()){   
            return boardGame[posisi].getMonsterII().getNilai();
        }
        else if(boardGame[posisi].isThereMonsterIII()){   
            return boardGame[posisi].getMonsterIII().getNilai();
        }
        else{
            return 0;
        }
        
    }
}