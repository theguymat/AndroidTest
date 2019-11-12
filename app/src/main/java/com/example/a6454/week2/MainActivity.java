package com.example.a6454.week2;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
       TextView label = findViewById(R.id.textView);
       EditText entry = findViewById(R.id.editText);
       TextInputEditText entry2 = findViewById(R.id.entry2);

       label.setText(entry2.getText());


    }
}
