package projet.android.blackjack.listener;

import projet.android.blackjack.pojo.Carte;
import projet.android.blackjack.pojo.Partie;
import projet.android.blackjack.pojo.Sabot;
import android.view.View;
import android.view.View.OnClickListener;

public class ButtonPrendreCarte implements OnClickListener {

	private Partie partie;

	public ButtonPrendreCarte(Partie partie) {
		super();
		this.partie = partie;
	}

	@Override
	public void onClick(View v) {

		Carte icarte = Sabot.tirerCarte();
		partie.getTapis().getImagesJoueur()
				.get(partie.getJoueur().getHand().size())
				.setImageResource(icarte.getParamHexadecimal());
		partie.getTapis().getImagesJoueur()
				.get(partie.getJoueur().getHand().size())
				.setVisibility(View.VISIBLE);
		partie.getJoueur().ajouterCarte(icarte);

		if (partie.getJoueur().calculerScore() > 21) {
			BlackJackAlert.joueurOver21(partie);
		}

		/*
		 * else if (partie.getBanque().isBlackJack() &&
		 * partie.getJoueur().isAssurance() && partie.getJoueur().isBlackJack())
		 * { partie.getJoueur().setSolde( partie.getJoueur().getSolde() +
		 * partie.getJoueur().getMise() * 1.5);
		 * BlackJackAlert.blackJackBanqueAndPlayerWithAssurance(partie);
		 * 
		 * } else if (partie.getBanque().isBlackJack() &&
		 * !partie.getJoueur().isAssurance() &&
		 * partie.getJoueur().isBlackJack()) {
		 * partie.getJoueur().augmenterSolde(partie.getJoueur().getMise());
		 * BlackJackAlert.blackJackBanqueAndPlayer(partie); } else if
		 * (partie.getBanque().isBlackJack() &&
		 * !partie.getJoueur().isAssurance() &&
		 * !partie.getJoueur().isBlackJack()) {
		 * BlackJackAlert.blackJackBanque(partie); ; } else if
		 * (partie.getBanque().isSuperieur17()) { if
		 * (partie.getJoueur().calculerScore() == partie.getBanque()
		 * .calculerScore()) {
		 * partie.getJoueur().augmenterSolde(partie.getJoueur().getMise());
		 * BlackJackAlert.joueurEqualBanque(partie); } else if
		 * (partie.getBanque().calculerScore() < partie.getJoueur()
		 * .calculerScore()) { partie.getJoueur().augmenterSolde( 2 *
		 * partie.getJoueur().getMise());
		 * BlackJackAlert.banqueUnderJoueur(partie);
		 * 
		 * } }
		 */

	}

}
