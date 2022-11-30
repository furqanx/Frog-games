import java.util.ArrayList;
import java.util.Collections;
// import java.util.Random;

/**
 * Class KotakPermainan contain various methods that can be use
 *
 * @author Furqan Al Ghifari Zulva
 * @version 1.0
 */
public class KotakPermainan{
    private Kotak[] boardGame;
    private int jumlahKotak;
    private int jumlahKoin;
    private int jumlahMonster;
    private int[] acakKoin;
    private int[] acakMonster;

    /**
     * Constructor for objects of class KotakPermainan
     */
    public KotakPermainan(int j, int jk, int jm){
        jumlahKotak = j;
        jumlahKoin = jk;
        jumlahMonster = jm;

        generateAcak();
        inisialisasiKotak();

        // Koin koin = new Koin(10);
        // Monster monster = new Monster(-5, "Hydra");
    }
 
    /**
     * Method for generating random number and store it in arrays
     */
    private void generateAcak(){  
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Random random = new Random();
        acakKoin = new int[jumlahKoin];
        acakMonster = new int[jumlahMonster];

        // menghasilkan nilai acak sesuai dengan jumlahKotak
        for(int i=0; i<jumlahKotak; i++){ 
            list.add(i);
            Collections.shuffle(list);
        }
        
        for(int i=0; i<jumlahKoin; i++){
            acakKoin[i] = list.get(i); // untuk koin 
        }
        
        // mesti perbaiki  -- sudah diperbaiki namun perlu diperiksa lagi
        // int rand;
        for(int i=jumlahKoin; i<jumlahMonster + jumlahKoin; i++){
            // rand = random.nextInt(jumlahKotak);
            acakMonster[i-jumlahKoin] = list.get(i);
            // acakMonster[i] = random.nextInt(jumlahKotak);
        }
        
        /**   
        for(int i=0; i<jumlahKotak; i++){
            System.out.println(list.get(i));
        }
        */
    }
    
    /**
     * Method for initialiate board games and spread Coins and Monsters to each indexes 
     */
    private void inisialisasiKotak(){
        // int[] kotak = new int[jumlahKotak]; // ---
        boardGame = new Kotak[jumlahKotak];
        Koin koin = new Koin(10);
        Monster monster = new Monster(-5, "Hydra");
        // Koin koin = new Koin();
        // Monster monster = new Monster();

        for(int i=0; i<jumlahKotak; i++){
            boardGame[i] = new Kotak();
        }
        
        for(int i=0; i<jumlahKoin; i++){
            // kotak[acakKoin[i]] = koin.getNilai();
            // boardGame[acakKoin[i]] = koin.getNilai();
            // boardGame[acakKoin[i]].addKoin(koin = new Koin());
            boardGame[acakKoin[i]].addKoin(koin);  // perlu diperbaiki  // apakah array bisa diassign nilai seperti ini
            // boardGame[acakKoin[i]].addKoin(new Koin());  
        }                         // ragu
        
        for(int i=0; i<jumlahMonster; i++){
            // kotak[acakMonster[i]] = monster.getNilai();
            // boardGame[acakKoin[i]] = koin.getNilai();
            // boardGame[acakMonster[i]].addMonster(new Monster());
            // boardGame[acakMonster[i]].addMonster(new Monster(-5, "Hydra"));  // perlu diperbaiki  // apakah array bisa diassign seperti ini
            boardGame[acakMonster[i]].addMonster(monster);
        }                            // ragu
        
        // for(int i=0; i<jumlahKotak; i++){
        //     System.out.print(boardGame[i]+", ");
        // }
    }
    
    /** 
     * if each index has  :
     * - Coin : therefor increase the value to +10
     * - Monster : therefor decrease the value to -5
     * 
     * @param posisi 
     * @return getNilai()
     */
    public int contain(int posisi){
        // Kotak[] kotak = new Kotak();
        // Koin koin = new Koin(10);
        // Monster monster = new Monster(-5, "Hydra");
        // boardGame = new Kotak[jumlahKotak];   // tidak perlu

        //for(int i=0; i<jumlahKotak; i++){
        if(boardGame[posisi].isThereKoin()){   // masalahnya di isThereKoin()  -- perlu diperbaiki
            return boardGame[posisi].getKoin().getNilai(); 
        }
        else if(boardGame[posisi].isThereMonster()){   // masalahnya di isThereMonster()  -- perlu diperbaiki
            // System.out.println("monster = "+boardGame[posisi].getMonster().getNilai());
            return boardGame[posisi].getMonster().getNilai();
        }
        else{
            return 0;
        }
        
        
    }
}