package projet.android.blackjack.activity;

import projet.android.blackjack.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class BlackJackActivity extends Activity {
    /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
       /*---------------------------------------------------------------------
        Transition d'activit� : "Tables de jeu" --> "�cran multijoueur" */
        OnClickListener ButtonMultijoueur = new OnClickListener() {
        
        	@Override
        	public void onClick(View actuelView) {
         
        		Intent intent = new Intent(BlackJackActivity.this, JeuUniqueActivity.class);           
        		startActivity(intent);
        	}
        };
        
        Button buttonJouez = (Button) findViewById(R.id.jouez);
        buttonJouez.setOnClickListener(ButtonMultijoueur);
        /*---------------------------------------------------------------------*/
        
        /*---------------------------------------------------------------------
        Transition d'activit� : "Tables de jeu" --> "�cran r�!gles" */
        OnClickListener ButtonRegles = new OnClickListener() {
      
        	@Override
        	public void onClick(View actuelView) {
       
        		Intent intent = new Intent(BlackJackActivity.this, ReglesActivity.class);           
        		startActivity(intent);
        	}
        };
      
        Button buttonRegles = (Button) findViewById(R.id.regles);
        buttonRegles.setOnClickListener(ButtonRegles);
        /*---------------------------------------------------------------------*/
        
        
        /*---------------------------------------------------------------------
        Transition d'activit� : "Tables de jeu" --> "�cran statistiques" */
        OnClickListener ButtonStatistiques = new OnClickListener() {
      
        	@Override
        	public void onClick(View actuelView) {
       
        		Intent intent = new Intent(BlackJackActivity.this, StatistiquesActivity.class);           
        		startActivity(intent);
        	}
        };
      
        Button buttonStatistiques = (Button) findViewById(R.id.statistiques);
        buttonStatistiques.setOnClickListener(ButtonStatistiques);
        /*---------------------------------------------------------------------*/
           
    }
    
    
}