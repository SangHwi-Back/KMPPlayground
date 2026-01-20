package com.example.chessgame.player.model

import com.example.chessgame.pieces.`interface`.ChessPiece
import com.example.chessgame.player.`interface`.ChessPlayer

class GameOpponent (
    override var pieceEarned: Array<ChessPiece> = arrayOf(),
    override var pieceRemain: Array<ChessPiece>
): ChessPlayer