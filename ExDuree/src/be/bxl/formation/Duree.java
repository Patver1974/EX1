package be.bxl.formation;

public class Duree {
    private int jours;
    private int heures;
    private int minutes;
    private int secondes;
    private int secondesTotal;
    private int temporaile;


    public Duree(int nbSecondes) {
        temporaile = 60 * 60 * 24;
        this.jours = nbSecondes / temporaile;
        nbSecondes = nbSecondes - (jours * temporaile);
        temporaile = 60 * 60;
        this.heures = nbSecondes / temporaile;
        nbSecondes = nbSecondes - (heures * temporaile);
        temporaile = 60;
        this.minutes = nbSecondes / temporaile;
        secondes = nbSecondes - (this.minutes * temporaile);


        nbSecondes = nbSecondes - (jours * temporaile);
    }

    public Duree(int jour, int heures, int minutes, int nbSecondes) {
        this.jours = jour;
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = nbSecondes;
    }

    public void GetDureee() {
        System.out.printf("%s jours %s heures %s minutes %s secondes ", String.valueOf(this.jours), String.valueOf(this.heures), String.valueOf(this.minutes), String.valueOf(this.secondes));
        System.out.println("");
    }

    public int GetTotalSeconde(secondestotal) {
        secondesTotal = (((((this.jours * 24) + this.heures) * 60) + this.minutes) * 60 + this.secondes);
        return secondesTotal;
    }


    public void SubDuree(Duree aSoustraire) {
        int temp;
        if (this.GetTotalSeconde() > aSoustraire.GetTotalSeconde()) {
            temp = this.GetTotalSeconde() - aSoustraire.GetTotalSeconde();


            this.jours = this.jours - aSoustraire.jours;
            this.heures = this.heures - aSoustraire.heures;
            this.minutes = this.minutes - aSoustraire.minutes;
            this.secondes = this.secondes - aSoustraire.secondes;
        }
    }

    public void AddDuree(Duree aAjouter) {
        int temp;
        temp = this.GetTotalSeconde() - aAjouter.GetTotalSeconde();
        this.jours = this.jours + aAjouter.jours;
        this.heures = this.heures + aAjouter.heures;
        this.minutes = this.minutes + aAjouter.minutes;
        this.secondes = this.secondes + aAjouter.secondes;
    }


}
