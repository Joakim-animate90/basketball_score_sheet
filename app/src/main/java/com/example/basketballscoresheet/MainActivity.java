package com.example.basketballscoresheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreTemA = 0;
    int scoreTemB = 0;
    Joakim j = new Joakim();
    Peter p = new Peter();
    Jay ja = new Jay();
    Judy ju = new Judy();
    Prof pr = new Prof();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
     * Team A Code Started
     * */
    public void teamAOneScore(View view) {

        scoreTemA = scoreTemA + 1;
        displayForTeamA(scoreTemA);
    }



    public void teamATwoScore(View view) {
        scoreTemA = scoreTemA + 2;
        displayForTeamA(scoreTemA);
    }

    public void teamAThreeScore(View view) {
        scoreTemA = scoreTemA + 3;
        displayForTeamA(scoreTemA);
    }

    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("" + score);
    }
    private void displayForJoakim(int score) {
        TextView foulsView = (TextView) findViewById(R.id.fouls_joakim);
        foulsView.setText("" + score);
    }
    /*
     * Team A Code finish
     * */

    /*
     * Team B Code Started
     * */
    public void teamBOneScore(View view) {
        scoreTemB = scoreTemB + 1;
        displayForTeamB(scoreTemB);
    }

    public void teamBTwoScore(View view) {
        scoreTemB = scoreTemB + 2;
        displayForTeamB(scoreTemB);
    }

    public void teamBThreeScore(View view) {
        scoreTemB = scoreTemB + 3;
        displayForTeamB(scoreTemB);
    }

    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /*
     * Team B Code finish
     * */

    //Reset button code
    public void resetButton(View view) {
        scoreTemA = 0;
        scoreTemB = 0;
        displayForTeamA(0);
        displayForTeamB(0);

    }
    public void onClick(View view) {
        TextView txtView;
        System.out.println("printed");
        switch(view.getId()) {
            case R.id.joakim:
                txtView = (TextView)findViewById(R.id.joakim);
                if (j.joakimFouls <= 4){
                    j.fouls(view);
                }

            else{
                txtView.setVisibility(view.INVISIBLE);
                Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();
                }


                break;
            case R.id.peter:

                txtView = (TextView)findViewById(R.id.peter);
                if (p.peterFouls <= 4){
                    p.fouls(view);
                }

                else{
                    txtView.setVisibility(view.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();
                }


                break;
            case R.id.jay:

                txtView = (TextView)findViewById(R.id.jay);
                if (ja.jayFouls<= 4){
                    ja.fouls(view);
                }

                else{
                    txtView.setVisibility(view.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();
                }


                break;
            case R.id.judy:

                txtView = (TextView)findViewById(R.id.judy);
                if (ju.judyFouls <= 4){
                    ju.fouls(view);
                }

                else{
                    txtView.setVisibility(view.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();
                }


                break;
            case R.id.prof:

                txtView = (TextView)findViewById(R.id.prof);
                if (pr.profFouls<= 4){
                    pr.fouls(view);
                }

                else{
                    txtView.setVisibility(view.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();
                }


                break;


        }
    }
    abstract class Display {
        public void display(int score) {

        }
        public void fouls(View view){}

    }
    public class Peter extends Display{
        int peterFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_peter);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

                peterFouls= peterFouls + 1;

                display(peterFouls);


        }
    }
    public class Joakim extends Display{
        int joakimFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_joakim);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            joakimFouls= joakimFouls + 1;

            display(joakimFouls);


        }
    }
    public class Jay extends Display{
        int jayFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_jay);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            jayFouls= jayFouls + 1;

            display(jayFouls);


        }
    }
    public class Judy extends Display{
        int judyFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_judy);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            judyFouls= judyFouls + 1;

            display(judyFouls);


        }
    }
    public class Prof extends Display{
        int profFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_prof);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            profFouls= profFouls + 1;

            display(profFouls);


        }
    }
}
