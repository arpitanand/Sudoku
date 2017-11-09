package com.arpitanand.sudoku

/**
 * Created by arpitanand on 06/11/17.
 */

class Solver {

  fun strigifyBoard(arr: Array<IntArray>): String {
    var s = ""
    for (i in arr.indices) {
      for (j in arr[i].indices) {
        s += arr[i][j]
        s += " "
      }
      s += "\n"
    }
    return s
  }

  fun solve(board: Array<IntArray>): Boolean {
    for (r in board.indices) {
      for (c in board[r].indices) {
        if (board[r][c] == 0) {
          var v = 1
          while (v <= 9) {
            if (isValid(board, r, c, v)) {
              board[r][c] = v
              if (solve(board))
              // value works. let's go ahead
                return true
              else
              // invalid value. backtrace
                board[r][c] = 0
            }
            v++
          }
          return false
        }
      }
    }
    System.out.print(strigifyBoard(board))
    return true
  }


  fun isValid(board: Array<IntArray>, r: Int, c: Int, v: Int): Boolean {
    for (i in 0..8) {
      // row
      if (board[i][c] != 0 && board[i][c] == v)
        return false
      // column
      if (board[r][i] != 0 && board[r][i] == v)
        return false
      // grid
      if (board[3 * (r / 3) + i / 3][3 * (c / 3) + i % 3] != 0 && board[3 * (r / 3) + i / 3][3 * (c / 3) + i % 3] == v)
        return false
    }
    return true
  }

}
