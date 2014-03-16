package projet.android.blackjack.listener;

import projet.android.blackjack.pojo.Carte;
import projet.android.blackjack.pojo.Partie;
import projet.android.blackjack.pojo.Sabot;
import android.view.View;
import android.view.View.OnClickListener;

public class ButtonRester implements OnClickListener {

	Partie partie;

	public ButtonRester(Partie partie) {
		super();
		this.partie = partie;
	}

	@Override
	public void onClick(View v) {

		while (partie.getBanque().calculerScore() < 17) {
			Carte newCarte = Sabot.tirerCarte();
			partie.getTapis().getImagesBanque()
					.get(partie.getBanque().getHand().size())
					.setImageResource(newCarte.getParamHexadecimal());
			partie.getTapis().getImagesBanque()
					.get(partie.getBanque().getHand().size())
					.setVisibility(View.VISIBLE);
			partie.getBanque().ajouterCarte(newCarte);

		}

		if (partie.getBanque().calculerScore() > 21) {
			partie.getJoueur().augmenterSolde(2 * partie.getJoueur().getMise());
			BlackJackAlert.banqueOver21(partie);

		} else if (partie.getBanque().calculerScore() == partie.getJoueur()
				.calculerScore()) {
			partie.getJoueur().augmenterSolde(partie.getJoueur().getMise());
			BlackJackAlert.joueurEqualBanque(partie);

		} else if (partie.getBanque().calculerScore() > partie.getJoueur()
				.calculerScore()) {

			BlackJackAlert.joueurUnderBanque(partie);

		} else if (partie.getBanque().calculerScore() < partie.getJoueur()
				.calculerScore()) {
			partie.getJoueur().augmenterSolde(2 * partie.getJoueur().getMise());

			BlackJackAlert.banqueUnderJoueur(partie);

		}

	}

}
