package com.example.engrbalogungift.finalcovenantuniversity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.FirebaseDatabase;

public class Questions extends AppCompatActivity {

    private TextView mScoreView;
    private TextView mQuestion;
    private Button mButtonChoice1, mButtonChoice2, mButtonChoice3, mButtonChoice4;

    private String mAnswer;
    private int mScore;
    private int mQuestionNumber = 0;

    private FirebaseDatabase mQuestionRef, mChoiceRef1, mChoiceRef2, mChoiceRef3, mChoiceRef4, mAnswerRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        mScoreView = (TextView) findViewById(R.id.score);
        mQuestion = (TextView) findViewById(R.id.question);

        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.choice4);

    }
}