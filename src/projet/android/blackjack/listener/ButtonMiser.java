package projet.android.blackjack.listener;

import projet.android.blackjack.pojo.Partie;
import android.view.View;
import android.view.View.OnClickListener;

public class ButtonMiser implements OnClickListener {

	private int mise;
	private Partie partie;

	public ButtonMiser(int mise, Partie partie) {
		super();
		this.mise = mise;
		this.partie = partie;
	}

	@Override
	public void onClick(View v) {
		bet();
	}

	private void bet() {

		if (partie.getJoueur().getSolde() >= this.mise) {
			partie.getJoueur().diminuerSolde(this.mise);
			partie.getJoueur().augmenterMise(this.mise);
			partie.getTapis().getTexteSolde().setText("Votre solde: "
					+ String.valueOf(partie.getJoueur().getSolde()) + "Û");
			partie.getTapis().getTexteMise().setText("Vous misez " + String.valueOf(partie.getJoueur().getMise())
					+ "Û");
		}

	}

}
