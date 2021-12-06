public class Vaiseau {
    String type;
    int nbPassagers;
    int blindage;
    int resisdanceDuBouclier;

    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type " + this.type);

    }
    void desactiverBouclier(){
        System.out.println("Desactivation du bouclier d'un vaisseau de type " + this.type);

    }
}

