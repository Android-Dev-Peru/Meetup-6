package com.androiddevpe.pokedexkotlintemplate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private View iviPJava;
    private View iviPKotlin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ui();
    }

    private void ui() {
        iviPJava= findViewById(R.id.iviPJava);
        iviPKotlin= findViewById(R.id.iviPKotlin);

        iviPJava.setOnClickListener(this);
        iviPKotlin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iviPJava:
                gotoPokedexJava();
                break;

            case R.id.iviPKotlin:
                gotoPokedexKotlin();
                break;
        }
    }

    private void gotoPokedexJava() {

        startActivity(new Intent(this,PokedexActivity.class));
    }

    private void gotoPokedexKotlin() {
        //startActivity(new Intent(this,PokedexKotlinActivity.class));
    }
}
