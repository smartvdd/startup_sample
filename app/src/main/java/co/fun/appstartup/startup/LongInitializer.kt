package co.`fun`.appstartup.startup

import android.content.Context
import androidx.startup.Initializer
import co.`fun`.appstartup.logger.Logger

class LongInitializer : Initializer<Unit> {
	
	override fun create(context: Context) {
		Logger.log("LongInitializer started")
		Thread.sleep(3000)
		Logger.log("LongInitializer finished")
	}
	
	override fun dependencies(): List<Class<out Initializer<*>>> {
		return emptyList()
	}
}