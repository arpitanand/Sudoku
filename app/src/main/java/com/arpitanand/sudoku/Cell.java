package com.arpitanand.sudoku;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;

/**
 * Created by arpitanand on 08/11/17.
 */
public class Cell extends AppCompatTextView {

  private final int x;
  private final int y;
  private int v;

  public Cell(Context context, int x, int y) {
    super(context);
    this.x = x;
    this.y = y;
    this.v = 0;
  }

  public void setValue() {
    this.v = v;
  }
}
