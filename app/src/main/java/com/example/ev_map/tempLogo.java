package com.example.ev_map;

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.LinearLayout;

public class tempLogo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.templogo);
        Handler timer = new Handler();
        timer.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(tempLogo.this, MainActivity.class);
                startActivity(intent); //다음 액티비티 이동
                finish(); // 이 액티비티를 종료
            }
        },2000);
    }
}
