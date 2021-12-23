package co.`fun`.appstartup.startup

import android.content.Context
import androidx.startup.Initializer
import co.`fun`.appstartup.logger.Logger

class OtusInitializer : Initializer<Unit> {
	
	override fun create(context: Context) {
		Logger.log("OTUS lesson is over")
	}
	
	override fun dependencies(): List<Class<out Initializer<*>>> {
		return listOf(LongInitializer::class.java, FastInitializer::class.java)
	}
}