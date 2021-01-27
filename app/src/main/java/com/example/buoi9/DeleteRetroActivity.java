package com.example.buoi9;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DeleteRetroActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_retro);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        DataFunc dataFunc = new DataFunc();
        dataFunc.deleteFunc(textView, editText.getText().toString());
    }
}