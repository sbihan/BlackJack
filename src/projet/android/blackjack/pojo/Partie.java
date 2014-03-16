package projet.android.blackjack.pojo;

import android.view.View;

public class Partie {

	private View view;

	private Player joueur;
	private Player banque;
	private Tapis tapis;

	public Partie(View view) {

		this.joueur = new Player();
		this.banque = new Player();
		this.view = view;
		this.tapis = new Tapis(this);

	}


	public void replay() {

		this.tapis = new Tapis(this);

		joueur.initialize();
		banque.initialize();

		tapis.getTexteMise().setText(
				"Vous misez " + String.valueOf(joueur.getMise()) + "Û");
		tapis.getTexteSolde().setText(
				"Votre solde: " + String.valueOf(joueur.getSolde()) + "Û");

	}

	public Player getJoueur() {
		return joueur;
	}

	public void setJoueur(Player joueur) {
		this.joueur = joueur;
	}

	public Player getBanque() {
		return banque;
	}

	public void setBanque(Player banque) {
		this.banque = banque;
	}

	public Tapis getTapis() {
		return tapis;
	}

	public void setTapis(Tapis tapis) {
		this.tapis = tapis;
	}

	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}

}
