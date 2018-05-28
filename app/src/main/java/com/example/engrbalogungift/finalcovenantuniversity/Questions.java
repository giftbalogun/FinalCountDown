package com.example.engrbalogungift.finalcovenantuniversity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

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

        updateQuestion();
    }

    private void updateQuestion() {
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference mQuestionRef = database.getReference("https://finalcovenantuniversity.firebaseio.com/"+ mQuestionNumber + "/question");

        mQuestionRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String question = dataSnapshot.getValue(String.class);
                mQuestion.setText(question);
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        DatabaseReference mChoiceRef1 = database.getReference("https://finalcovenantuniversity.firebaseio.com/"+ mQuestionNumber + "/question");

        mChoiceRef1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice1 = dataSnapshot.getValue(String.class);
                mButtonChoice1.setText(choice1);
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        DatabaseReference mChoiceRef2 = database.getReference("https://finalcovenantuniversity.firebaseio.com/"+ mQuestionNumber + "/question");

        mChoiceRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice2 = dataSnapshot.getValue(String.class);
                mButtonChoice2.setText(choice2);
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        DatabaseReference mChoiceRef3 = database.getReference("https://finalcovenantuniversity.firebaseio.com/"+ mQuestionNumber + "/question");

        mChoiceRef3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice3 = dataSnapshot.getValue(String.class);
                mButtonChoice3.setText(choice3);
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        DatabaseReference mChoiceRef4 = database.getReference("https://finalcovenantuniversity.firebaseio.com/"+ mQuestionNumber + "/question");

        mChoiceRef4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice4 = dataSnapshot.getValue(String.class);
                mButtonChoice4.setText(choice4);
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        DatabaseReference mAnswerRef = database.getReference("https://finalcovenantuniversity.firebaseio.com/"+ mQuestionNumber + "/question");

        mAnswerRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                mAnswer = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        mQuestionNumber++;
    }
}
