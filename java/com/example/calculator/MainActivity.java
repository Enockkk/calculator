package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    double temp;
    double sum;
    String i;
    String op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }

        text = (TextView) findViewById(R.id.text);

        Button btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("0");
                temp=0;
                sum=0;
            }
        });
        Button btnSum = (Button) findViewById(R.id.btnSum);
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp = Double.valueOf(text.getText().toString());
                switch (op) {
                    case "+":
                        sum = sum + temp;
                        break;
                    case "-":
                        sum = sum - temp;
                        break;
                    case "*":
                        sum = sum * temp;
                        break;
                    case "/":
                        sum = sum / temp;
                        break;
                }
                text.setText(Double.toString(sum));
            }
        });
        Button btnPlus = (Button) findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Double.valueOf(text.getText().toString());
                sum = temp + sum;
                op = "+";
                text.setText("");
            }
        });
        Button btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Double.valueOf(text.getText().toString());
                if(sum==0){
                    sum=2*temp;
                }
                sum = sum - temp;
                op = "-";
                text.setText("");
            }
        });
        Button btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Double.valueOf(text.getText().toString());
                sum = temp;
                op = "*";
                text.setText("");
            }
        });
        Button btnDivide = (Button) findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Double.valueOf(text.getText().toString());
                sum = temp;
                op = "/";
                text.setText("");
            }
        });
        Button btnPoint = (Button) findViewById(R.id.btnPoint);
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+".");
            }
        });
        Button btnSin = (Button) findViewById(R.id.btnSin);
        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Double.valueOf(text.getText().toString());
                sum = Math.sin(temp);
                text.setText(Double.toString(sum));
            }
        });
        Button btnCos = (Button) findViewById(R.id.btnCos);
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Double.valueOf(text.getText().toString());
                sum = Math.cos(temp);
                text.setText(Double.toString(sum));
            }
        });
        Button btnTan = (Button) findViewById(R.id.btnTan);
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Double.valueOf(text.getText().toString());
                sum = Math.tan(temp);
                text.setText(Double.toString(sum));
            }
        });
        Button btnBin = (Button) findViewById(R.id.btnBin);
        btnBin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Double.valueOf(text.getText().toString());
                String a = Integer.toBinaryString((int)temp);
                text.setText(a);
            }
        });
        Button btnOct = (Button) findViewById(R.id.btnOct);
        btnOct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Double.valueOf(text.getText().toString());
                String a = Integer.toOctalString((int)temp);
                text.setText(a);
            }
        });
        Button btnHex = (Button) findViewById(R.id.btnHex);
        btnHex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Double.valueOf(text.getText().toString());
                String a = Integer.toHexString((int)temp);
                text.setText(a);
            }
        });
        Button btnBin0 = (Button) findViewById(R.id.btnBin0);
        btnBin0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = text.getText().toString();
                String a = Integer.valueOf(i,2).toString();
                text.setText(a);
            }
        });
        Button btnOct0 = (Button) findViewById(R.id.btnOct0);
        btnOct0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = text.getText().toString();
                String a = Integer.valueOf(i,8).toString();
                text.setText(a);
            }
        });
        Button btnHex0 = (Button) findViewById(R.id.btnHex0);
        btnHex0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = text.getText().toString();
                String a = Integer.valueOf(i,16).toString();
                text.setText(a);
            }
        });

        Button btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
                if((text.getText().toString().equals("0"))){
                    text.setText("0");
                }
                else {
                    text.setText(text.getText()+ "0");
                }
            }
        });
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if((text.getText().toString().equals("0"))){
                   text.setText("1");
               }
               else{
                    text.setText(text.getText()+"1");
               }
            }
        });
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((text.getText().toString())=="0"){
                    text.setText("2");
                }
                else{
                    text.setText(text.getText()+"2");
                }
            }
        });
        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((text.getText().toString().equals("0"))){
                    text.setText("3");
                }
                else{
                    text.setText(text.getText()+"3");
                }
            }
        });
        Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((text.getText().toString().equals("0"))){
                    text.setText("4");
                }
                else{
                    text.setText(text.getText()+"4");
                }
            }
        });
        Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((text.getText().toString().equals("0"))){
                    text.setText("5");
                }
                else{
                    text.setText(text.getText()+"5");
                }
            }
        });
        Button btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((text.getText().toString().equals("0"))){
                    text.setText("6");
                }
                else{
                    text.setText(text.getText()+"6");
                }
            }
        });
        Button btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((text.getText().toString().equals("0"))){
                    text.setText("7");
                }
                else{
                    text.setText(text.getText()+"7");
                }
            }
        });
        Button btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((text.getText().toString().equals("0"))){
                    text.setText("8");
                }
                else{
                    text.setText(text.getText()+"8");
                }
            }
        });
        Button btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((text.getText().toString().equals("0"))){
                    text.setText("9");
                }
                else{
                    text.setText(text.getText()+"9");
                }
            }
        });
    }
}