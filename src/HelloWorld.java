
public class HelloWorld {
    public static void main(String... args){

        Planete mercure = new Planete();
        mercure.nom = "Mercure";
        mercure.diametre = 4880;
        mercure.matiere = "Tellurique";
        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.diametre = 12100;
        venus.matiere = "Tellurique";
        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.diametre = 12756;
        terre.matiere = "Tellurique";
        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.diametre = 6792;
        mars.matiere = "Tellurique";
        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";
        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";
        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";

        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.tauxHydrogene = 83f;
        atmosphereUranus.tauxHelium = 15f;
        atmosphereUranus.tauxMethane = 2.5f;

        uranus.atmosphere = atmosphereUranus;

        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";

        System.out.println(jupiter.nom+" est une planète "+jupiter.matiere+" avec un diamètre de "+jupiter.diametre+" kilomètres.");
        Planete sedna = new Planete();
        System.out.println(sedna.nom+ " est une planète "+sedna.matiere+" avec un diamètre de "+sedna.diametre+" kilomètres.");
        neptune.rotation(-3542);
        mars.revolution(-684);
        mars.accueillirVaisseau(8);
        mars.accueillirVaisseau("FREGATE");
        System.out.println("Le nombre d'humain ayant déjà séjourné sur Mars est actuellement de " +
                mars.totalVisiteur);

        System.out.println("L'atmosphère de Uranus est composé : ");
        System.out.println("A " + uranus.atmosphere.tauxHydrogene + "% d'hydrogene");
        System.out.println("A " + uranus.atmosphere.tauxArgon + "% d'aragon");
        System.out.println("A " + uranus.atmosphere.tauxAzote + "% d'azote");
        System.out.println("A " + uranus.atmosphere.tauxDioxydeCarbone + "% de Dioxyde de carbone");
        System.out.println("A " + uranus.atmosphere.tauxHelium + "% d'héluim");
        System.out.println("A " + uranus.atmosphere.tauxMethane+ "% de méthane");
        System.out.println("A " + uranus.atmosphere.tauxSoduim + "% de Soduim");
    }
}
