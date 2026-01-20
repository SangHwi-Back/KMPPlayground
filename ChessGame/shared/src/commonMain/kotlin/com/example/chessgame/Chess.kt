package com.example.chessgame

import com.example.chessgame.board.`interface`.ChessBoard
import com.example.chessgame.board.model.BoardLocation
import com.example.chessgame.board.model.LocationPieceModel
import com.example.chessgame.move.model.MovePieceModel

class Chess (
    override var board: Array<Array<LocationPieceModel>>
): ChessBoard {
    override fun getLocation(model: MovePieceModel): Array<BoardLocation> {
        return arrayOf()
    }
}