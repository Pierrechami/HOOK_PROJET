package mat_zai_pie;

public class Artist {
    String nom;
    String prenom;
    String pseudo;
    int age;
    Oeuvre[] listeOeuvre;

    Artist(String nom, String prenom, String pseudo, int age, Oeuvre[] listeOeuvre){
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.age = age;
        this.listeOeuvre = listeOeuvre;
    }

    public int getAge() {
        return age;
    }
    public Oeuvre[] getListeOeuvre() {
        return listeOeuvre;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getPseudo() {
        return pseudo;
    }

    //@Override
    public void afficher() {
        for (int i = 0; i < listeOeuvre.length; i++) {
            System.out.println("Voici les oeuvres de " + nom);
            listeOeuvre[i].afficher();
        }    
    }   
}

