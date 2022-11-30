import java.util.Scanner;
/**
 * Class where the Game running and the classes are being implemented
 * The Class consist of 3 level. if the game is over, player can choose 
 * whether want to replay again or not.  
 *
 * Here, i'm implementing :
 * - Exception
 * - Generics
 * - Inheritance
 * - Collection
 * - Annotation 
 * 
 * @author Furqan Al Ghifari Zulva
 * @version 1.0
 * link Gdrive : https://drive.google.com/drive/folders/1nMT3gTcV0widC__VD4kAxJ_u9kowWLA3?usp=share_link
 */
public class MainLompatKatak{
    /**
     * Contain the algorithm for the game 
     */
    static void mainkan(){
        Scanner in = new Scanner(System.in);
        Katak katak = new Katak();
        int jkI = 0, jkII = 0, jkIII = 0, jmI = 0, jmII = 0, jmIII = 0;
    
        System.out.println("\n\n--- Lompat hai katak, Lompat ! ---");
        System.out.print("\n\nMasukkan nama pemain : ");
        String nama = in.nextLine();
        Pemain pemain = new Pemain(nama);

        System.out.println("\n\n1. Easy");
        System.out.println("2. Intermediate");
        System.out.println("3. Hard");
        System.out.print("Pilih level yang anda inginkan : ");
        int level = in.nextInt();

        KotakPermainan kp = null;

        if(level == 1){
            jkI = 300;
            jmI = 100;

            kp = new KotakPermainan(500, jkI, jmI);
        }
        else if(level == 2){
            jkI = 250;
            jkII = 50;
            jmI = 60;
            jmII = 40;

            kp = new KotakPermainan(500, jkI, jkII, jmI, jmII);
        }
        else if(level == 3){
            jkI = 250;
            jkII = 40;
            jkIII = 10;
            jmI = 60;
            jmII = 35;
            jmIII = 5;

            kp = new KotakPermainan(500, jkI, jkII, jkIII, jmI, jmII, jmIII);
        }

        System.out.print("\n\nNilai awal pemain : ");
        System.out.println(pemain.getNilai());

        while(true){
            try{
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
                else{
                    System.out.print("\nMasukkan huruf yang valid dong !!!\n");
                    continue;
                }
            }
            catch(Exception e){
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
        Scanner input = new Scanner(System.in);

        while(true){
            mainkan();
            System.out.print("Apakah kamu ingin bermain lagi ? [y/n] : ");
            char ans = input.next().charAt(0);
            if(ans == 'y' || ans == 'Y'){
                continue;
            }
            else if(ans == 'n' || ans == 'N'){
                System.out.println("Selamat Tinggal !!");
                break;
            }
        }    
    }

}
