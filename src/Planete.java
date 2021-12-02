public class Planete {
    String nom;
    String matiere;
    long diametre;
    int totalVisiteur;
    Atmosphere atmosphere;

    int revolution(int angle){
        return angle/360;
    }
    int rotation(int angle){
        return angle/360;
    }
    void accueillirVaisseau(int nbHumain){
        this.totalVisiteur = this.totalVisiteur+nbHumain;
    }
    void accueillirVaisseau(String typeDevaisseau){
        if (typeDevaisseau.equalsIgnoreCase("CHASSEUR")){
            this.totalVisiteur = this.totalVisiteur + 3;
        }
        else if (typeDevaisseau.equalsIgnoreCase("FREGATE")){
            this.totalVisiteur = this.totalVisiteur + 12;
        }
        else if (typeDevaisseau.equalsIgnoreCase("FREGATE")){
            this.totalVisiteur = this.totalVisiteur + 50;
        }
    }
}
