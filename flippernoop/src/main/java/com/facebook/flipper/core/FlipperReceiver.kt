package com.facebook.flipper.core

interface FlipperReceiver {
    fun onReceive(params: FlipperObject?, responder: FlipperResponder?)
}
