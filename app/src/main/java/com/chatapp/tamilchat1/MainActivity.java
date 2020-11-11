package com.chatapp.tamilchat1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 2000ms
                startActivity(new Intent(MainActivity.this, WebviewActivity.class));
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.fade_out);
            }
        }, 2000);
    }
}

