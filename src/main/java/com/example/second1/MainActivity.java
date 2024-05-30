package com.example.second1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvName;
    private EditText editUserName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.tvTextView);
        editUserName = findViewById(R.id.InputTextName);
    }

    public void onClick(View v){
        if (editUserName.getText().length() == 0)
            tvName.setText("ti typoi?");
        else
            tvName.setText("Hello, " + editUserName.getText());
    }
}