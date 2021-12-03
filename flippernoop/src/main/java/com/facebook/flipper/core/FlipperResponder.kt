package com.facebook.flipper.core

interface FlipperResponder {

    fun success(response: FlipperObject?)

    fun success(response: FlipperArray?)

    fun success()

    fun error(response: FlipperObject?)
}
