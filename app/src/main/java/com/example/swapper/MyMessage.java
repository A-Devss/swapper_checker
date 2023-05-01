package com.example.swapper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyMessage extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_message);
        getSupportActionBar().setTitle("MyMessage");
        Intent intent = getIntent();
        t = (TextView) findViewById(R.id.textCheck);
        String result = intent.getStringExtra("SAME");
        t.setText(result);

    }
}