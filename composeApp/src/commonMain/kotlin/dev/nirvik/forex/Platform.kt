package dev.nirvik.forex

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform