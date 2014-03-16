package projet.android.blackjack.pojo;

public class Carte {
	
	private String valeur;
	private String couleur;
	private int blackJackValeur;
	private int paramHexadecimal;
	
	public Carte() {
		this.valeur="";
		this.couleur="";
		this.blackJackValeur=0;
		this.paramHexadecimal=0;
	}
	
	public Carte(String couleur, String valeur, int blackjackValeur, int paramHexadecimal){
		this.couleur = couleur;
		this.valeur = valeur;
		this.blackJackValeur = blackjackValeur;
		this.paramHexadecimal = paramHexadecimal;
	}
	
	public int getParamHexadecimal() {
		return paramHexadecimal;
	}

	public void setParamHexadecimal(int paramHexadecimal) {
		this.paramHexadecimal = paramHexadecimal;
	}

	public String getValeur() {
		return valeur;
	}
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	public int getBlackJackValeur() {
		return blackJackValeur;
	}

	public void setBlackJackValeur(int blackJackValeur) {
		this.blackJackValeur = blackJackValeur;
	}

	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

}
