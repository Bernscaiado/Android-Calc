package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;

    Button btnPlus;
    Button btnMinus;
    Button btnC;
    Button btnMult;
    Button btnDiv;
    Button btnDot;

    TextView text_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button5);
        btn5 = (Button) findViewById(R.id.button6);
        btn6 = (Button) findViewById(R.id.button7);
        btn7 = (Button) findViewById(R.id.button9);
        btn8 = (Button) findViewById(R.id.button10);
        btn9 = (Button) findViewById(R.id.button11);
        btn0 = (Button) findViewById(R.id.button14);


        btnPlus = (Button) findViewById(R.id.button4);
        btnMinus = (Button) findViewById(R.id.button8);
        btnC = (Button) findViewById(R.id.button13);
        btnMult = (Button) findViewById(R.id.button12);
        btnDot= (Button) findViewById(R.id.button15);
        btnDiv= (Button) findViewById(R.id.button16);







        text_display = (TextView) findViewById(R.id.textView);

        btn1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text_display.setText(text_display.getText()+"1");

                    }
                }
        );

        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text_display.setText(text_display.getText()+"2");

                    }
                }
        );

        btn3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text_display.setText(text_display.getText()+"3");

                    }
                }
        );

        btn4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text_display.setText(text_display.getText()+"4");

                    }
                }
        );

        btn5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text_display.setText(text_display.getText()+"5");

                    }
                }
        );

        btn6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text_display.setText(text_display.getText()+"6");

                    }
                }
        );

        btn7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text_display.setText(text_display.getText()+"7");

                    }
                }
        );

        btn8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text_display.setText(text_display.getText()+"8");

                    }
                }
        );

        btn9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text_display.setText(text_display.getText()+"9");

                    }
                }
        );

        btn0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text_display.setText(text_display.getText()+"0");

                    }
                }
        );

        btnPlus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text_display.setText(text_display.getText()+"+");

                    }
                }
        );

        btnMinus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text_display.setText(text_display.getText()+"-");

                    }
                }
        );

        btnC.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text_display.setText("");

                    }
                }
        );

        btnMult.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text_display.setText(text_display.getText()+"*");

                    }
                }
        );

        btnDiv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text_display.setText(text_display.getText()+"/");

                    }
                }
        );

        btnDot.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text_display.setText(text_display.getText()+".");

                    }
                }
        );




    }
}