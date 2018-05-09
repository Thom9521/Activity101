package com.jfdimarzio.activity101;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends Activity {

    ProgressDialog progressDialog;
    String tag = "Livscyklus skridt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "Kører onCreate()");

        Button buttonP = (Button) findViewById(R.id.buttonP);
        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tw = (TextView) findViewById(R.id.textView);
                tw.setText("No crasharino feelsamazingman");
            }
        });
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


