package com.example.pab_20182_si4006_m5_36_muhammadariqnaufal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent = getIntent();
        String message = "Order :" + intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView tvOrder = findViewById(R.id.tvOrder);
        tvOrder.setText(message);
    }
}
