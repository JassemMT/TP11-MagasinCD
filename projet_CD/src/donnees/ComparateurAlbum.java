package donnees;

public class ComparateurAlbum implements ComparateurCD {

    CD cd;
    ComparateurAlbum(CD cd) {
        this.cd = cd;
    }
    public boolean etreAvant(CD cd2) {
        String nom_cd1 = cd.getNomCd();
        String nom_cd2 = cd2.getNomCd();
        return nom_cd1.compareToIgnoreCase(nom_cd2) > 0;

    }
}
