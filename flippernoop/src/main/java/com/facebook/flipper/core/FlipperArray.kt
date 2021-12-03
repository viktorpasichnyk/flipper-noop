package com.facebook.flipper.core

import org.json.JSONArray

class FlipperArray constructor(val json: JSONArray) {

    class Builder {
        private val mJson = JSONArray()
        fun put(s: String): Builder {
            mJson.put(s)
            return this
        }

        fun put(i: Int?): Builder {
            mJson.put(i)
            return this
        }

        fun put(l: Long?): Builder {
            mJson.put(l)
            return this
        }

        fun put(f: Float?): Builder {
            mJson.put(if (java.lang.Float.isNaN(f!!)) null else f)
            return this
        }

        fun put(d: Double?): Builder {
            mJson.put(if (java.lang.Double.isNaN(d!!)) null else d)
            return this
        }

        fun put(b: Boolean?): Builder {
            mJson.put(b)
            return this
        }

        fun put(v: FlipperValue): Builder {
            return put(v.toFlipperObject())
        }

        fun put(a: FlipperArray?): Builder {
            mJson.put(a?.json)
            return this
        }

        fun put(b: Builder): Builder {
            return put(b.build())
        }

        fun put(o: FlipperObject?): Builder {
            mJson.put(o?.json)
            return this
        }

        fun put(b: FlipperObject.Builder): Builder {
            return put(b.build())
        }

        fun build(): FlipperArray {
            return FlipperArray(mJson)
        }
    }
}
