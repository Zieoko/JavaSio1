import  java.util.Random ;

public class jeu_de_l_oie {

    public static void main(String[] args) {

        int caseObjectif = 20;
        int nbLancers = 5;
        int essai = 0;
        boolean win = false ;
        Random rnd = new Random();

        System.out.println("Bienvenue ! Commençons...");

        while (win == false){

            essai += 1;
            int caseCourante = 0;

            for (int i = 1; i <= nbLancers; i++) {
                int lancer = rnd.nextInt(6) +1;
                caseCourante = caseCourante + lancer;
                System.out.println(String.format("Lancer %d : vous avez fait %d. Vous êtes sur la case %d",i , lancer, caseCourante));
            }
            if (caseCourante == caseObjectif){
                System.out.println("Vous avez gagné !");
                win = true;
            } else if (caseCourante > caseObjectif) {
                System.out.println("Vous dépassez, vous avez perdu !");
            } else {
                System.out.println("Il vous en manque pour arriver à " + caseObjectif +" !");
            }
        }
        System.out.println("Nombre d'essai(s) "+ essai +" !");
    }
}
