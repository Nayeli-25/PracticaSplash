package com.example.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Inicio extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_inicio);
        findViewById(R.id.tv1).setOnClickListener(this);

        final TextView tv1 = findViewById(R.id.tv1);

        new CountDownTimer(6000, 1000) {
            public void onTick(long millisUntilFinished) {
                tv1.setText("Iniciando: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                tv1.setText("");
            }
        }.start();
    }
    @Override
    public void onClick(View v){
        Intent ir = new Intent(this, MainActivity.class);
        startActivity(ir);
        finish();
    }
}