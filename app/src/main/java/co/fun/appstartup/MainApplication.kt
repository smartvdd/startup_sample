package co.`fun`.appstartup

import android.app.Application
import co.`fun`.appstartup.logger.Logger

class MainApplication : Application() {
	
	override fun onCreate() {
		super.onCreate()
		Logger.log("Application#onCreate called")
	}
}