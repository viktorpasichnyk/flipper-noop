package com.facebook.flipper.plugins.sharedpreferences

import android.content.Context
import com.facebook.flipper.core.FlipperConnection
import com.facebook.flipper.core.FlipperPlugin

class SharedPreferencesFlipperPlugin : FlipperPlugin {

    constructor(context: Context)

    @JvmOverloads
    constructor(context: Context, name: String, mode: Int = Context.MODE_PRIVATE)

    constructor(context: Context, descriptors: List<SharedPreferencesDescriptor>)

    class SharedPreferencesDescriptor(name: String, mode: Int)

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
