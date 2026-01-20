package com.example.chessgame.board.`interface`

import com.example.chessgame.board.model.BoardLocation
import com.example.chessgame.board.model.LocationPieceModel
import com.example.chessgame.move.model.MovePieceModel
import com.example.chessgame.pieces.PieceColor
import com.example.chessgame.pieces.model.*

interface ChessBoard {
    var board: Array<Array<LocationPieceModel>>
    fun getLocation(model: MovePieceModel): Array<BoardLocation>
}

fun ChessBoard.refreshGame() {
    // Reset the board to starting position
    board = Array(8) { row ->
        Array(8) { column ->
            val piece = when (row) {
                // Black pieces (row 0-1)
                0 -> when (column) {
                    0, 7 -> Rook(PieceColor.BLACK)
                    1, 6 -> Knight(PieceColor.BLACK)
                    2, 5 -> Bishop(PieceColor.BLACK)
                    3 -> Queen(PieceColor.BLACK)
                    4 -> King(PieceColor.BLACK)
                    else -> null
                }
                1 -> Pawn(PieceColor.BLACK)

                // White pieces (row 6-7)
                6 -> Pawn(PieceColor.WHITE)
                7 -> when (column) {
                    0, 7 -> Rook(PieceColor.WHITE)
                    1, 6 -> Knight(PieceColor.WHITE)
                    2, 5 -> Bishop(PieceColor.WHITE)
                    3 -> Queen(PieceColor.WHITE)
                    4 -> King(PieceColor.WHITE)
                    else -> null
                }

                // Empty squares (row 2-5)
                else -> null
            }

            LocationPieceModel(
                location = BoardLocation(column = column, row = row),
                piece = piece
            )
        }
    }
}