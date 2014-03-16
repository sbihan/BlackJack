package projet.android.blackjack.listener;

import projet.android.blackjack.pojo.Carte;
import projet.android.blackjack.pojo.Partie;
import projet.android.blackjack.pojo.Sabot;
import android.view.View;
import android.view.View.OnClickListener;

public class ButtonPrendreCarteTrois implements OnClickListener {

	private Partie partie;

	public ButtonPrendreCarteTrois(Partie partie) {
		super();
		this.partie = partie;
	}

	@Override
	public void onClick(View v) {

		Carte icarte = Sabot.tirerCarte();

		partie.getTapis().getImagesJoueur().get(4)
				.setImageResource(icarte.getParamHexadecimal());

		partie.getJoueur().ajouterCarte(icarte);

		if (partie.getJoueur().calculerScore() > 21) {

			BlackJackAlert.joueurOver21(partie);

		} else if (partie.getJoueur().isInferieur21()) {
			partie.getJoueur().augmenterSolde(
					partie.getJoueur().getMise() * 1.5);

			BlackJackAlert.charlie(partie);

		}

		else {
			BlackJackAlert.joueurOver21(partie);

		}
	}

}
