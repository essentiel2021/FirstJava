public class VehiculeAMoteur {

    int vitesse;
    Moteur moteur;

    int accelerer(int vitesse){
        System.out.println("J'accelère");
        return this.vitesse + vitesse;
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
