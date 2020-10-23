package com.example.countdowntimer05102020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Toast;

import java.util.concurrent.CountDownLatch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountDownTimer countDownTimer = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if ((millisUntilFinished / 1000) > 0) {
                    Toast.makeText(MainActivity.this, (millisUntilFinished / 1000) + "", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this, "Ket thuc", Toast.LENGTH_SHORT).show();
            }
        };
        countDownTimer.start();
    }
}