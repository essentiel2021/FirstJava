public class Planete {
    static String forme = "Sphérique";
    static int nbPlaneteDecouvertes;
    String nom;
    String matiere;
    long diametre;
    int totalVisiteur;
    Atmosphere atmosphere;
    Vaiseau vaiseauActuellementAcoste;

    Planete(String nom){
        this.nom = nom;
        nbPlaneteDecouvertes++;
    }

    static String expansion(double distance){
        if (distance<14){
            return "Oh là là mais c'est super rapide";
        }
        else {
            return "Je rêve ou c'est plus rapide que la lumière";
        }
    }

    int revolution(int angle){
        return angle/360;
    }
    int rotation(int angle){
        return angle/360;
    }

    void accueillirVaisseau(Vaiseau vaiseau){
        this.totalVisiteur = this.totalVisiteur + vaiseau.nbPassagers;
        if (this.vaiseauActuellementAcoste == null){
            System.out.println("Aucun vaisseau ne s'en va");
        }
        else {
            System.out.println("Un vaisseau de type" + vaiseauActuellementAcoste.type+" doit s'en aller");
        }
        this.vaiseauActuellementAcoste = vaiseau;
    }

}
