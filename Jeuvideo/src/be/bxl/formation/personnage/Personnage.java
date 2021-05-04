package be.bxl.formation.personnage;

public class Personnage {


    Integer pointDeVie;
    String nom;
    String prenom;
    Integer force;
    Ville ville = new Ville();

Village village = new Village();

    public String mettreForce(Integer force) {
        String msg;
        ville.nom ="Liege";
        if (force > 20) {
            msg =(" force est plus grand que sa force Max");
        } else {
            this.force = force;
            msg =("sa force est de " + force);

        }
        return msg;
    }


    public void  SePresenter() {
            System.out.println("Salut mon gars");
        }

    public void Frapper()        {
                System.out.println("Je frappe avec " +this.force);
            }
   public void Trajet (Ville destination){

        if (!ville.nom.equals(destination.nom)) {

            System.out.println ("Je voyage de "+ ville.nom + " vers " + destination.nom);
            ville.nom = destination.nom;
        }else {
            System.out.println("Je suis deja a ville " + ville.nom);
        }

    }





}

