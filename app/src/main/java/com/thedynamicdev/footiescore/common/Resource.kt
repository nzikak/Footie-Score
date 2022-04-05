package com.thedynamicdev.footiescore.common

sealed class Resource<T>(val data: T? = null, message: String? = null) {
    class SUCCESS<T>(data: T?): Resource<T>(data)
    class LOADING<T>: Resource<T>()
    class ERROR<T>(message: String?): Resource<T>(message = message)
}
