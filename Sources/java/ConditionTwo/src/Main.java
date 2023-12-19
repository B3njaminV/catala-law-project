public class Main {

    // Création d'un contribuable célibataire avec un gain de vente de 240 000€
    public static boolean testConditionTwo() {
        Contribuable contribuable = new Contribuable(100000, "CELIBATAIRE", "2020-01-01", false);
        Vente vente = new Vente(240000, "2020-01-01", "2010-01-01", "2020-01-01");
        return ConditionTwo.validConditionTwo(contribuable, vente);
    }

    public static void main(String[] args) {
        boolean resultat = testConditionTwo();
        System.out.println(resultat);
    }
}