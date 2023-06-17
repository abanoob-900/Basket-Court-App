package com.freed.court_basket_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int GoalTeamA = 0;
    int GoalTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreViewA = (TextView) findViewById(R.id.textView2A);
        scoreViewA.setText(String.valueOf(scoreA));
    }

    public void ThreePointA(View view) {

//        int Goal = 3;
        GoalTeamA = GoalTeamA + 3;
        displayForTeamA(GoalTeamA);
    }

    public void TwoPointA(View view) {

//        int Goal = 2;
        GoalTeamA = GoalTeamA + 2;
        displayForTeamA(GoalTeamA);
    }

    public void OnePointA(View view) {

//        int Goal = 1;
        GoalTeamA = GoalTeamA + 1;
        displayForTeamA(GoalTeamA);
    }

    public void displayForTeamB(int scoreB){

        TextView scoreViewB = (TextView)findViewById(R.id.textView2B);
        scoreViewB.setText(String.valueOf(scoreB));
    }

    public void ThreePointB(View view) {

        GoalTeamB = GoalTeamB + 3;
        displayForTeamB(GoalTeamB);
    }

    public void TwoPointB(View view) {

        GoalTeamB = GoalTeamB + 2;
        displayForTeamB(GoalTeamB);
    }

    public void OnePointB(View view) {

        GoalTeamB = GoalTeamB + 1;
        displayForTeamB(GoalTeamB);
    }

    public void ForAB(View view) {

        GoalTeamA = 0;
        GoalTeamB = 0;
        displayForTeamA(GoalTeamA);
        displayForTeamB(GoalTeamB);
    }
}
