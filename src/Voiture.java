public class Voiture extends VehiculeAMoteur {
    static int nbRoues = 4;
    int nbPortes = 5;
    boolean automatique = false;
    String couleur = "rouge";
    int rapportCourant;


    Voiture(){
        System.out.println("Une voiture est construite sans parametre");
    }
    Voiture(String couleur){
        this.couleur = couleur;
        System.out.println("Une voiture est contruite avec le parametre couleur");
    }

    Voiture(String carburation, int nbCylindre){
        Moteur moteur = new Moteur();
        moteur.carburation = carburation;
        moteur.nbCylindres = nbCylindre;
        this.moteur = moteur;
    }

    static void klaxonner(){
        System.out.println("Tutu!!!");
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
    static void tourner(boolean droit, int angle){
        String droitOuGauche;
        if(droit){
            droitOuGauche = "droite";
        }
        else{
            droitOuGauche = "gauche";
        }
        System.out.println("Les " +nbRoues+" roues de la voiture tournent à "+ droitOuGauche +" d'un angle de "+ angle);
    }
    Ville transporter(Passager passager, Ville ville){
        System.out.println("La voiture transporte un passager qui s'appelle "+passager.nom +" "+passager.prenom);
        System.out.println("le passager est parti de la ville de  "+ville.nom);
        Ville villeDeDestination = new Ville();
        villeDeDestination.nom = "Toumodi";
        return villeDeDestination;
    }

}
