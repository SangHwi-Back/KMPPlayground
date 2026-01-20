package com.example.chessgame

import com.example.chessgame.board.`interface`.ChessBoard
import com.example.chessgame.board.model.BoardLocation
import com.example.chessgame.board.model.LocationPieceModel

class Greeting {
    private val platform = getPlatform()
    private var chess = Chess(
        board = Array(8) { row ->
            Array(8) { column ->
                LocationPieceModel(
                    location = BoardLocation(column = column, row = row),
                    piece = null
                )
            }
        }
    )

    fun getChessBoard(): ChessBoard = chess
}