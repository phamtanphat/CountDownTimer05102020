package com.example.countdowntimer05102020;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.concurrent.CountDownLatch;

public class MainActivity extends AppCompatActivity {

    ImageView mImgBanner;
    Button mBtnStart;
    int[] mArrayImages = {
            R.drawable.hinh1,
            R.drawable.hinh2,
            R.drawable.hinh3,
            R.drawable.hinh4,
            R.drawable.hinh5,
    };
    int mCount = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImgBanner = findViewById(R.id.imageView);
        mBtnStart = findViewById(R.id.buttonStart);

        mBtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CountDownTimer countDownTimer = new CountDownTimer() {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        if (mCount >= mArrayImages.length) {
                            mCount = 0;
                        }
                        mImgBanner.setImageResource(mArrayImages[mCount++]);
                    }

                    @Override
                    public void onFinish() {

                    }
                };

            }
        });



    }
}