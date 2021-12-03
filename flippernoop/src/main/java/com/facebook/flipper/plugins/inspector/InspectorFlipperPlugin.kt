package com.facebook.flipper.plugins.inspector

import android.content.Context
import com.facebook.flipper.core.FlipperConnection
import com.facebook.flipper.core.FlipperPlugin

class InspectorFlipperPlugin(context: Context, descriptorMapping: DescriptorMapping):
    FlipperPlugin {

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
