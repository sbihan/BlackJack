package projet.android.blackjack.pojo;

import java.util.Random;

import projet.android.blackjack.R;


public class Sabot {

	public static Carte tirerCarte() {
		
		String valeur = "";
		String couleur = "";
		int blackJackValeur = 0;
		int paramHexadecimal = 0;

		Random random = new Random(); 
		 
		int numeroCarte = random.nextInt(41)+1;
		
		
		switch (numeroCarte) {
			case (1) : valeur="As";couleur="Trefle"; blackJackValeur =1; paramHexadecimal =R.drawable._ace_of_clubs; break;
			case (2) : valeur="Dix";couleur="Trefle"; blackJackValeur =10; paramHexadecimal =R.drawable._10_of_clubs; break;
			case (3) : valeur="Valet";couleur="Trefle"; blackJackValeur =10; paramHexadecimal =R.drawable._jack_of_clubs; break;
			case (4) : valeur="Dame";couleur="Trefle"; blackJackValeur =10; paramHexadecimal =R.drawable._queen_of_clubs; break;
			case (5) : valeur="Roi";couleur="Trefle"; blackJackValeur =10; paramHexadecimal =R.drawable._king_of_clubs; break;
			case (6) : valeur="2";couleur="Trefle"; blackJackValeur =2; paramHexadecimal =R.drawable._2_of_clubs; break;
			case (7) : valeur="3";couleur="Trefle"; blackJackValeur =3; paramHexadecimal =R.drawable._3_of_clubs; break;
			case (8) : valeur="4";couleur="Trefle"; blackJackValeur =4; paramHexadecimal =R.drawable._4_of_clubs; break;
			case (9) : valeur="5";couleur="Trefle"; blackJackValeur =5; paramHexadecimal =R.drawable._5_of_clubs; break;
			case (10) : valeur="6";couleur="Trefle"; blackJackValeur =6; paramHexadecimal =R.drawable._6_of_clubs; break;
			case (11) : valeur="7";couleur="Trefle"; blackJackValeur =7; paramHexadecimal =R.drawable._7_of_clubs; break;
			case (12) : valeur="8";couleur="Trefle"; blackJackValeur =8; paramHexadecimal =R.drawable._8_of_clubs; break;
			case (13) : valeur="9";couleur="Trefle"; blackJackValeur =9; paramHexadecimal =R.drawable._9_of_clubs; break;
			case (14) : valeur="10";couleur="Carreau"; blackJackValeur =10; paramHexadecimal =R.drawable._10_of_diamonds; break;
			case (15) : valeur="As";couleur="Carreau"; blackJackValeur =1; paramHexadecimal =R.drawable._ace_of_diamonds; break;
			case (16) : valeur="2";couleur="Carreau"; blackJackValeur =2; paramHexadecimal =R.drawable._2_of_diamonds; break;
			case (17) : valeur="3";couleur="Carreau"; blackJackValeur =3; paramHexadecimal =R.drawable._3_of_diamonds; break;
			case (18) : valeur="4";couleur="Carreau"; blackJackValeur =4; paramHexadecimal =R.drawable._4_of_diamonds; break;
			case (19) : valeur="5";couleur="Carreau"; blackJackValeur =5; paramHexadecimal =R.drawable._5_of_diamonds; break;
			case (20) : valeur="6";couleur="Carreau"; blackJackValeur =6; paramHexadecimal =R.drawable._6_of_diamonds; break;
			case (21) : valeur="7";couleur="Carreau"; blackJackValeur =7; paramHexadecimal =R.drawable._7_of_diamonds; break;
			case (22) : valeur="8";couleur="Carreau"; blackJackValeur =8; paramHexadecimal =R.drawable._8_of_diamonds; break;
			case (23) : valeur="9";couleur="Carreau"; blackJackValeur =9; paramHexadecimal =R.drawable._9_of_diamonds; break;
			case (24) : valeur="Valet";couleur="Carreau"; blackJackValeur =10; paramHexadecimal =R.drawable._jack_of_diamonds; break;
			case (25) : valeur="Roi";couleur="Carreau"; blackJackValeur =10; paramHexadecimal =R.drawable._king_of_diamonds; break;
			case (26) : valeur="Dame";couleur="Carreau"; blackJackValeur =10; paramHexadecimal =R.drawable._queen_of_diamonds; break;
			case (27) : valeur="10";couleur="Coeur"; blackJackValeur =10; paramHexadecimal =R.drawable._10_of_hearts; break;
			case (28) : valeur="2";couleur="Coeur"; blackJackValeur =2; paramHexadecimal =R.drawable._2_of_hearts; break;
			case (29) : valeur="3";couleur="Coeur"; blackJackValeur =3; paramHexadecimal =R.drawable._3_of_hearts; break;
			case (30) : valeur="4";couleur="Coeur"; blackJackValeur =4; paramHexadecimal =R.drawable._4_of_hearts; break;
			case (31) : valeur="5";couleur="Coeur"; blackJackValeur =5; paramHexadecimal =R.drawable._5_of_hearts; break;
			case (32) : valeur="6";couleur="Coeur"; blackJackValeur =6; paramHexadecimal =R.drawable._6_of_hearts; break;
			case (33) : valeur="7";couleur="Coeur"; blackJackValeur =7; paramHexadecimal =R.drawable._7_of_hearts; break;
			case (34) : valeur="8";couleur="Coeur"; blackJackValeur =8; paramHexadecimal =R.drawable._8_of_hearts; break;
			case (35) : valeur="9";couleur="Coeur"; blackJackValeur =9; paramHexadecimal =R.drawable._9_of_hearts; break;
			case (36) : valeur="As";couleur="Coeur"; blackJackValeur =1; paramHexadecimal =R.drawable._ace_of_hearts; break;
			case (37) : valeur="Valet";couleur="Coeur"; blackJackValeur =10; paramHexadecimal =R.drawable._jack_of_hearts; break;
			case (38) : valeur="Roi";couleur="Coeur"; blackJackValeur =10; paramHexadecimal =R.drawable._king_of_hearts; break;
			case (39) : valeur="Dame";couleur="Coeur"; blackJackValeur =10; paramHexadecimal =R.drawable._queen_of_hearts; break;
			case (40) : valeur="2";couleur="Pique"; blackJackValeur =2; paramHexadecimal =R.drawable._2_of_spades; break;
			case (41) : valeur="10";couleur="Pique"; blackJackValeur =10; paramHexadecimal =R.drawable._10_of_spades; break;
			case (42) : valeur="3";couleur="Pique"; blackJackValeur =3; paramHexadecimal =R.drawable._3_of_spades; break;
			case (43) : valeur="4";couleur="Pique"; blackJackValeur =4; paramHexadecimal =R.drawable._4_of_spades; break;
			case (44) : valeur="5";couleur="Pique"; blackJackValeur =5; paramHexadecimal =R.drawable._5_of_spades; break;
			case (45) : valeur="6";couleur="Pique"; blackJackValeur =6; paramHexadecimal =R.drawable._6_of_spades; break;
			case (46) : valeur="7";couleur="Pique"; blackJackValeur =7; paramHexadecimal =R.drawable._7_of_spades; break;
			case (47) : valeur="8";couleur="Pique"; blackJackValeur =8; paramHexadecimal =R.drawable._8_of_spades; break;
			case (48) : valeur="9";couleur="Pique"; blackJackValeur =9; paramHexadecimal =R.drawable._9_of_spades; break;
			case (49) : valeur="As";couleur="Pique"; blackJackValeur =1; paramHexadecimal =R.drawable._ace_of_spades; break;
			case (50) : valeur="Valet";couleur="Pique"; blackJackValeur =10; paramHexadecimal =R.drawable._jack_of_spades; break;
			case (51) : valeur="Dame";couleur="Pique"; blackJackValeur =10; paramHexadecimal =R.drawable._queen_of_spades; break;
			case (52) : valeur="Roi";couleur="Pique"; blackJackValeur =10; paramHexadecimal =R.drawable._king_of_spades; break;		
		}
		
		return new Carte(couleur, valeur, blackJackValeur, paramHexadecimal);
	}
	
	
}
