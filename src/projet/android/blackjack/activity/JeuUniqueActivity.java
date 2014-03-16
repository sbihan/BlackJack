package projet.android.blackjack.activity;

import projet.android.blackjack.R;
import projet.android.blackjack.pojo.Partie;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;

public class JeuUniqueActivity extends Activity {
	/** Called when the activity is first created. */
		
	public static OnClickListener EXIT_LISTENER;

	public Partie partie;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.jeuunique);
		
		EXIT_LISTENER = new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent = new Intent(JeuUniqueActivity.this, BlackJackActivity.class);           
        		startActivity(intent);
			}
		};
				
		partie = new Partie(this.getWindow().getDecorView());

	}

}
