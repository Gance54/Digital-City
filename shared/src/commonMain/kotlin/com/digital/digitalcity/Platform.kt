package com.digital.digitalcity

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform