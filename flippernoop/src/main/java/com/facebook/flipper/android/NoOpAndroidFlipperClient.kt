package com.facebook.flipper.android

import com.facebook.flipper.core.FlipperClient
import com.facebook.flipper.core.FlipperPlugin

class NoOpAndroidFlipperClient: FlipperClient {

    override fun addPlugin(plugin: FlipperPlugin?) {
        // stub
    }

    override fun <T : FlipperPlugin?> getPlugin(id: String?): T? {
        return null
    }

    override fun <T : FlipperPlugin?> getPluginByClass(cls: Class<T>?): T? {
        return null
    }

    override fun removePlugin(plugin: FlipperPlugin?) {
        // stub
    }

    override fun start() {
        // stub
    }

    override fun stop() {
        // stub
    }

    override fun unsubscribe() {
        // stub
    }
}
