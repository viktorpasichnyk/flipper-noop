package com.facebook.flipper.plugins.network

import com.facebook.flipper.core.FlipperConnection
import com.facebook.flipper.core.FlipperPlugin

class NetworkFlipperPlugin: FlipperPlugin {

    fun reportRequest(requestInfo: NetworkReporter.RequestInfo) {
        // stub
    }

    fun reportResponse(responseInfo: NetworkReporter.ResponseInfo) {
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
        val ID: String = ""
    }
}
