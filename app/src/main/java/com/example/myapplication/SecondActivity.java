package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private String key="dd";
    private TextView secondText;
    private Button btnThird;
    private EditText edThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        secondText=findViewById(R.id.txt_second);
        btnThird = findViewById(R.id.btn_three);
        edThird=findViewById(R.id.ed_three);

        Bundle argument=getIntent().getExtras();
        String word=argument.getString("ss");
        secondText.setText(word);

        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);
                intent.putExtra(key,edThird.getText().toString());
                startActivity(intent);
            }
        });

    }
}