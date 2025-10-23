package com.example.myapplication4;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.slider.RangeSlider;

public class MainActivity2 extends AppCompatActivity {
    ImageView heart;
    TextView textView;
    MaterialButton finishButton;
    boolean isLiked = false;
boolean active = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        heart = findViewById(R.id.iv_Heart_Icon);
        heart.setOnClickListener(view -> {
            if (active) {
                heart.setImageResource(R.drawable.heart);
            } else {
                heart.setImageResource(R.drawable.ic_heart2);
            }
            active = !active;
        });
        finishButton = findViewById(R.id.next_button);
        finishButton.setOnClickListener(view -> {
            finish();
        });
        Spinner dropdown = findViewById(R.id.dropdown);
        String[] items = {"item 1", "item 2", "item 3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity2.this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(adapter);
        }

    }
