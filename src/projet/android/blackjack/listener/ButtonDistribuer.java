package projet.android.blackjack.listener;

import projet.android.blackjack.pojo.Carte;
import projet.android.blackjack.pojo.Partie;
import projet.android.blackjack.pojo.Sabot;
import android.view.View;
import android.view.View.OnClickListener;

public class ButtonDistribuer implements OnClickListener {

	private Partie partie;

	public ButtonDistribuer(Partie partie) {
		super();
		this.partie = partie;
	}

	@Override
	public void onClick(View v) {

		partie.getTapis().disabledDistribuerButton();

		Carte icarte = Sabot.tirerCarte();
		Carte jcarte = Sabot.tirerCarte();
		Carte kcarte = Sabot.tirerCarte();

		partie.getTapis().getImagesBanque().get(0)
				.setImageResource(icarte.getParamHexadecimal());
		partie.getTapis().getImagesBanque().get(0).setVisibility(View.VISIBLE);
		partie.getTapis().getImagesJoueur().get(0)
				.setImageResource(jcarte.getParamHexadecimal());
		partie.getTapis().getImagesJoueur().get(0).setVisibility(View.VISIBLE);
		partie.getTapis().getImagesJoueur().get(1)
				.setImageResource(kcarte.getParamHexadecimal());
		partie.getTapis().getImagesJoueur().get(1).setVisibility(View.VISIBLE);


		partie.getBanque().ajouterCarte(icarte);
		partie.getJoueur().ajouterCarte(jcarte);
		partie.getJoueur().ajouterCarte(kcarte);

		partie.getTapis().getButtonAbandonner()
				.setOnClickListener(new ButtonAbandonner(partie));
		partie.getTapis().getButtonDoubler()
				.setOnClickListener(new ButtonDoubler(partie));

		if (partie.getBanque().isPremiereCarteAs()) {

			BlackJackAlert.assurance(partie);

		}

		if (partie.getJoueur().isBlackJack()
				&& !partie.getBanque().isPremiereCarteAs()) {
			partie.getJoueur().augmenterSolde(
					partie.getJoueur().getMise() * 2.5);

			BlackJackAlert.blackJackJoueur(partie);

		} else {

		}
	}

}
