package tn.insat.iac.thread;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThreadActivity extends Activity {
	/** Called when the activity is first created. */

	private final int MAX_VALUE = 99999;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button button = (Button) findViewById(R.id.main_btn);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				LongTask longTask = new LongTask();
				longTask.execute();

				Intent intent = new Intent(getApplicationContext(),
						SecondActivity.class);
				startActivity(intent);
			}
		});
	}

	private void doSomething() {
		for (int i = 0; i < MAX_VALUE; i++) {
			for (int j = 0; j < MAX_VALUE; j++) {
			}

		}
	}

	class LongTask extends AsyncTask<String, Integer, Void> {

		@Override
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			super.onPreExecute();
		}

		@Override
		protected Void doInBackground(String... arg0) {
			// TODO Auto-generated method stub
			doSomething();
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
		}

		@Override
		protected void onCancelled() {
			// TODO Auto-generated method stub
			super.onCancelled();
		}

	}

}
