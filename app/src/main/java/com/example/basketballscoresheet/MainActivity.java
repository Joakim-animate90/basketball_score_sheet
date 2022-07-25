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
    Mbura m = new Mbura();
    Gesare g = new Gesare();
    Bill b = new Bill();
    Joy jo = new Joy();
    Oguda o = new Oguda();
    Griffins gr = new Griffins();
    Smith s = new Smith();
    Opiyo op = new Opiyo();
    Tony t = new Tony();
    Mwichabe mw = new Mwichabe();
    Ongare on = new Ongare();
    Otis ot = new Otis();
    Toboa to = new Toboa();
    John jn = new John();
    Regina r = new Regina();


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
        j.resetButton(view);
        p.resetButton(view);
        ja.resetButton(view);
        ju.resetButton(view);
        pr.resetButton(view);
        m.resetButton(view);
        g.resetButton(view);
        b.resetButton(view);
        jo.resetButton(view);
        o.resetButton(view);

    }
    public void onClick(View view) {
        TextView txtView, txtView_gr, txtView_s, txtView_op,txtView_t, txtView_m;
        System.out.println("printed");
        switch(view.getId()) {
            case R.id.joakim:
                txtView = (TextView)findViewById(R.id.joakim);
                txtView_gr = (TextView)findViewById(R.id.griffins);
                if (j.joakimFouls <= 4){
                    j.fouls(view);
                }

            else{
                txtView.setVisibility(view.INVISIBLE);

                Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();

                txtView_gr.setVisibility(view.VISIBLE);
                }


                break;
            case R.id.griffins:

                txtView_gr = (TextView)findViewById(R.id.griffins);
                if (gr.griffinsFouls <= 4){
                    gr.fouls(view);
                }

                else{
                    txtView_gr.setVisibility(view.INVISIBLE);

                    Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();


                }


                break;
            case R.id.peter:
                txtView_s = (TextView)findViewById(R.id.smith);
                txtView = (TextView)findViewById(R.id.peter);
                if (p.peterFouls <= 4){
                    p.fouls(view);
                }

                else{
                    txtView.setVisibility(view.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();
                    txtView_s.setVisibility(view.VISIBLE);
                }


                break;
            case R.id.smith:

                txtView = (TextView)findViewById(R.id.smith);
                if (s.smithFouls <= 4){
                    s.fouls(view);
                }

                else{
                    txtView.setVisibility(view.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();

                }


                break;
            case R.id.jay:
                txtView_op = (TextView)findViewById(R.id.opiyo);
                txtView = (TextView)findViewById(R.id.jay);
                if (ja.jayFouls<= 4){
                    ja.fouls(view);
                }

                else{
                    txtView.setVisibility(view.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();
                    txtView_op.setVisibility(view.VISIBLE);
                }


                break;
            case R.id.opiyo:

                txtView = (TextView)findViewById(R.id.opiyo);
                if (op.opiyoFouls <= 4){
                    op.fouls(view);
                }

                else{
                    txtView.setVisibility(view.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();

                }


                break;
            case R.id.judy:
                txtView_t = (TextView)findViewById(R.id.tony);
                txtView = (TextView)findViewById(R.id.judy);
                if (ju.judyFouls <= 4){
                    ju.fouls(view);
                }

                else{
                    txtView.setVisibility(view.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();
                    txtView_t.setVisibility(View.VISIBLE);
                }


                break;
            case R.id.tony:

                txtView = (TextView)findViewById(R.id.tony);
                if (t.tonyFouls <= 4){
                    t.fouls(view);
                }

                else{
                    txtView.setVisibility(view.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();

                }


                break;
            case R.id.prof:
                txtView_m = (TextView)findViewById(R.id.mwichabe);
                txtView = (TextView)findViewById(R.id.prof);
                if (pr.profFouls<= 4){
                    pr.fouls(view);
                }

                else{
                    txtView.setVisibility(view.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();
                    txtView_m.setVisibility(view.VISIBLE);
                }


                break;
            case R.id.mwichabe:

                txtView = (TextView)findViewById(R.id.mwichabe);
                if (mw.mwichabeFouls<= 4){
                    mw.fouls(view);
                }

                else{
                    txtView.setVisibility(view.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();

                }


                break;
            case R.id.mbura:

                txtView = (TextView)findViewById(R.id.mbura);
                if (m.mburaFouls<= 4){
                    m.fouls(view);
                }

                else{
                    txtView.setVisibility(view.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();
                }


                break;
            case R.id.gesare:

                txtView = (TextView)findViewById(R.id.gesare);
                if (g.gesareFouls<= 4){
                    g.fouls(view);
                }

                else{
                    txtView.setVisibility(view.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();
                }


                break;
            case R.id.bill:

                txtView = (TextView)findViewById(R.id.bill);
                if (b.billFouls<= 4){
                    b.fouls(view);
                }

                else{
                    txtView.setVisibility(view.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();
                }


                break;
            case R.id.joy:

                txtView = (TextView)findViewById(R.id.joy);
                if (jo.joyFouls<= 4){
                    jo.fouls(view);
                }

                else{
                    txtView.setVisibility(view.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"Exceeded Number of fouls", Toast.LENGTH_SHORT).show();
                }


                break;
            case R.id.oguda:

                txtView = (TextView)findViewById(R.id.oguda);
                if (o.ogudaFouls<= 4){
                    o.fouls(view);
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
        public void resetButton(View view) {


        }

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

        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.peter);
            txtView.setVisibility(view.VISIBLE);

            display(0);

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
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.joakim);
            txtView.setVisibility(view.VISIBLE);

            display(0);

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
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.jay);
            txtView.setVisibility(view.VISIBLE);

            display(0);

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
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.judy);
            txtView.setVisibility(view.VISIBLE);

            display(0);

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
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.prof);
            txtView.setVisibility(view.VISIBLE);

            display(0);

        }
    }
    public class Mbura extends Display{
        int mburaFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_mbura);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            mburaFouls= mburaFouls + 1;

            display(mburaFouls);


        }
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.mbura);
            txtView.setVisibility(view.VISIBLE);

            display(0);

        }
    }
    public class Gesare extends Display{
        int gesareFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_gesare);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            gesareFouls= gesareFouls + 1;

            display(gesareFouls);


        }
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.gesare);
            txtView.setVisibility(view.VISIBLE);

            display(0);

        }
    }
    public class Bill extends Display{
        int billFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_bill);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            billFouls= billFouls + 1;

            display(billFouls);


        }
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.bill);
            txtView.setVisibility(view.VISIBLE);

            display(0);

        }
    }
    public class Joy extends Display{
        int joyFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_joy);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            joyFouls= joyFouls + 1;

            display(joyFouls);


        }
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.joy);
            txtView.setVisibility(view.VISIBLE);

            display(0);

        }
    }
    public class Oguda extends Display{
        int ogudaFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_oguda);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            ogudaFouls= ogudaFouls + 1;

            display(ogudaFouls);


        }
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.oguda);
            txtView.setVisibility(view.VISIBLE);

            display(0);

        }
    }
    public class Griffins extends Display{
        int griffinsFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_griffins);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            griffinsFouls= griffinsFouls + 1;

            display(griffinsFouls);


        }
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.griffins);
            txtView.setVisibility(view.VISIBLE);

            display(0);

        }
    }
    public class Smith extends Display{
        int smithFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_smith);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            smithFouls= smithFouls + 1;

            display(smithFouls);


        }
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.smith);
            txtView.setVisibility(view.VISIBLE);

            display(0);

        }
    }
    public class Opiyo extends Display{
        int opiyoFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_opiyo);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            opiyoFouls= opiyoFouls + 1;

            display(opiyoFouls);


        }
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.opiyo);
            txtView.setVisibility(view.VISIBLE);

            display(0);

        }
    }
    public class Tony extends Display{
        int tonyFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_tony);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            tonyFouls= tonyFouls + 1;

            display(tonyFouls);


        }
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.tony);
            txtView.setVisibility(view.VISIBLE);

            display(0);

        }
    }
    public class Mwichabe extends Display{
        int mwichabeFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_mwichabe);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            mwichabeFouls= mwichabeFouls + 1;

            display(mwichabeFouls);


        }
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.mwichabe);
            txtView.setVisibility(view.VISIBLE);

            display(0);

        }
    }
    public class Ongare extends Display{
        int ongareFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_ongare);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            ongareFouls= ongareFouls + 1;

            display(ongareFouls);


        }
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.ongare);
            txtView.setVisibility(view.VISIBLE);

            display(0);

        }
    }
    public class Otis extends Display{
        int otisFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_otis);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            otisFouls= otisFouls + 1;

            display(otisFouls);


        }
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.otis);
            txtView.setVisibility(view.VISIBLE);

            display(0);

        }
    }
    public class Toboa extends Display{
        int toboaFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_toboa);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            toboaFouls= toboaFouls + 1;

            display(toboaFouls);


        }
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.toboa);
            txtView.setVisibility(view.VISIBLE);

            display(0);

        }
    }
    public class John extends Display{
        int johnFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_john);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            johnFouls= johnFouls + 1;

            display(johnFouls);


        }
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.john);
            txtView.setVisibility(view.VISIBLE);

            display(0);

        }
    }
    public class Regina extends Display{
        int reginaFouls = 0;
        @Override
        public void display(int score) {
            TextView foulsView = (TextView) findViewById(R.id.fouls_regina);
            foulsView.setText("" + score);

        }

        @Override
        public void fouls(View view) {

            reginaFouls= reginaFouls + 1;

            display(reginaFouls);


        }
        @Override
        public void resetButton(View view) {
            TextView txtView = (TextView)findViewById(R.id.regina);
            txtView.setVisibility(view.VISIBLE);

            display(0);

        }
    }
}
