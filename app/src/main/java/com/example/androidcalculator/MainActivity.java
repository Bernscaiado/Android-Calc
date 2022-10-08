package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ScriptEngine engine;

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
    Button btnEqual;

    TextView text_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        engine = new ScriptEngineManager().getEngineByName("rhino");

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
        btnEqual = (Button) findViewById(R.id.button17);


        text_display = (TextView) findViewById(R.id.textView);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);

        btnC.setOnClickListener(this);
        btnEqual.setOnClickListener(this);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnDiv.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.button14:
                addNumber("0");
                break;
            case R.id.button1:
                addNumber("1");
                break;
            case R.id.button2:
                addNumber("2");
                break;
            case R.id.button3:
                addNumber("3");
                break;
            case R.id.button5:
                addNumber("4");
                break;
            case R.id.button6:
                addNumber("5");
                break;
            case R.id.button7:
                addNumber("6");
                break;
            case R.id.button9:
                addNumber("7");
                break;
            case R.id.button10:
                addNumber("8");
                break;
            case R.id.button11:
                addNumber("9");
                break;
            case R.id.button4:
                addNumber("+");
                break;
            case R.id.button8:
                addNumber("-");
                break;
            case R.id.button16:
                addNumber("/");
                break;
            case R.id.button12:
                addNumber("*");
                break;
            case R.id.button13:
                clear_display();
                break;
            case R.id.button15:
                addNumber(".");
                break;

        }

    }

    private void addNumber(String number) {
        text_display.setText(text_display.getText()+number);
    }

    private void clear_display() {
        text_display.setText("");
    }
}