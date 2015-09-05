package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
//import com.example.android.courtcounter.DoublyLinkedList;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addPointForTeamA(View view) {
        switch (view.getId()){
            case (R.id.team_a_add_three):
                scoreTeamA += 3;
                displayForTeamA(scoreTeamA);
                break;
            case (R.id.team_a_add_two):
                scoreTeamA += 2;
                displayForTeamA(scoreTeamA);
                break;
            case (R.id.team_a_add_one):
                scoreTeamA += 1;
                displayForTeamA(scoreTeamA);
                break;
        }
    }

    /**
     * Displays the given score for Team b.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addPointForTeamB(View view) {
        switch (view.getId()){
            case (R.id.team_b_add_three):
                scoreTeamB += 3;
                displayForTeamB(scoreTeamB);
                break;
            case (R.id.team_b_add_two):
                scoreTeamB += 2;
                displayForTeamB(scoreTeamB);
                break;
            case (R.id.team_b_add_one):
                scoreTeamB += 1;
                displayForTeamB(scoreTeamB);
                break;
        }
    }

    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.team_a_score);
        priceTextView.setText(message);
    }
}
