import java.util.Scanner;
import  java.util.Random ;

public class jeu_de_l_oie {

    public static void main(String[] args) {

        int caseObjectif = 20;
        int caseCourante = 0;
        int nbLancers = 5;
        Random rnd = new Random(7);

        System.out.println("Bienvenue ! Commençons...");

        for (int i = 1; i <= nbLancers; i++) {
            int lancer = rnd.nextInt(6) +1;
            caseCourante = caseCourante + lancer;
            System.out.println(String.format("Lancer %d : vous avez fait %d. Vous êtes sur la case %d", lancer, caseCourante));
        }

        if (caseCourante == caseObjectif){
            System.out.println("Vous avez gagné !");
        } else if (caseCourante > caseObjectif) {
            System.out.println("Vous dépassez, vous avez perdu !");
        } else {
            System.out.println("Il vous en manque pour arriver à " + caseObjectif +" !");
        }
    }
}
