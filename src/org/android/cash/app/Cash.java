/* Cash for Android.
 * Copyright (C) 2011 Richard Ricciardelli.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.android.cash.app;

import static org.android.cash.Constants.VIBRATION_INTENT;

import org.android.cash.About;
import org.android.cash.Preferences;
import org.android.cash.R;

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
		// TODO Create method cashQuery() to set current cash in activity.
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
		case R.id.account:
			setActivity(Accounts.class);
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