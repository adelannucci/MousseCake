package br.com.redhorse.moussecake.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
			EditText mesa = (EditText) findViewById(R.id.editTextMesa);
			EditText comanda = (EditText) findViewById(R.id.editTextComanda);
			if(login(mesa.getText().toString(), comanda.getText().toString().toCharArray())){
				startActivity(new Intent(getApplicationContext(), MainActivity.class));
			}
		}
	};
	
	private boolean login(String user, char[] pass)
	{
		return true;
	}
}
