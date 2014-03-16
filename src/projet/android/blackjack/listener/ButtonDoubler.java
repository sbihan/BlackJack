package projet.android.blackjack.listener;

import projet.android.blackjack.pojo.Carte;
import projet.android.blackjack.pojo.Partie;
import projet.android.blackjack.pojo.Sabot;
import android.view.View;
import android.view.View.OnClickListener;

public class ButtonDoubler implements OnClickListener {

	private Partie partie;

	public ButtonDoubler(Partie partie) {
		this.partie = partie;
	}

	@Override
	public void onClick(View v) {
		if (partie.getJoueur().canDoubler()) {

			partie.getJoueur().doubler();

			Carte qcarte = Sabot.tirerCarte();

			partie.getTapis().getImagesBanque().get(2)
					.setImageResource(qcarte.getParamHexadecimal());

			partie.getJoueur().ajouterCarte(qcarte);

			if (partie.getJoueur().calculerScore() > 21) {
				BlackJackAlert.joueurOver21(partie);
			} else {

				int i = 1;

				while (partie.getBanque().calculerScore() < 17) {
					Carte newCarte = Sabot.tirerCarte();
					partie.getBanque().ajouterCarte(newCarte);
					partie.getTapis().getImagesBanque().get(i)
							.setImageResource(newCarte.getParamHexadecimal());
				}

				if (partie.getBanque().calculerScore() > 21) {
					partie.getJoueur().augmenterSolde(
							2 * partie.getJoueur().getMise());
					BlackJackAlert.banqueOver21(partie);

				} else if (partie.getBanque().calculerScore() == partie
						.getJoueur().calculerScore()) {
					partie.getJoueur().augmenterSolde(
							partie.getJoueur().getMise());

				} else if (partie.getBanque().calculerScore() > partie
						.getJoueur().calculerScore()) {

					BlackJackAlert.joueurUnderBanque(partie);

				} else if (partie.getBanque().calculerScore() < partie
						.getJoueur().calculerScore()) {
					partie.getJoueur().augmenterSolde(
							2 * partie.getJoueur().getMise());
					BlackJackAlert.banqueUnderJoueur(partie);

				}

			}

		} else {
			BlackJackAlert.cannotDoubler(partie);
		}

	}
}
