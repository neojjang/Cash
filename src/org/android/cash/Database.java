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

package org.android.cash;

import static android.provider.BaseColumns._ID;
import static org.android.cash.Constants.ACCOUNTS_TABLE;
import static org.android.cash.Constants.TITLE;
import static org.android.cash.Constants.TYPE;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {
	private static String DATABASE_NAME = "cash.db";
	private static int DATABASE_VERSION = 1;

	public Database(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("CREATE TABLE " + ACCOUNTS_TABLE + " (" + _ID
				+ " INTEGER PRIMARY KEY AUTOINCREMENT, " + TITLE
				+ " TEXT NOT NULL, " + TYPE + " TEXT NOT NULL);");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXITS " + ACCOUNTS_TABLE);
		onCreate(db);
	}
}