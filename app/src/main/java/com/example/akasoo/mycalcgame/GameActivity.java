package com.example.akasoo.mycalcgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void onButtonDen(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
