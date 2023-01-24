package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    private TextView txtThird;
    private EditText edThird;
    private Button btnThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        txtThird = findViewById(R.id.txt_third);
        edThird = findViewById(R.id.ed_four);
        btnThird = findViewById(R.id.btn_four);

        Bundle argument=getIntent().getExtras();
        String bagash= argument.getString("dd");
        txtThird.setText(bagash);

    }
}