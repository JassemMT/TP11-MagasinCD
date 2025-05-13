package donnees;

import java.util.ArrayList;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 * 
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 * 
 */
public class Magasin {

	/**
	 * la liste des CDs disponibles en magasin
	 */
	private ArrayList<CD> listeCds;

	/**
	 * construit un magasin par defaut qui ne contient pas de CD
	 */
	public Magasin() {
		listeCds = new ArrayList<CD>();
	}

	/**
	 * ajoute un cd au magasin
	 * 
	 * @param cdAAjouter
	 *            le cd a ajouter
	 */
	public void ajouteCd(CD cdAAjouter) {
		listeCds.add(cdAAjouter);
	}

	@Override
	/**
	 * affiche le contenu du magasin
	 */
	public String toString() {
		String chaineResultat = "";
		//parcours des Cds
		for (int i = 0; i < listeCds.size(); i++) {
			chaineResultat += listeCds.get(i);
		}
		chaineResultat += "nb Cds: " + listeCds.size();
		return (chaineResultat);

	}

	/**
	 * @return le nombre de Cds du magasin
	 */
	public int getNombreCds() {
		return listeCds.size();
	}
	
	/**
	 * permet d'acceder � un CD
	 * 
	 * @return le cd a l'indice i ou null si indice est non valide
	 */
	public CD getCd(int i)
	{
		CD res=null;
		if ((i>=0)&&(i<this.listeCds.size()))
			res=this.listeCds.get(i);
		return(res);
	}

	// TODO  ajouter une methode de tri

	public void TriGenerique(ComparateurCD comp){

		ArrayList<CD> nv_liste = new ArrayList();

		//Cd auquel on compare intialement
		CD test_CD = new CD("artiste", "zzzzz");
		CD smallest_cd = test_CD;
		String nomCD;
		String smaller;

		while(nv_liste.size()<listeCds.size()) {
            for (CD listeCd : listeCds) {
                nomCD = listeCd.getNomCd();
                smaller = smallest_cd.getNomCd();

                if (nomCD.compareToIgnoreCase(smaller) < 0 && !nv_liste.contains(listeCd)) {
                    smallest_cd = listeCd;
                }
            }

			nv_liste.add(smallest_cd);
			smallest_cd = test_CD;
		}

		listeCds = nv_liste;
	}


}
