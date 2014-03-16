package projet.android.blackjack.listener;

import projet.android.blackjack.pojo.Carte;
import projet.android.blackjack.pojo.Partie;
import projet.android.blackjack.pojo.Sabot;
import android.view.View;
import android.view.View.OnClickListener;

public class ButtonPrendreCarteDeux implements OnClickListener{
	
	private Partie partie;

	public ButtonPrendreCarteDeux(Partie partie) {
		super();
		this.partie = partie;
	}

	@Override
	public void onClick(View v) {

		Carte icarte = Sabot.tirerCarte();
		partie.getTapis().getImagesJoueur().get(3)
				.setImageResource(icarte.getParamHexadecimal());
		partie.getJoueur().ajouterCarte(icarte);
		if (partie.getJoueur().calculerScore() > 21) {

			BlackJackAlert.joueurOver21(partie);

		}
		partie.getTapis().getButtonPrendreCarte()
				.setOnClickListener(new ButtonPrendreCarteTrois(partie));
	}
	
	

}
