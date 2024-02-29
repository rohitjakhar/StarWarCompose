package com.rohitjakhar.starwarcompose.utils

sealed class Response<T>(
    open val data: T? = null,
    open val message: String? = null
) {
    data object Loading : Response<Nothing>()
    data class Success<T>(
        override val data: T,
        override val message: String? = null
    ) : Response<T>(
        data = data,
        message = message
    )

    data class Error<T>(
        override val message: String,
        override val data: T? = null
    ) : Response<T>(data, message)
}