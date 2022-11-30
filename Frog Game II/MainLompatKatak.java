import java.util.Scanner;
/**
 * Class where the Game running and the classes are being implemented
 * The Class consist of 3 level. if the game is over, player can choose 
 * whether want to replay again or not.  
 *
 * @author Furqan Al Ghifari Zulva
 * @version 1.0
 */
public class MainLompatKatak{
    /**
     * Contain the algorithm for the game 
     */
    static void mainkan(){
        Scanner in = new Scanner(System.in);
        // KotakPermainan kp = new KotakPermainan(505, 300, 50); // ----
        Katak katak = new Katak();
        int jk = 0, jm = 0;
    
        System.out.println("\n\n--- Lompat hai katak, Lompat ! ---");
        System.out.print("\n\nMasukkan nama pemain : ");
        String nama = in.nextLine();
        Pemain pemain = new Pemain(nama);

        System.out.println("\n\n1. Easy");
        System.out.println("2. Intermediate");
        System.out.println("3. Hard");
        System.out.print("Pilih level yang anda inginkan : ");
        int level = in.nextInt();

        if(level == 1){
            jk = 300;
            jm = 100;
        }
        else if(level == 2){
            jk = 250;
            jm = 150;
        }
        else if(level == 3){
            jk = 200;
            jm = 200;
        }

        KotakPermainan kp = new KotakPermainan(505, jk, jm);

        System.out.print("\n\nNilai awal pemain : ");
        System.out.println(pemain.getNilai());

        while(true){
            System.out.println("\nskor : "+ katak.getSkor());
            System.out.println("posisi : "+ katak.getPosisi());

            System.out.print("gunakan 'A', 'S' atau 'D', 'F' : ");
            char direction = in.next().charAt(0);

            if(direction == 'f'|| direction == 'F'){
                katak.loncatJauhDepan();
                katak.setSkor(kp.contain(katak.getPosisi()) + katak.getSkor());
            }
            else if(direction == 'd'|| direction == 'D'){
                katak.loncatDekatDepan();
                katak.setSkor(kp.contain(katak.getPosisi()) + katak.getSkor());
                // kp.contain(katak.getPosisi()) = null;
                // kp.boardGame[katak.getPosisi()] = null;
            }
            else if(direction == 's'|| direction == 'S'){
                if(katak.getPosisi() == 0){
                    System.out.println("\ntidak bisa mundur !!");
                    continue;    
                }
                katak.loncatDekatBelakang();
                katak.setSkor(kp.contain(katak.getPosisi()) + katak.getSkor());
            }
            else if(direction == 'a'|| direction == 'A'){
                if(katak.getPosisi() == 0){
                    System.out.println("\ntidak bisa mundur !!");
                    continue;    
                }
                katak.loncatJauhBelakang();
                katak.setSkor(kp.contain(katak.getPosisi()) + katak.getSkor());
            }

            if(katak.getPosisi() >= 500){
                pemain.setNilai(katak.getSkor());
                break;
            }

        }

        if(pemain.getNilai() >= 1500 ){
                System.out.println("\n\nKamu hebat "+pemain.getNama()+"!!!");
                System.out.println("Kamu mampu mendapatkan skor yang tinggi yaitu "+pemain.getNilai());
        }
        else if(pemain.getNilai() >= 500 && pemain.getNilai() < 1500 ){
                System.out.println("\n\nLumayan laa. Kamu mendapatkan skor sebesar "+pemain.getNilai());
        }
        else if(pemain.getNilai() < 500){
                System.out.println("\n\nKamu tidak pandai bermain ya ??... skor kamu hanya sebesar "+pemain.getNilai());
        }
    }

    public static void main(String[] args){
        MainLompatKatak game = new MainLompatKatak();
        Scanner input = new Scanner(System.in);

        while(true){
            mainkan();
            System.out.print("Apakah kamu ingin bermain lagi ? [y/n] : ");
            char ans = input.next().charAt(0);
            if(ans == 'y' || ans == 'Y'){
                continue;
            }
            else if(ans == 'n' || ans == 'N'){
                break;
            }
        }
        
    }
}
