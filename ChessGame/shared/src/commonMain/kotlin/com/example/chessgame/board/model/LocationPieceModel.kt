package com.example.chessgame.board.model

import com.example.chessgame.pieces.`interface`.ChessPiece

data class LocationPieceModel(
    val location: BoardLocation,
    var piece: ChessPiece?
)
