package org.android.cash;

import static org.android.cash.Constants.VIBRATION_INTENT;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Cash extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.about:
			setActivity(About.class);
			return true;
		case R.id.preferences:
			setActivity(Preferences.class);
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	private void setActivity(Class<?> c) {
		if (Preferences.getVibration(this))
			setVibrator(VIBRATION_INTENT);
		Intent i = new Intent(this, c);
		startActivity(i);
	}

	private void setVibrator(int milliseconds) {
		Vibrator v = (Vibrator) getSystemService(VIBRATOR_SERVICE);
		v.vibrate(milliseconds);
	}
}