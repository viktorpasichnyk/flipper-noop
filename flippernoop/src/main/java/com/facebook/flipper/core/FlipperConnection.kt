package com.facebook.flipper.core

interface FlipperConnection {
    fun send(method: String?, params: FlipperObject?)

    fun send(method: String?, params: FlipperArray?)

    fun reportErrorWithMetadata(reason: String?, stackTrace: String?)

    fun reportError(throwable: Throwable?)

    fun receive(method: String?, receiver: FlipperReceiver?)
}
