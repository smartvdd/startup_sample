package co.`fun`.appstartup.logger

import android.util.Log

object Logger {
	
	const val TAG = "OTUS_LESSON"
	
	fun log(message: String) {
		Log.i(TAG, message)
	}
}