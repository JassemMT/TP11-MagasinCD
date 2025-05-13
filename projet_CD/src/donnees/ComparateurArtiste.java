package donnees;

public class ComparateurArtiste implements ComparateurCD {
    CD cd;
    ComparateurArtiste(CD cd) {
        this.cd = cd;
    }

    public boolean etreAvant(CD cd2) {
        String artiste_cd1 = cd.getNomArtiste();
        String artiste_cd2 = cd2.getNomArtiste();
        return artiste_cd1.compareToIgnoreCase(artiste_cd2) > 0;

    }
}
