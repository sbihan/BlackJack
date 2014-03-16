package projet.android.blackjack.listener;

import projet.android.blackjack.pojo.Partie;
import android.view.View;
import android.view.View.OnClickListener;

public class ButtonAbandonner implements OnClickListener {
	
	private Partie partie;

	public ButtonAbandonner(Partie partie) {
		super();
		this.partie = partie;
	}

	@Override
	public void onClick(View v) {
		partie.getJoueur().augmenterSolde(partie.getJoueur().getMise() / 2);
		partie.getTapis().getTexteSolde().setText("Votre solde: "
				+ String.valueOf(partie.getJoueur().getSolde()) + "Û");

		BlackJackAlert.abandon(partie);
	}

}
