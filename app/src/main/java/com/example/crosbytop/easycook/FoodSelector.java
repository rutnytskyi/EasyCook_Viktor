package com.example.crosbytop.easycook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;



public class FoodSelector extends AppCompatActivity {


    Button meat;
    Button salmon;
    Button chicken;


    boolean trigForBut1 = false;
    boolean trigForBut2 = false;
    boolean trigForBut3 = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_selector);

        meat = (Button) findViewById(R.id.button2);
        salmon = (Button) findViewById(R.id.button3);
        chicken = (Button) findViewById(R.id.button1);


        meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!trigForBut1) {
                    meat.setBackgroundResource(R.drawable.meats);
                    trigForBut1 = true;
                }
                else{
                    meat.setBackgroundResource(R.drawable.meat);
                    trigForBut1 = false;
                }
            }
        });

        salmon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (!trigForBut2) {
                    salmon.setBackgroundResource(R.drawable.salmons);
                    trigForBut2 = true;
                }
                else {
                    salmon.setBackgroundResource(R.drawable.salmon);
                    trigForBut2 = false;
                }
            }
        });

        chicken.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (!trigForBut3) {
                    chicken.setBackgroundResource(R.drawable.chickens);
                    trigForBut3 = true;
                }
                else {
                    chicken.setBackgroundResource(R.drawable.chicken);
                    trigForBut3 = false;
                }
            }

        });



        //mainGrid = (GridLayout)(findViewById(mainGrid))


    }


}