public class HelloUniverse {

    public static void main(String... args){

       Voiture voitureDeJathniel = new Voiture();
       voitureDeJathniel.nbPortes = 4;
       voitureDeJathniel.automatique = true;
       voitureDeJathniel.couleur = "noir";
       Moteur moteur = new Moteur();
       moteur.carburation = "Diesel";
       moteur.nbCylindres = 6;
       voitureDeJathniel.moteur = moteur;
       int nouveaurapport = voitureDeJathniel.passerRapport(true);
       System.out.println(voitureDeJathniel.moteur.carburation);
       voitureDeJathniel.klaxonner();
       int nouvelleVitesse = voitureDeJathniel.accelerer();
       System.out.println("le nouveau rapport est : " + nouveaurapport);
       voitureDeJathniel.tourner(false,50);
       voitureDeJathniel.tourner("droite",120);
       Passager passager = new Passager();
       passager.nom = "Achi";
       passager.prenom = "Grace";
       Ville abidjan = new Ville();
       abidjan.nom = "Abidjan";
       Ville destination =  voitureDeJathniel.transporter(passager,abidjan);
       System.out.println("Le passager est arrivé dans la ville de "+destination.nom);
       String chaine1 = new String("leCielEstBleu");
       String chaine2 = new String("leCielEstBleu");
       boolean egauxOuPas = chaine1.equalsIgnoreCase(chaine2);
       System.out.println(egauxOuPas);
    }
}
