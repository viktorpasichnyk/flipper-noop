package com.facebook.flipper.plugins.navigation

import com.facebook.flipper.core.FlipperConnection
import com.facebook.flipper.core.FlipperPlugin
import java.util.*

class NavigationFlipperPlugin: FlipperPlugin {

    fun sendNavigationEvent(keyURI: String?, className: String?, date: Date?) {
        // stub
    }

    override fun getId(): String = ""

    override fun onConnect(connection: FlipperConnection?) {
        // stub
    }

    override fun onDisconnect() {
        // stub
    }

    override fun runInBackground(): Boolean = false

    companion object {
        @JvmStatic
        fun getInstance() = NavigationFlipperPlugin()

        @JvmStatic
        val ID: String = ""
    }
}
