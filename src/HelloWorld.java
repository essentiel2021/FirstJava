
public class HelloWorld {
    public static void main(String... args){

        Planete mercure = new Planete("Mercure");
        mercure.diametre = 4880;
        mercure.matiere = "Tellurique";
        Planete venus = new Planete("Venus");
        venus.diametre = 12100;
        Planete terre = new Planete("Terre");
        terre.diametre = 12756;
        Planete mars = new Planete("Mars");
        mars.diametre = 6792;
        mars.matiere = "Tellurique";
        Planete jupiter = new Planete("Jupiter");
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";
        Planete saturne = new Planete("Saturne");
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";
        Planete uranus = new Planete("Uranus");
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";

        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.tauxHydrogene = 83f;
        atmosphereUranus.tauxHelium = 15f;
        atmosphereUranus.tauxMethane = 2.5f;

        uranus.atmosphere = atmosphereUranus;

        Planete neptune = new Planete("Neptune");
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";

        System.out.println(jupiter.nom+" est une planète "+jupiter.matiere+" avec un diamètre de "+jupiter.diametre+" kilomètres.");

        neptune.rotation(-3542);
        mars.revolution(-684);

        Vaiseau nouveauVaiseau = new Vaiseau();
        nouveauVaiseau.type = "FREGATE";
        nouveauVaiseau.nbPassagers = 9;
        mars.accueillirVaisseau(nouveauVaiseau);

        Vaiseau autreVaiseau = new Vaiseau();
        autreVaiseau.type = "CROISEUR";
        autreVaiseau.nbPassagers = 42;
        mars.accueillirVaisseau(autreVaiseau);
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

        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.2));

        System.out.println("Le nombre de planetes découvertes est actuellement de " + Planete.nbPlaneteDecouvertes);
        VaiseauDeGuerre chasseur = new VaiseauDeGuerre();
        chasseur.type = "CHASSEUR";
        chasseur.blindage = 152;
        chasseur.resisdanceDuBouclier = 2;

        VaiseauCivil vaiseauMonde = new VaiseauCivil();
        vaiseauMonde.blindage = 4784;
        vaiseauMonde.resisdanceDuBouclier = 30;
        vaiseauMonde.type = "VAISSEAU-MONDE";
        vaiseauMonde.activerBouclier();
        chasseur.activerBouclier();
        chasseur.attaque(vaiseauMonde,"lasers photonique",3);
        vaiseauMonde.desactiverBouclier();
        System.out.println("La réisdance du bouclier du VM est "+ vaiseauMonde.resisdanceDuBouclier);
        System.out.println("le blindage du VM " + vaiseauMonde.blindage);


    }
}
