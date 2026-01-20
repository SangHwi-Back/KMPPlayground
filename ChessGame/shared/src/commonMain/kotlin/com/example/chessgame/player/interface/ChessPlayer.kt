package com.example.chessgame.player.`interface`

import com.example.chessgame.pieces.`interface`.ChessPiece

interface ChessPlayer {
    var pieceRemain: Array<ChessPiece>
    var pieceEarned: Array<ChessPiece>
}