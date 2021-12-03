package com.facebook.flipper.android

import android.content.Context
import com.facebook.flipper.core.FlipperClient

class AndroidFlipperClient {
    companion object {
        fun getInstance(context: Context?): FlipperClient {
            return NoOpAndroidFlipperClient()
        }

        fun getInstanceIfInitialized(): FlipperClient {
            return NoOpAndroidFlipperClient()
        }
    }
}
