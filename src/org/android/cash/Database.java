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