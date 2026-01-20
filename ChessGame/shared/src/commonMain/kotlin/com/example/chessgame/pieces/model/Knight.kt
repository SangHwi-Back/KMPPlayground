package com.example.chessgame.pieces.model

import com.example.chessgame.pieces.PieceColor
import com.example.chessgame.pieces.PieceType
import com.example.chessgame.pieces.`interface`.ChessPiece

class Knight (
    override val color: PieceColor
): ChessPiece {
    override val type = PieceType.Knight
}