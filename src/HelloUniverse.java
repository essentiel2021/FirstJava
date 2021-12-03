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
       System.out.println("le nouveau rapport est : " + nouveaurapport);
       voitureDeJathniel.tourner("droite",120);
       Passager passager = new Passager();
       passager.nom = "Achi";
       passager.prenom = "Grace";
       Ville abidjan = new Ville();
       abidjan.nom = "Abidjan";
       Ville destination =  voitureDeJathniel.transporter(passager,abidjan);
       System.out.println("Le nombre de roues de la voiture de jathi est " + Voiture.nbRoues);
       System.out.println("Le passager est arrivé dans la ville de "+destination.nom);
       Voiture.tourner(true,45);

       Voiture voitureDeGrace = new Voiture("Rouge");
       System.out.println("La voiture de grace est de couleur " + voitureDeGrace.couleur);

       Voiture voitureDeJoseph = new Voiture("Essence",8);

       System.out.println(voitureDeJoseph.moteur.nbCylindres);

       String chaine1 = new String("leCielEstBleu");
       String chaine2 = new String("leCielEstBleu");
       boolean egauxOuPas = chaine1.equalsIgnoreCase(chaine2);
       System.out.println(egauxOuPas);
    }
}
