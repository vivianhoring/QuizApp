package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTxtQuestion;
    private Button btnTrue;
    private Button btnWrong;
    private int mQuestionIndex;

    private QuizModel[] questionCollection = new QuizModel [] {

            new QuizModel(R.string.q1, true),
            new QuizModel(R.string.q2, true),
            new QuizModel(R.string.q3, true),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTxtQuestion = findViewById(R.id.txtQuestion);
        QuizModel q1 = questionCollection[mQuestionIndex];
        mTxtQuestion.setText(q1.getQuestion());

        btnTrue = findViewById(R.id.btnTrue);
        btnWrong = findViewById(R.id.btnWrong);

        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "btn True is tapped now!", Toast.LENGTH_LONG).show();
            }
        });

        btnWrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.i("myApp", "btn Wrong is tapped now!");
                Toast.makeText(getApplicationContext(), "btn Wrong is tapped now!", Toast.LENGTH_LONG).show();
            }
        });

    }
}