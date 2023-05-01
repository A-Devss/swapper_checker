package com.example.swapper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Button btn1, btn2;
    private EditText eText1, eText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Task Performance");
    }

    @Override
    protected void onStart() {
        super.onStart();
        btn1 = findViewById(R.id.bt1);
        btn2 = findViewById(R.id.bt2);
        eText1 = findViewById(R.id.txt1);
        eText2 = findViewById(R.id.txt2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = eText1.getText().toString().trim();
                String text2 = eText2.getText().toString().trim();

                Intent intent = new Intent(MainActivity.this, MyMessage.class);

                if (text1.equals(text2)){
                    intent.putExtra("SAME", "THE SAME");
                    startActivity(intent);
                }else{
                    intent.putExtra("SAME", "NOT THE SAME");
                    startActivity(intent);

                }
            }

        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = eText1.getText().toString().trim();
                String text2 = eText2.getText().toString().trim();
                if(!text1.isEmpty() && !text2.isEmpty()){
                    eText1.setText(text2);
                    eText2.setText(text1);
                }else{
                    Toast.makeText(MainActivity.this, "Please enter something", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}