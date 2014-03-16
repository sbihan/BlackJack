package projet.android.blackjack.listener;

import projet.android.blackjack.activity.JeuUniqueActivity;
import projet.android.blackjack.pojo.Partie;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class BlackJackAlert {

	public static void joueurOver21(final Partie partie) {

		replay(partie,
				"Vous avez dépassé...",
				"Vous avez perdu "
						+ String.valueOf(partie.getJoueur().getMise()) + "€");
	}

	public static void banqueOver21(final Partie partie) {

		replay(partie,
				"La banque a sauté !",
				"Vous avez gagné "
						+ String.valueOf(partie.getJoueur().getMise()) + "€");
	}

	public static void banqueUnderJoueur(final Partie partie) {

		replay(partie,
				String.valueOf(partie.getBanque().calculerScore())
						+ " à la banque !",
				"Vous avez gagné "
						+ String.valueOf(partie.getJoueur().getMise()) + "€");
	}

	public static void joueurUnderBanque(final Partie partie) {

		replay(partie,
				String.valueOf(partie.getBanque().calculerScore())
						+ " à la banque !",
				"Vous avez perdu "
						+ String.valueOf(partie.getJoueur().getMise()) + "€");
	}

	public static void abandon(final Partie partie) {

		replay(partie,
				"Abandon !",
				"Vous recupérez "
						+ String.valueOf(partie.getJoueur().getMise() / 2)
						+ "€");
	}

	public static void blackJackJoueur(final Partie partie) {

		replay(partie,
				"BlackJack !",
				"Vous avez gagné "
						+ String.valueOf(partie.getJoueur().getMise() * 1.5)
						+ "€");
	}

	public static void blackJackBanqueAndPlayerWithAssurance(final Partie partie) {

		replay(partie,
				"BlackJack à la banque ! Egalité !",
				"Grâce à l'assurance, vous avez gagné "
						+ String.valueOf(partie.getJoueur().getMise() / 3)
						+ "€");
	}

	public static void blackJackBanqueAndPlayer(final Partie partie) {

		replay(partie, "BlackJack à la banque !", "Egalité");
	}

	public static void blackJackBanque(final Partie partie) {

		replay(partie,
				"BlackJack à la banque !",
				"Vous avez perdu "
						+ String.valueOf(partie.getJoueur().getMise()) + "€");
	}

	public static void joueurEqualBanque(final Partie partie) {

		replay(partie, String.valueOf(partie.getBanque().calculerScore())
				+ " à la banque", "Egalité");
	}

	public static void charlie(final Partie partie) {

		replay(partie,
				"Charlie 5 cartes !",
				"Vous avez gagné "
						+ String.valueOf(partie.getJoueur().getMise() * 1.5)
						+ "€");
	}

	private static void replay(final Partie partie, String title, String message) {

		AlertDialog.Builder builder = new AlertDialog.Builder(partie.getView()
				.getContext());
		builder.setTitle(title)
				.setMessage(message)
				.setCancelable(false)
				.setNegativeButton("Quitter",JeuUniqueActivity.EXIT_LISTENER)
				.setPositiveButton("Rejouer",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								partie.replay();
							}
						});
		AlertDialog alert = builder.create();
		alert.show();

	}

	public static void cannotDoubler(final Partie partie) {
		continuer(partie, "Votre solde ne vous permez pas de doubler", "");
	}

	public static void continuer(final Partie partie, String title,
			String message) {

		AlertDialog.Builder builder = new AlertDialog.Builder(partie.getView()
				.getContext());
		builder.setTitle(title)
				.setMessage(message)
				.setNegativeButton("Continuer",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								dialog.cancel();
							}
						});
		AlertDialog alert = builder.create();
		alert.show();

	}

	public static void assurance(final Partie partie) {

		AlertDialog.Builder builder = new AlertDialog.Builder(partie.getView()
				.getContext());

		builder.setTitle("As à la banque !")
				.setCancelable(false)
				.setMessage("Prenez-vous l'assurance ?")
				.setPositiveButton("Oui",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
								partie.getJoueur().setAssurance(true);
								partie.getJoueur().prendreAssurance();
								partie.getTapis()
										.getTexteSolde()
										.setText(
												"Votre solde: "
														+ String.valueOf(partie
																.getJoueur()
																.getSolde())
														+ "€");
								partie.getTapis()
										.getTexteMise()
										.setText(
												"Vous misez "
														+ String.valueOf(partie
																.getJoueur()
																.getMise())
														+ "€ (Assurance)");
							}
						})
				.setNegativeButton("Non",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int which) {
							}
						});

		AlertDialog alert = builder.create();
		alert.show();
	}

}
