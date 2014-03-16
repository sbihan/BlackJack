package projet.android.blackjack.pojo;

import java.util.ArrayList;
import java.util.List;

import projet.android.blackjack.R;
import projet.android.blackjack.listener.ButtonAbandonner;
import projet.android.blackjack.listener.ButtonDistribuer;
import projet.android.blackjack.listener.ButtonDoubler;
import projet.android.blackjack.listener.ButtonMiser;
import projet.android.blackjack.listener.ButtonPrendreCarte;
import projet.android.blackjack.listener.ButtonRester;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Tapis {

	private Partie partie;

	private List<ImageView> imagesBanque;
	private List<ImageView> imagesJoueur;
	private List<ImageView> images2Joueur;


	private ImageView buttonMiser5;
	private ImageView buttonMiser25;
	private ImageView buttonMiser100;
	private Button buttonDistribuer;
	private Button buttonPrendreCarte;
	private Button buttonRester;
	private Button buttonAbandonner;
	private Button buttonDoubler;

	private TextView texteSolde;
	private TextView texteMise;

	public Tapis(Partie partie) {

		this.partie = partie;

		populateImageJoueur();
		populateImage2Joueur();
		populateImageBanque();
		populateButton();
		populateTexte();

		initializeCard();
		initializeButton();

	}

	private void populateTexte() {
		this.setTexteSolde((TextView) this.partie.getView().findViewById(
				R.id.soldeun));
		this.setTexteMise((TextView) this.partie.getView().findViewById(
				R.id.miseun));
	}

	private void populateButton() {
		this.buttonMiser5 = (ImageView) this.partie.getView().findViewById(
				R.id.jetonrougeun);
		this.buttonMiser25 = (ImageView) this.partie.getView().findViewById(
				R.id.jetonvertun);
		this.buttonMiser100 = (ImageView) this.partie.getView().findViewById(
				R.id.jetonnoirun);
		this.buttonDistribuer = (Button) this.partie.getView().findViewById(
				R.id.buttondistribuerun);
		this.buttonPrendreCarte = (Button) this.partie.getView().findViewById(
				R.id.buttonprendrecarteunun);
		this.buttonRester = (Button) this.partie.getView().findViewById(
				R.id.buttonresterun);
		this.buttonAbandonner = (Button) this.partie.getView().findViewById(
				R.id.buttonabandonnerun);
		this.buttonDoubler = (Button) this.partie.getView().findViewById(
				R.id.buttonsplitterun);
	}

	private List<ImageView> populateImageBanque() {

		this.imagesBanque = new ArrayList<ImageView>();

		this.imagesBanque.add((ImageView) this.partie.getView().findViewById(
				R.id.imageBanque1));
		this.imagesBanque.add((ImageView) this.partie.getView().findViewById(
				R.id.imageBanque2));
		this.imagesBanque.add((ImageView) this.partie.getView().findViewById(
				R.id.imageBanque3));
		this.imagesBanque.add((ImageView) this.partie.getView().findViewById(
				R.id.imageBanque4));
		this.imagesBanque.add((ImageView) this.partie.getView().findViewById(
				R.id.imageBanque5));
		this.imagesBanque.add((ImageView) this.partie.getView().findViewById(
				R.id.imageBanque6));
		this.imagesBanque.add((ImageView) this.partie.getView().findViewById(
				R.id.imageBanque7));
		this.imagesBanque.add((ImageView) this.partie.getView().findViewById(
				R.id.imageBanque8));
		this.imagesBanque.add((ImageView) this.partie.getView().findViewById(
				R.id.imageBanque9));
		this.imagesBanque.add((ImageView) this.partie.getView().findViewById(
				R.id.imageBanque10));
		this.imagesBanque.add((ImageView) this.partie.getView().findViewById(
				R.id.imageBanque11));

		return imagesBanque;
	}

	private List<ImageView> populateImageJoueur() {

		this.imagesJoueur = new ArrayList<ImageView>();

		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur1));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur2));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur3));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur4));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur5));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur6));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur7));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur8));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur9));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur10));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur11));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur12));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur13));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur14));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur15));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur16));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur17));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur18));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur19));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur20));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur21));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.imageJoueur22));

		return imagesJoueur;
	}
	
	private List<ImageView> populateImage2Joueur() {

		this.images2Joueur = new ArrayList<ImageView>();

		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur1));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur2));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur3));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur4));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur5));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur6));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur7));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur8));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur9));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur10));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur11));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur12));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur13));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur14));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur15));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur16));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur17));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur18));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur19));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur20));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur21));
		this.imagesJoueur.add((ImageView) this.partie.getView().findViewById(
				R.id.image2Joueur22));

		return images2Joueur;
	}

	private void initializeCard() {
		for (ImageView imageJoueur : this.imagesJoueur) {
			imageJoueur.setVisibility(View.INVISIBLE);
			imageJoueur.setImageResource(R.drawable.back_red_2);
		}
		for (ImageView imageJoueur : this.images2Joueur) {
			imageJoueur.setVisibility(View.INVISIBLE);
			imageJoueur.setImageResource(R.drawable.back_red_2);
		}
		for (ImageView imageBanque : this.imagesBanque) {
			imageBanque.setVisibility(View.INVISIBLE);
			imageBanque.setImageResource(R.drawable.back_blue_2);
		}
	}

	private void initializeButton() {
		this.buttonDistribuer.setOnClickListener(new ButtonDistribuer(
				this.partie));
		this.buttonPrendreCarte.setOnClickListener(new ButtonPrendreCarte(
				this.partie));
		this.buttonRester.setOnClickListener(new ButtonRester(this.partie));
		this.buttonAbandonner.setOnClickListener(new ButtonAbandonner(
				this.partie));
		this.buttonDoubler.setOnClickListener(new ButtonDoubler(this.partie));

		this.buttonMiser5.setOnClickListener(new ButtonMiser(5, this.partie));
		this.buttonMiser25.setOnClickListener(new ButtonMiser(25, this.partie));
		this.buttonMiser100
				.setOnClickListener(new ButtonMiser(100, this.partie));

		disabledButton();
	}

	private void disabledButton() {
		this.buttonDistribuer.setEnabled(true);
		this.buttonPrendreCarte.setEnabled(false);
		this.buttonRester.setEnabled(false);
		this.buttonAbandonner.setEnabled(false);
		this.buttonDoubler.setEnabled(false);
		this.buttonMiser5.setEnabled(true);
		this.buttonMiser25.setEnabled(true);
		this.buttonMiser100.setEnabled(true);

	}

	public void disabledDistribuerButton() {
		this.buttonDistribuer.setEnabled(false);
		this.buttonPrendreCarte.setEnabled(true);
		this.buttonRester.setEnabled(true);
		this.buttonAbandonner.setEnabled(true);
		this.buttonDoubler.setEnabled(true);
		this.buttonMiser5.setEnabled(false);
		this.buttonMiser25.setEnabled(false);
		this.buttonMiser100.setEnabled(false);
	}

	public List<ImageView> getImagesBanque() {
		return imagesBanque;
	}

	public void setImagesBanque(List<ImageView> imagesBanque) {
		this.imagesBanque = imagesBanque;
	}

	public List<ImageView> getImagesJoueur() {
		return imagesJoueur;
	}

	public void setImagesJoueur(List<ImageView> imagesJoueur) {
		this.imagesJoueur = imagesJoueur;
	}

	public ImageView getButtonMiser5() {
		return buttonMiser5;
	}

	public void setButtonMiser5(ImageView buttonMiser5) {
		this.buttonMiser5 = buttonMiser5;
	}

	public ImageView getButtonMiser25() {
		return buttonMiser25;
	}

	public void setButtonMiser25(ImageView buttonMiser25) {
		this.buttonMiser25 = buttonMiser25;
	}

	public ImageView getButtonMiser100() {
		return buttonMiser100;
	}

	public void setButtonMiser100(ImageView buttonMiser100) {
		this.buttonMiser100 = buttonMiser100;
	}

	public Button getButtonDistribuer() {
		return buttonDistribuer;
	}

	public void setButtonDistribuer(Button buttonDistribuer) {
		this.buttonDistribuer = buttonDistribuer;
	}

	public Button getButtonPrendreCarte() {
		return buttonPrendreCarte;
	}

	public void setButtonPrendreCarte(Button buttonPrendreCarte) {
		this.buttonPrendreCarte = buttonPrendreCarte;
	}

	public Button getButtonRester() {
		return buttonRester;
	}

	public void setButtonRester(Button buttonRester) {
		this.buttonRester = buttonRester;
	}

	public Button getButtonAbandonner() {
		return buttonAbandonner;
	}

	public void setButtonAbandonner(Button buttonAbandonner) {
		this.buttonAbandonner = buttonAbandonner;
	}

	public Button getButtonDoubler() {
		return buttonDoubler;
	}

	public void setButtonDoubler(Button buttonDoubler) {
		this.buttonDoubler = buttonDoubler;
	}

	public TextView getTexteSolde() {
		return texteSolde;
	}

	public void setTexteSolde(TextView texteSolde) {
		this.texteSolde = texteSolde;
	}

	public TextView getTexteMise() {
		return texteMise;
	}

	public void setTexteMise(TextView texteMise) {
		this.texteMise = texteMise;
	}

	public List<ImageView> getImages2Joueur() {
		return images2Joueur;
	}

	public void setImages2Joueur(List<ImageView> images2Joueur) {
		this.images2Joueur = images2Joueur;
	}

}
