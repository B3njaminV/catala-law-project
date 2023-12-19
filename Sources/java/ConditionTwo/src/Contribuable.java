public class Contribuable {
    private double revenuBrut;
    private String statut;
    private String dateDeces;
    private boolean inapte;

    public Contribuable(double revenuBrut, String statut, String dateDeces, boolean inapte) {
        this.revenuBrut = revenuBrut;
        this.statut = statut;
        this.dateDeces = dateDeces;
        this.inapte = inapte;
    }

    public double getRevenuBrut() {
        return revenuBrut;
    }

    public void setRevenuBrut(double revenuBrut) {
        this.revenuBrut = revenuBrut;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getDateDeces() {
        return dateDeces;
    }

    public void setDateDeces(String dateDeces) {
        this.dateDeces = dateDeces;
    }

    public boolean isInapte() {
        return inapte;
    }

    public void setInapte(boolean inapte) {
        this.inapte = inapte;
    }
}
