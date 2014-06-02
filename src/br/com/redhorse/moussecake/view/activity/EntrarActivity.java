package br.com.redhorse.moussecake.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import br.com.redhorse.moussecake.R;

public class EntrarActivity extends Activity {
	private Button mBtnEntrar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_entrada);
		mBtnEntrar = (Button) findViewById(R.id.buttonEntrar);
		mBtnEntrar.setOnClickListener(openPrincipalActivity);		
	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.login, menu);
//		return true;
//	}

	public android.view.View.OnClickListener openPrincipalActivity = new View.OnClickListener() 
	{
		@Override
		public void onClick(View v) 
		{
			startActivity(new Intent(getApplicationContext(), MainActivity.class));
		}
	};
	
}
