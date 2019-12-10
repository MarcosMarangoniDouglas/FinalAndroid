package com.example.prefinal;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

  Handler clockHandler;
  Clock clock = new Clock();

  TextView txtClock;
  Button btnMainActivity;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_first);

    clockHandler = new Handler(Looper.getMainLooper());

    txtClock = findViewById(R.id.txtClock);
    btnMainActivity = findViewById(R.id.btnMainActivity);
    btnMainActivity.setOnClickListener(this);
  }

  @Override
  protected void onResume() {
    super.onResume();
    clockHandler.postDelayed(clock, 1000);
  }

  private class Clock implements Runnable {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.CANADA);

    @Override
    public void run() {
      txtClock.setText(simpleDateFormat.format(new Date()));
      clockHandler.postDelayed(this, 1000);
    }
  }

  @Override
  public void onClick(View v) {
    Intent intent = new Intent(this, MainActivity.class);
    startActivity(intent);
  }

  @Override
  protected void onStop() {
    super.onStop();
    clockHandler.removeCallbacks(clock);
  }
}
