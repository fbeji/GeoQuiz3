package com.bignerdranch.android.geoquiz3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CheatActivity extends AppCompatActivity {

  private static final String EXTRA_ANSWER_IS_TRUE = "com.bignerdranch.android.geoquiz3.answer_is_true";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_cheat);
  }
}
