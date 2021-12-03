package com.facebook.flipper.plugins.network

interface NetworkReporter {
    fun reportRequest(requestInfo: RequestInfo?)
    fun reportResponse(responseInfo: ResponseInfo?)
    class Header(val name: String, val value: String?) {
        override fun toString(): String = ""
    }

    class RequestInfo {
        var requestId: String? = null
        var timeStamp: Long = 0
        var headers: List<Header> = ArrayList()
        var method: String? = null
        var uri: String? = null
        var body: ByteArray? = null
        fun getFirstHeader(name: String): Header? = null
    }

    class ResponseInfo {
        var requestId: String? = null
        var timeStamp: Long = 0
        var statusCode = 0
        var statusReason: String? = null
        var headers: List<Header> = ArrayList()
        var body: ByteArray? = null
        var isMock = false
        fun getFirstHeader(name: String): Header? = null
    }
}
