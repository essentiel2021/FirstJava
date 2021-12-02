public class Voiture {
    int nbPortes = 5;
    boolean automatique = false;
    String couleur = "rouge";
    int rapportCourant;
    int vitesse;
    Moteur moteur;

    void klaxonner(){
        System.out.println("Tutu!!!");
    }
    int accelerer(){
        System.out.println("J'accelère");
        return 100;
    }
    int accelerer(int vitesse){
        System.out.println("J'accelère");
        return this.vitesse + vitesse;
    }
    int passerRapport(boolean augmenter){
        if (augmenter){
            rapportCourant++;
        }
        else {
            rapportCourant--;
        }
        return rapportCourant;
    }
    void tourner(String ou, int angle){
        System.out.println("La voiture va tourner à " + ou + ",avec un angle de " + angle);
    }
    void tourner(boolean droit, int angle){
        String droitOuGauche;
        if(droit){
            droitOuGauche = "droite";
        }
        else{
            droitOuGauche = "gauche";
        }
        System.out.println("La voiture va tourner à " + droitOuGauche + ",avec un angle de " + angle);
    }
    //la methode transporter returne la classe ville précisement la ville de destination
    Ville transporter(Passager passager, Ville ville){
        System.out.println("Je transporte un passager qui s'appelle "+passager.nom +" "+passager.prenom);
        System.out.println("le passager est parti de la ville de  "+ville.nom);
        Ville villeDeDestination = new Ville();
        villeDeDestination.nom = "Toumodi";
        return villeDeDestination;
    }
}
