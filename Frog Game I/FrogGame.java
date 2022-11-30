import java.util.*;

/**
 * Game ini dibuat untuk menyelesaikan tugas PBO kelas A. 
 * Tugas katak adalah untuk mencapai posisi lebih dari 499.
 * Pada saat game dimulai, program akan menyebarkan koin beserta monster ke dalam array dari rentang posisi 0 - 499 secara random.
 * Jika katak menemukan koin, maka skor katak akan bertambah. sedangkan jika katak menemukan monster, maka skor katak akan berkurang.
 * Kondisi permainan berakhir adalah ketika katak telah mencapai posisi lebih dari 499 atau koin pemain kurang dari 0.
 * 
 * Fitur game ini termasuk didalamnya :
 *   - katak dapat melompat kedepan dan kebelakang
 *   - terdapat 3 buah level yaitu easy, intermediate, dan hard
 *   - terdapat 3 buah variansi koin dan 3 buah variansi monster 
 * 
 * Warning : 
 *     jika pemain memilih level III (Hard), berhati-hatilah dengan pengurangan koin sejumlah -125
 * 
 * @author : furqan al ghifari zulva
 * @authorNIM : 2108107010053
 * link google drive : https://drive.google.com/drive/folders/11evkeI6FF22sFzGKvte6yh5gr3YyPGQz?usp=sharing
 */
public class FrogGame{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int[] array = new int[499];
        int option, level;
        
        // menu utama
        menu();
        System.out.print("Masukkan pilihan anda: ");
        option = obj.nextInt();

        // memilih level
        System.out.println("\n");
        level();
        level = obj.nextInt();

        if(option == 1){
            System.out.println("\n\n\nSelamat datang !");
            System.out.println("Aturan permainan : ");
            System.out.println("- masukkan A untuk bergerak 4 kali ke kiri");
            System.out.println("- masukkan S untuk bergerak 2 kali ke kiri");
            System.out.println("- masukkan D untuk bergerak 2 kali ke kanan");
            System.out.println("- masukkan F untuk bergerak 4 kali ke kanan");
        }
        else{
            System.out.println("\n$$$ Selamat tinggal $$$");
            System.exit(0);
        }

        // skor awal dan posisi awal katak
        int score = 100;
        int position = 0;

        /** Level I */
        if(level == 1){
            int min = 1;
            int max = 490;

            // sebaran koin
            int i = 0;
            while(i <= 300){
                int random = (int) Math.round(min + Math.random()*(max - min));
                array[random] = 10;
                i++;
            }

            // sebaran monster
            int k = 0;
            while(k <= 100){
                int random2 = (int) Math.round(min + Math.random()*(max - min));
                array[random2] = -5;
                k++;
            }
        }
        /** level II */
        else if(level == 2){
            int min = 1;
            int max = 490;

            // sebaran koin
            int i = 0;
            while(i <= 250){
                int random = (int) Math.round(min + Math.random()*(max - min));
                array[random] = 10;
                i++; 
            }
            int j = 0;
            while(j <= 50){
                int random = (int) Math.round(min + Math.random()*(max - min));
                array[random] = 20;
                j++;
            }

            // sebaran monster
            int k = 0;
            while(k <= 60){
                int random2 = (int) Math.round(min + Math.random()*(max - min));
                array[random2] = -5;
                k++;
            }
            int l = 0;
            while(l <= 40){
                int random2 = (int) Math.round(min + Math.random()*(max - min));
                array[random2] = -25;
                l++;
            }
        }
        /** level III */
        else if(level == 3){
            int min = 1;
            int max = 490;
            
            // sebaran koin
            int i = 0;
            while(i <= 250){
                int random = (int) Math.round(min + Math.random()*(max - min));
                array[random] = 10;
                i++; 
            }
            int j = 0;
            while(j <= 40){
                int random = (int) Math.round(min + Math.random()*(max - min));
                array[random] = 20;
                j++;
            }
            int k = 0;
            while(k <= 10){
                int random2 = (int) Math.round(min + Math.random()*(max - min));
                array[random2] = 100;
                k++;
            }

            // sebaran monster
            int l = 0;
            while(l <= 60){
                int random2 = (int) Math.round(min + Math.random()*(max - min));
                array[random2] = -5;
                l++;
            }
            int m = 0;
            while(m <= 35){
                int random2 = (int) Math.round(min + Math.random()*(max - min));
                array[random2] = -25;
                m++;
            }
            int n = 0;
            while(n <= 5){
                int random2 = (int) Math.round(min + Math.random()*(max - min));
                array[random2] = -125;
                n++;
            }
        }
        
        // algoritma permainan
        while(true){
            game(score,position);
            System.out.print("Masukkan pilihan anda: ");
            char answer = obj.next().charAt(0);

            // pergerakan katak 
            if(answer == 'F' || answer == 'f'){
                score += array[position += 2];
                position += 2;
            }
            else if(answer == 'D' || answer == 'd'){
                score += array[position += 1];
                position += 1;
            }
            else if(answer == 'S' || answer == 's'){
                score += array[position -= 1];
                position -= 1;
            }
            else if(answer == 'A' || answer == 'a'){
                score -= array[position -= 2];
                position -= 2;
            }
            else{
                System.out.println("\nInvalid input !!!");
                continue;
            }

            // kondisi berakhirnya permainan
            if(position >= 499 || score < 0){
                break;
            }
        }

        // komen pada akhir permainan
        System.out.println("\nSkor akhir : "+ score);

        if(score > 500){
            System.out.println("Excellent");
        } 
        else if(score > 250 && score < 500){
            System.out.println("Good");
        } 
        else if(score < 250){
            System.out.println("Bad");
        }
        
        System.out.println( "Terima kasih telah bermain");
        
    }

    /**
     * method untuk menampilkan menu awal
     */
    static void menu(){
        System.out.println("\n+-------------------------------+");
        System.out.println("|## Lompat hai katak, lompat! ##|");
        System.out.println("|           1. Mainkan          |");
        System.out.println("|           2. Keluar           |");
        System.out.println("+-------------------------------+");
    }

    /**
     * method untuk menampilkan level permainan
     */
    static void level(){
        System.out.println("1. Easy");
        System.out.println("2. Intermediate");
        System.out.println("3. Hard");
        System.out.print("Pilih level yang anda inginkan : ");
    }

    /**
     * method untuk menampilkan posisi dan skor katak
     * skor dan posisi katak akan berubah seiring berjalannya permainan
     * @param score
     * @param position
     */
    static void game(int score, int position){
        System.out.println("\n+-----------------------+\n");
        System.out.println("Skor: "+ score);
        System.out.println("Posisi: "+ position);
        System.out.println("\n+-----------------------+");
    }
    
}
