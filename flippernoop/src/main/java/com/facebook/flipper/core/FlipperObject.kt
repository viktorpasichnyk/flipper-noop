package com.facebook.flipper.core

import org.json.JSONException
import org.json.JSONObject
import java.util.*

class FlipperObject constructor(val json: JSONObject) {

    constructor(json: String): this(JSONObject(json))

    class Builder {
        private val mJson = JSONObject()
        fun put(name: String?, obj: Any?): Builder {
            return if (obj == null) {
                put(name, null as String?)
            } else if (obj is Int) {
                put(name, obj as Int?)
            } else if (obj is Long) {
                put(name, obj as Long?)
            } else if (obj is Float) {
                put(name, obj as Float?)
            } else if (obj is Double) {
                put(name, obj as Double?)
            } else if (obj is String) {
                put(name, obj as String?)
            } else if (obj is Boolean) {
                put(name, obj as Boolean?)
            } else if (obj is Array<*>) {
                put(name, Arrays.deepToString(obj))
            } else if (obj is FlipperObject) {
                put(name, obj as FlipperObject?)
            } else if (obj is Builder) {
                put(name, obj as Builder?)
            } else if (obj is FlipperArray) {
                put(name, obj as FlipperArray?)
            } else if (obj is FlipperArray.Builder) {
                put(name, obj as FlipperArray.Builder?)
            } else if (obj is FlipperValue) {
                put(name, (obj).toFlipperObject())
            } else {
                put(name, obj.toString())
            }
        }

        fun put(name: String, s: String?): Builder {
            try {
                mJson.put(name, s)
            } catch (e: JSONException) {
                throw RuntimeException(e)
            }
            return this
        }

        fun put(name: String, i: Int?): Builder {
            try {
                mJson.put(name, i)
            } catch (e: JSONException) {
                throw RuntimeException(e)
            }
            return this
        }

        fun put(name: String, l: Long?): Builder {
            try {
                mJson.put(name, l)
            } catch (e: JSONException) {
                throw RuntimeException(e)
            }
            return this
        }

        fun put(name: String, f: Float?): Builder {
            try {
                mJson.put(name, if (java.lang.Float.isNaN(f!!)) null else f)
            } catch (e: JSONException) {
                throw RuntimeException(e)
            }
            return this
        }

        fun put(name: String, d: Double?): Builder {
            try {
                mJson.put(name, if (java.lang.Double.isNaN(d!!)) null else d)
            } catch (e: JSONException) {
                throw RuntimeException(e)
            }
            return this
        }

        fun put(name: String, b: Boolean?): Builder {
            try {
                mJson.put(name, b)
            } catch (e: JSONException) {
                throw RuntimeException(e)
            }
            return this
        }

        fun put(name: String, v: FlipperValue): Builder {
            return put(name, v.toFlipperObject())
        }

        fun put(name: String, a: FlipperArray?): Builder {
            try {
                mJson.put(name, a?.json)
            } catch (e: JSONException) {
                throw RuntimeException(e)
            }
            return this
        }

        fun put(name: String, b: FlipperArray.Builder): Builder {
            return put(name, b.build())
        }

        fun put(name: String, o: FlipperObject?): Builder {
            try {
                mJson.put(name, o?.json)
            } catch (e: JSONException) {
                throw RuntimeException(e)
            }
            return this
        }

        fun put(name: String, b: Builder): Builder {
            return put(name, b.build())
        }

        fun build(): FlipperObject {
            return FlipperObject(mJson)
        }
    }
}
