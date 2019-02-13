package com.bignerdranch.android.geoquiz3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class QuizActivity extends AppCompatActivity {
  private Button mTrueButton;
  private Button mFalseButton;
  private Button mNextButton;
  private Button mCheatButton;
  private TextView mQuestionTextView;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_quiz);
    mTrueButton = (Button) findViewById(R.id.true_button);
    mTrueButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(QuizActivity.this,
            R.string.correct_toast,
            Toast.LENGTH_SHORT).show();
      }
    });
    mFalseButton = (Button) findViewById(R.id.false_button);
    mFalseButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(QuizActivity.this,
            R.string.incorrect_toast,
            Toast.LENGTH_SHORT).show();
      }
    });

    mNextButton = (Button) findViewById(R.id.next_button);
    mNextButton.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View v){

        mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;

      });
    mCheatButton = (Button) findViewById(R.id.cheat_button);
    mCheatButton.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          //start CheatActivity
          Intent intent = new Intent (QuizActivity.this,CheatActivity.class);
          startActivity(intent);
        }
    });
    updateQuestion();
  }
}}

