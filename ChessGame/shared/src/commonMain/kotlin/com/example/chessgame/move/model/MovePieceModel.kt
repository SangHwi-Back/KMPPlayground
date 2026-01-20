package com.example.chessgame.move.model

import com.example.chessgame.board.model.BoardLocation

data class MovePieceModel(
    val from: BoardLocation,
    val to: BoardLocation
)
