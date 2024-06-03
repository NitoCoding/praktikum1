package com.example.praktikum1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        Button sendButton = findViewById(R.id.sendButton);
        LinearLayout scrollViewContent = findViewById(R.id.scrollViewContent);

        sendButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String text = editText.getText().toString().trim();

                if (!text.isEmpty()) {

                    TextView textView = new TextView(MainActivity.this);
                    textView.setText(text);
                    textView.setTextSize(20);

                    scrollViewContent.addView(textView);
                    editText.getText().clear();
                }
            }
        });
    }
}