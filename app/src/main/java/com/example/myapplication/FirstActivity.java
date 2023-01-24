package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    private Button btnTwo;
    private TextView txtOne;
    private EditText edTwo;
    private String keyTwo="ss";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        txtOne = findViewById(R.id.txt_one);
        Bundle argument = getIntent().getExtras();
        String name = argument.getString("gg");
        txtOne.setText(name);

        btnTwo=findViewById(R.id.btn_two);
        edTwo=findViewById(R.id.ed_two);

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra(keyTwo,edTwo.getText().toString());
                startActivity(intent);
            }
        });


    }

}