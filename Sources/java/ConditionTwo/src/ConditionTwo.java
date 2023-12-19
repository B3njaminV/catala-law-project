public class ConditionTwo {
    public static boolean validConditionTwo(Contribuable contribuable, Vente vente) {
        // Si célibataire et gain <= 250 000€
        if (vente.getGain() <= 250000 && contribuable.getStatut().equals("CELIBATAIRE")) {
            return true;
        }

        // Si marié et gain <= 500 000€
        if (vente.getGain() <= 500000 && contribuable.getStatut().equals("MARIE")) {
            return true;
        }

        return false;
    }
}
