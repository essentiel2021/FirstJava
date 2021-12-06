public class VaiseauDeGuerre extends Vaiseau{

    void attaque(Vaiseau vaiseauAttaque,String armeUtilise,int minuteDelAttaque){
        System.out.println("Un vaisseau de type"+ this.type+" attaque un vaisseau de type"+vaiseauAttaque.type+" en utilisant l'arme " +armeUtilise+" pendant "+minuteDelAttaque+" minute");
        vaiseauAttaque.resisdanceDuBouclier = 0;
        vaiseauAttaque.blindage = vaiseauAttaque.blindage/2;
    }
}
