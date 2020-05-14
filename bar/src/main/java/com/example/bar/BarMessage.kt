package com.example.bar

import javax.inject.Inject

interface BarMessage {
    val message: String
}

class BarMessageImpl @Inject constructor() : BarMessage {

    override val message: String
        get() = "hello world"
}