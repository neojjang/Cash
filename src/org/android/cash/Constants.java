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

import android.provider.BaseColumns;

public interface Constants extends BaseColumns {
	public static int VIBRATION_ERROR = 80;
	public static int VIBRATION_INTENT = 30;
	public static String ACCOUNTS_TABLE = "accounts";
	public static String TITLE = "title";
	public static String TYPE = "type";
}