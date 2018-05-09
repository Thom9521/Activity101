package com.jfdimarzio.activity101;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity {

    ProgressDialog progressDialog;
    String tag = "Livscyklus skridt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "Kører onCreate()");

    }

    public void onStart() {
        super.onStart();
        Log.d(tag, "Kører onStart()");
        progressDialog = ProgressDialog.show(this, "Please Wait", "Processing...", true);
        CountDownTimer timer = new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                progressDialog.dismiss();
            }
        }.start();
    }

    public void onRestart() {
        super.onRestart();
        Log.d(tag, "Kører onRestart()");
    }

    public void onResume() {
        super.onResume();
        Log.d(tag, "Kører onResume()");
    }

    public void onPause() {
        super.onPause();
        Log.d(tag, "Kører onPause()");
    }

    public void onStop() {
        super.onStop();
        Log.d(tag, "Kører onStop()");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "Kører onDestroy()");
    }
}


