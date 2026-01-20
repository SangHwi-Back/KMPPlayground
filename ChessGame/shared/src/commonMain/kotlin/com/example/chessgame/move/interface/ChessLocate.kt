package com.example.chessgame.move.`interface`

import com.example.chessgame.board.`interface`.ChessBoard
import com.example.chessgame.move.model.MovePieceModel

interface ChessLocate {
    fun locate(board: ChessBoard, model: MovePieceModel)
}