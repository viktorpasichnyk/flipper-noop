package com.facebook.flipper.core

interface FlipperClient {
    fun addPlugin(plugin: FlipperPlugin?)

    fun <T : FlipperPlugin?> getPlugin(id: String?): T?

    fun <T : FlipperPlugin?> getPluginByClass(cls: Class<T>?): T?

    fun removePlugin(plugin: FlipperPlugin?)

    fun start()

    fun stop()

    fun unsubscribe()
}
