package com.example.akasoo.mycalcgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView =  (TextView)findViewById(R.id.textView);
        textView.setText(String.valueOf(0));
    }

    public void onButtonGame(View view){
        Intent intent = new Intent(this,GameActivity.class);
        startActivity(intent);
    }

    public void onButtonOne(View view){

    }
}
