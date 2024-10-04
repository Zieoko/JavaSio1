import java.util.Scanner;
import  java.util.Random ;

public class tirage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        int n = r.nextInt(101);
        int nbc = -1;
        int essai = 0;

        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
        while (nbc != n) {
            essai += 1;

            Random random = new Random();
            nbc = random.nextInt(101);
        }
        System.out.println("Vous avez mis "+essai+" essai");
    }

}
