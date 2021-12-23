package co.`fun`.appstartup.startup

import android.content.Context
import androidx.startup.Initializer
import co.`fun`.appstartup.logger.Logger

class FastInitializer : Initializer<Unit> {
	
	override fun create(context: Context) {
		Logger.log("FastInitializer started")
		Thread.sleep(100)
		Logger.log("FastInitializer finished")
	}
	
	override fun dependencies(): List<Class<out Initializer<*>>> {
		return emptyList()
	}
}