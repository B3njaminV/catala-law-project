public class Vente {
    private double gain;
    private String dateVente;
    private String dateDebutOccupation;
    private String dateFinOccupation;

    public Vente(double gain, String dateVente, String dateDebutOccupation, String dateFinOccupation) {
        this.gain = gain;
        this.dateVente = dateVente;
        this.dateDebutOccupation = dateDebutOccupation;
        this.dateFinOccupation = dateFinOccupation;
    }

    public double getGain() {
        return gain;
    }

    public void setGain(double gain) {
        this.gain = gain;
    }

    public String getDateVente() {
        return dateVente;
    }

    public void setDateVente(String dateVente) {
        this.dateVente = dateVente;
    }

    public String getDateDebutOccupation() {
        return dateDebutOccupation;
    }

    public void setDateDebutOccupation(String dateDebutOccupation) {
        this.dateDebutOccupation = dateDebutOccupation;
    }

    public String getDateFinOccupation() {
        return dateFinOccupation;
    }

    public void setDateFinOccupation(String dateFinOccupation) {
        this.dateFinOccupation = dateFinOccupation;
    }
}
