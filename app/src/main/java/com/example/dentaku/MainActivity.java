package com.example.dentaku;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String numberBox = "";
    String sign = "";
    double calcu = 0;
    int inTrans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nm0 = findViewById(R.id.button_0);
        nm0.setOnClickListener(this);
        Button nm1 = findViewById(R.id.button_1);
        nm1.setOnClickListener(this);
        Button nm2 = findViewById(R.id.button_2);
        nm2.setOnClickListener(this);
        Button nm3 = findViewById(R.id.button_3);
        nm3.setOnClickListener(this);
        Button nm4 = findViewById(R.id.button_4);
        nm4.setOnClickListener(this);
        Button nm5 = findViewById(R.id.button_5);
        nm5.setOnClickListener(this);
        Button nm6 = findViewById(R.id.button_6);
        nm6.setOnClickListener(this);
        Button nm7 = findViewById(R.id.button_7);
        nm7.setOnClickListener(this);
        Button nm8 = findViewById(R.id.button_8);
        nm8.setOnClickListener(this);
        Button nm9 = findViewById(R.id.button_9);
        nm9.setOnClickListener(this);
        Button period = findViewById(R.id.button_period);
        period.setOnClickListener(this);
        Button plus = findViewById(R.id.button_plus);
        plus.setOnClickListener(this);
        Button minus = findViewById(R.id.button_minus);
        minus.setOnClickListener(this);
        Button multiply = findViewById(R.id.button_multiply);
        multiply.setOnClickListener(this);
        Button divide = findViewById(R.id.button_divide);
        divide.setOnClickListener(this);
        Button equal = findViewById(R.id.button_equal);
        equal.setOnClickListener(this);
        Button ac = findViewById(R.id.button_AC);
        ac.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView numberDisplay = findViewById(R.id.numberDisplay);
        String nDNumber = numberDisplay.getText().toString();
        switch (v.getId()) {
            case R.id.button_0:
                if (numberBox.equals("")) {
                } else {
                    numberBox += "0";
                    nDNumber += "0";
                    numberDisplay.setText(nDNumber);
                } break;

            case R.id.button_1:
                if (numberBox.equals("")) {
                    numberBox = "1";
                    numberDisplay.setText("1");
                } else {
                    numberBox += "1";
                    nDNumber += "1";
                    numberDisplay.setText(nDNumber);
                } break;

            case R.id.button_2:
                if (numberBox.equals("")) {
                    numberBox = "2";
                    numberDisplay.setText("2");
                } else {
                    numberBox += "2";
                    nDNumber += "2";
                    numberDisplay.setText(nDNumber);
                } break;

            case R.id.button_3:
                if (numberBox.equals("")) {
                    numberBox = "3";
                    numberDisplay.setText("3");
                } else {
                    numberBox += "3";
                    nDNumber += "3";
                    numberDisplay.setText(nDNumber);
                } break;

            case R.id.button_4:
                if (numberBox.equals("")) {
                    numberBox = "4";
                    numberDisplay.setText("4");
                } else {
                    numberBox += "4";
                    nDNumber += "4";
                    numberDisplay.setText(nDNumber);
                } break;

            case R.id.button_5:
                if (numberBox.equals("")) {
                    numberBox = "5";
                    numberDisplay.setText("5");
                } else {
                    numberBox += "5";
                    nDNumber += "5";
                    numberDisplay.setText(nDNumber);
                } break;

            case R.id.button_6:
                if (numberBox.equals("")) {
                    numberBox = "6";
                    numberDisplay.setText("6");
                } else {
                    numberBox += "6";
                    nDNumber += "6";
                    numberDisplay.setText(nDNumber);
                } break;

            case R.id.button_7:
                if (numberBox.equals("")) {
                    numberBox = "7";
                    numberDisplay.setText("7");
                } else {
                    numberBox += "7";
                    nDNumber += "7";
                    numberDisplay.setText(nDNumber);
                } break;

            case R.id.button_8:
                if (numberBox.equals("")) {
                    numberBox = "8";
                    numberDisplay.setText("8");
                } else {
                    numberBox += "8";
                    nDNumber += "8";
                    numberDisplay.setText(nDNumber);
                } break;

            case R.id.button_9:
                if (numberBox.equals("")) {
                    numberBox = "9";
                    numberDisplay.setText("9");
                } else {
                    numberBox += "9";
                    nDNumber += "9";
                    numberDisplay.setText(nDNumber);
                } break;

            case R.id.button_period:
                if (nDNumber.matches(".*\\.") || nDNumber.matches(".*\\..*")) {
                } else {
                    numberBox += ".";
                    nDNumber += ".";
                    numberDisplay.setText(nDNumber);
                }break;

            case R.id.button_plus:
                if (numberBox == ""){
                    sign = "+";
                } else {
                    switch (sign) {
                        case "":
                            calcu = Double.parseDouble(nDNumber);
                            break;
                        case "+":
                            calcu += Double.parseDouble(nDNumber);
                            break;
                        case "-":
                            calcu -= Double.parseDouble(nDNumber);
                            break;
                        case "*":
                            calcu *= Double.parseDouble(nDNumber);
                            break;
                        case "/":
                            calcu /= Double.parseDouble(nDNumber);
                            break;
                    }
                    nDNumber = BigDecimal.valueOf(calcu).toPlainString();
                    if (nDNumber.matches(".*\\.0")) {
                        inTrans = (int) calcu;
                        nDNumber = String.valueOf(inTrans);
                    }
                    numberBox = "";
                    sign = "+";
                    numberDisplay.setText(nDNumber);
                } break;

            case R.id.button_minus:
                if (numberBox == ""){
                    sign = "-";
                } else {
                    switch (sign) {
                        case "":
                            calcu = Double.parseDouble(nDNumber);
                            break;
                        case "+":
                            calcu += Double.parseDouble(nDNumber);
                            break;
                        case "-":
                            calcu -= Double.parseDouble(nDNumber);
                            break;
                        case "*":
                            calcu *= Double.parseDouble(nDNumber);
                            break;
                        case "/":
                            calcu /= Double.parseDouble(nDNumber);
                            break;
                    }
                    nDNumber = BigDecimal.valueOf(calcu).toPlainString();
                    if (nDNumber.matches(".*\\.0")) {
                        inTrans = (int) calcu;
                        nDNumber = String.valueOf(inTrans);
                    }
                    numberBox = "";
                    sign = "-";
                    numberDisplay.setText(nDNumber);
                } break;

            case R.id.button_multiply:
                if (numberBox == ""){
                    sign = "*";
                } else {
                    switch (sign) {
                        case "":
                            calcu = Double.parseDouble(nDNumber);
                            break;
                        case "+":
                            calcu += Double.parseDouble(nDNumber);
                            break;
                        case "-":
                            calcu -= Double.parseDouble(nDNumber);
                            break;
                        case "*":
                            calcu *= Double.parseDouble(nDNumber);
                            break;
                        case "/":
                            calcu /= Double.parseDouble(nDNumber);
                            break;
                    }
                    nDNumber = BigDecimal.valueOf(calcu).toPlainString();
                    if (nDNumber.matches(".*\\.0")) {
                        inTrans = (int) calcu;
                        nDNumber = String.valueOf(inTrans);
                    }
                    numberBox = "";
                    sign = "*";
                    numberDisplay.setText(nDNumber);
                } break;

            case R.id.button_divide:
                if (numberBox == ""){
                    sign = "/";
                } else {
                    switch (sign) {
                        case "":
                            calcu = Double.parseDouble(nDNumber);
                            break;
                        case "+":
                            calcu += Double.parseDouble(nDNumber);
                            break;
                        case "-":
                            calcu -= Double.parseDouble(nDNumber);
                            break;
                        case "*":
                            calcu *= Double.parseDouble(nDNumber);
                            break;
                        case "/":
                            calcu /= Double.parseDouble(nDNumber);
                            break;
                    }
                    nDNumber = BigDecimal.valueOf(calcu).toPlainString();
                    if (nDNumber.matches(".*\\.0")) {
                        inTrans = (int) calcu;
                        nDNumber = String.valueOf(inTrans);
                    }
                    numberBox = "";
                    sign = "/";
                    numberDisplay.setText(nDNumber);
                } break;

            case R.id.button_equal:
                if (numberBox == ""){
                    sign = "";
                } else {
                    switch (sign) {
                        case "":
                            calcu = Double.parseDouble(nDNumber);
                            break;
                        case "+":
                            calcu += Double.parseDouble(nDNumber);
                            break;
                        case "-":
                            calcu -= Double.parseDouble(nDNumber);
                            break;
                        case "*":
                            calcu *= Double.parseDouble(nDNumber);
                            break;
                        case "/":
                            calcu /= Double.parseDouble(nDNumber);
                            break;
                    }
                    nDNumber = BigDecimal.valueOf(calcu).toPlainString();
                    if (nDNumber.matches(".*\\.0")) {
                        inTrans = (int) calcu;
                        nDNumber = String.valueOf(inTrans);
                    }
                    numberBox = "";
                    sign = "";
                    numberDisplay.setText(nDNumber);
                } break;

            case R.id.button_AC:
                numberBox = "";
                calcu = 0;
                sign = "";
                numberDisplay.setText("0");
                break;
        }
    }
}