package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import com.google.android.material.button.MaterialButton;
public class MainActivity extends AppCompatActivity {
    TextView tv_display;
    Button SecretButton1;
    String operation;
    private int num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tv_display = findViewById(R.id.tv_display);
        SecretButton1 = findViewById(R.id.SecretButton);
        findViewById(R.id.SecretButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecretScreeen();
            }
        });
        unitClick();
    }

    private void openSecretScreeen() {
        String ResultText = tv_display.getText().toString();
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("text",ResultText);
       startActivity(intent);

    }

    private void unitClick() {
        findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
                SecretButton1.setVisibility(View.INVISIBLE);
            }

        });
        findViewById(R.id.btn_0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
                SecretButton1.setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.btn_ac).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
                SecretButton1.setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.btn_equal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation(v);
                    SecretButton1.setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.btn_plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation(v);
                SecretButton1.setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.btn_minnus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation(v);
                SecretButton1.setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.btn_delenie).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation(v);
                SecretButton1.setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.btn_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
                SecretButton1.setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.btn_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
                SecretButton1.setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.btn_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
                SecretButton1.setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.btn_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
                SecretButton1.setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.btn_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
                SecretButton1.setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.btn_7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
                SecretButton1.setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.btn_8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
                SecretButton1.setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.btn_9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClick(v);
                SecretButton1.setVisibility(View.INVISIBLE);
            }
        });
    }


    private void onNumberClick(View view) {

        String Text = ((MaterialButton) view).getText().toString();
        if (Text.equals("AC")) {
            tv_display.setText("0");
        } else if (tv_display.getText().toString().equals("0")) {
            tv_display.setText(Text);
        } else {
            tv_display.append(Text);
        }
    }

    private void Operation(View v) {
        if (v.getId() == R.id.btn_plus || v.getId() == R.id.btn_minnus ||
                v.getId() == R.id.btn_X || v.getId() == R.id.btn_delenie) {
            num1 = Integer.parseInt(tv_display.getText().toString());
            if (v.getId() == R.id.btn_plus) {
                operation = "+";
            } else if (v.getId() == R.id.btn_minnus) {
                operation = "-";
            } else if (v.getId() == R.id.btn_X) {
                operation = "*";
            } else if (v.getId() == R.id.btn_delenie) {
                operation = "/";
            }
            tv_display.setText("0");

        } else if (v.getId() == R.id.btn_equal) {

            num2 = Integer.parseInt(tv_display.getText().toString());

            int result = 0;

            if (operation.equals("+")) {
                result = num1 + num2;
            } else if (operation.equals("-")) {
                result = num1 - num2;
            } else if (operation.equals("*")) {
                result = num1 * num2;
            } else if (operation.equals("/")) {
                if (num2 != 0) { //
                    result = num1 / num2;
                } else {

                    result = 0;
                }
            }

            tv_display.setText(String.valueOf(result));
        }
    }

        }
