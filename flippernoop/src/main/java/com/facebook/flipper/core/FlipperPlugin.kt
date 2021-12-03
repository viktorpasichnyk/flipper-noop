package com.facebook.flipper.core

interface FlipperPlugin {
    fun getId(): String?

    @Throws(Exception::class)
    fun onConnect(connection: FlipperConnection?)

    @Throws(Exception::class)
    fun onDisconnect()

    fun runInBackground(): Boolean
}
