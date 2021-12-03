package com.facebook.flipper.plugins.crashreporter

import com.facebook.flipper.core.FlipperConnection
import com.facebook.flipper.core.FlipperPlugin

class CrashReporterPlugin: FlipperPlugin {

    fun sendExceptionMessage(paramThread: Thread, paramThrowable: Throwable) {
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
        fun getInstance() = CrashReporterPlugin()

        @JvmStatic
        val ID: String = ""
    }
}
