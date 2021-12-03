package com.facebook.flipper.plugins.databases

import android.content.Context
import com.facebook.flipper.core.FlipperConnection
import com.facebook.flipper.core.FlipperPlugin
import java.io.File
import java.util.*

class DatabasesFlipperPlugin : FlipperPlugin {
    constructor(context: Context?)

    constructor(databaseDriver: DatabaseDriver<*>?)

    constructor(databaseDriverList: ArrayList<DatabaseDriver<*>>?)

    fun onConnect(connection: Any?) {
        // stub
    }

    override fun getId(): String = ""

    override fun onConnect(connection: FlipperConnection?) {
        // stub
    }

    override fun onDisconnect() {
        // stub
    }

    override fun runInBackground() = false

    fun getDatabaseFiles(): List<File> = emptyList()


    companion object {
        @JvmStatic
        val ID: String = ""
    }
}
