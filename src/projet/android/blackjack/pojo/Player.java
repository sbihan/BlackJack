package projet.android.blackjack.pojo;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Carte> hand;
	private double solde;
	private double mise;
	private boolean assurance;

	public Player() {
		this.assurance = false;
		this.solde = 2000;
		this.hand = new ArrayList<Carte>();
	}

	public List<Carte> getHand() {
		return hand;
	}

	public void setHand(List<Carte> hand) {
		this.hand = hand;
	}

	public double getMise() {
		return mise;
	}

	public void setMise(double mise) {
		this.mise = mise;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public void diminuerSolde(double diminution) {
		this.solde = this.solde - diminution;
	}

	public void augmenterSolde(double augmentation) {
		this.solde = this.solde + augmentation;
	}

	public void diminuerMise(double diminution) {
		this.mise = this.mise - diminution;
	}

	public void augmenterMise(double augmentation) {
		this.mise = this.mise + augmentation;
	}

	public void ajouterCarte(Carte pcarte) {
		this.hand.add(pcarte);
	}

	public int calculerScore() {

		int score = 0;

		for (Carte carte : hand) {
			score += carte.getBlackJackValeur();
		}

		// On prend l'as ˆ 11 si le score est <=11
		for (Carte carte : hand) {
			if ("As".equals(carte.getValeur())) {
				if (score <= 11) {
					score += 10;
					break;
				}
			}
		}

		return score;
	}

	public boolean isBlackJack() {

		if ((hand.get(0).getBlackJackValeur() == 1 && hand.get(1)
				.getBlackJackValeur() == 10)
				|| (hand.get(0).getBlackJackValeur() == 10 && hand.get(1)
						.getBlackJackValeur() == 1))
			return true;
		else
			return false;

	}

	public boolean isSuperieur17() {
		if (calculerScore() >= 17)
			return true;
		else
			return false;

	}

	public boolean isInferieur21() {
		if (calculerScore() <= 21)
			return true;
		else
			return false;

	}

	public boolean isPremiereCarteAs() {
		if (hand.get(0).getBlackJackValeur() == 1)
			return true;
		else
			return false;
	}

	public boolean isSecondeCarte10() {
		if (hand.get(1).getBlackJackValeur() == 10)
			return true;
		else
			return false;
	}

	public void prendreAssurance() {
		augmenterMise(0.5 * mise);
		diminuerSolde(0.5 * mise);
	}

	public boolean isAssurance() {
		return assurance;
	}

	public void setAssurance(boolean assurance) {

		this.assurance = assurance;
	}

	public void initialize() {

		this.hand = new ArrayList<Carte>();
		this.mise = 0;
	}

	public boolean canDoubler() {
		return 2 * this.mise <= this.solde;
	}

	public void doubler() {
		this.diminuerSolde(this.mise);
		this.mise = 2 * this.mise;
	}
}
