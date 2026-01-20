package com.example.chessgame.move.model

import com.example.chessgame.board.model.BoardLocation
import com.example.chessgame.pieces.`interface`.ChessPiece

data class LocationMovePieceEffectModel(
    val newLocation: BoardLocation,
    val piece: ChessPiece
)
