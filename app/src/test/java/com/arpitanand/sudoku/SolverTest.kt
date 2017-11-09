package com.arpitanand.sudoku

import org.junit.Test

/**
 * Created by arpitanand on 08/11/17.
 */
class SolverTest {

  @Test
  fun testSudokuSolver() {

    val grid: Array<IntArray> = arrayOf(
        intArrayOf(5, 3, 0, 0, 7, 0, 0, 0, 0),
        intArrayOf(6, 0, 0, 1, 9, 5, 0, 0, 0),
        intArrayOf(0, 9, 8, 0, 0, 0, 0, 6, 0),
        intArrayOf(8, 0, 0, 0, 6, 0, 0, 0, 3),
        intArrayOf(4, 0, 0, 8, 0, 3, 0, 0, 1),
        intArrayOf(7, 0, 0, 0, 2, 0, 0, 0, 6),
        intArrayOf(0, 6, 0, 0, 0, 0, 2, 8, 0),
        intArrayOf(0, 0, 0, 4, 1, 9, 0, 0, 5),
        intArrayOf(0, 0, 0, 0, 8, 0, 0, 7, 9)
    )

    val solver = Solver()
    solver.solve(grid)
  }

  @Test
  fun testSudokuSolver2() {

    val grid: Array<IntArray> = arrayOf(
        intArrayOf(0, 4, 0, 0, 0, 0, 6, 1, 0),
        intArrayOf(8, 0, 0, 0, 0, 9, 0, 0, 0),
        intArrayOf(6, 7, 2, 0, 3, 0, 0, 0, 4),
        intArrayOf(0, 0, 0, 9, 0, 0, 0, 0, 0),
        intArrayOf(7, 0, 3, 0, 8, 5, 4, 0, 0),
        intArrayOf(0, 0, 8, 0, 0, 4, 5, 6, 1),
        intArrayOf(1, 5, 7, 0, 0, 0, 8, 3, 0),
        intArrayOf(0, 0, 0, 2, 1, 8, 7, 0, 0),
        intArrayOf(0, 8, 0, 0, 0, 0, 1, 0, 0)
    )

    val solver = Solver()
    solver.solve(grid)
  }

}