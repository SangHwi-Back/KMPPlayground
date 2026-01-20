package com.example.chessgame

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform