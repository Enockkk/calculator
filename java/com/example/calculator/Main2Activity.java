package com.example.calculator;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Stack;

public class Main2Activity extends AppCompatActivity {
    TextView text;
    double sum = 0;
    String temp = null;
    String reValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text = (TextView) findViewById(R.id.text);
        text.setText("");

        Button btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("0");
            }
        });
        Button btnSum = (Button) findViewById(R.id.btnSum);
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = text.getText().toString();
                reValue = Recount(temp);
                text.setText(AddStacks(reValue));
            }
        });
        Button btnPlus = (Button) findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText() + "+");
            }
        });
        Button btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText() + "-");
            }
        });
        Button btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText() + "*");
            }
        });
        Button btnDivide = (Button) findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText() + "/");
            }
        });
        Button btnleft = (Button) findViewById(R.id.btnleft);
        btnleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText() + "(");
            }
        });
        Button btnright = (Button) findViewById(R.id.btnright);
        btnright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText() + ")");
            }
        });
        Button btnPoint = (Button) findViewById(R.id.btnPoint);
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText() + ".");
            }
        });
        Button btnHelp = (Button)findViewById(R.id.btnHelp);
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
                dialog.setTitle("帮助");
                dialog.setMessage("这是个帮助");
                dialog.setCancelable(false);
                dialog.setPositiveButton("true", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();
            }
        });
        Button btnm = (Button) findViewById(R.id.btnm);
        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = text.getText().toString();
                sum = Double.valueOf(temp)/1000;
                text.setText(Double.toString(sum));
            }
        });
        Button btn33 = (Button) findViewById(R.id.btn33);
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp =temp = text.getText().toString();
                sum = Double.valueOf(temp)/1000000;
                text.setText(Double.toString(sum));
            }
        });


        Button btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((text.getText().toString().equals("0"))) {
                    text.setText("0");
                } else {
                    text.setText(text.getText() + "0");
                }
            }
        });
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((text.getText().toString().equals("0"))) {
                    text.setText("1");
                } else {
                    text.setText(text.getText() + "1");
                }
            }
        });
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((text.getText().toString()) == "0") {
                    text.setText("2");
                } else {
                    text.setText(text.getText() + "2");
                }
            }
        });
        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((text.getText().toString().equals("0"))) {
                    text.setText("3");
                } else {
                    text.setText(text.getText() + "3");
                }
            }
        });
        Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((text.getText().toString().equals("0"))) {
                    text.setText("4");
                } else {
                    text.setText(text.getText() + "4");
                }
            }
        });
        Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((text.getText().toString().equals("0"))) {
                    text.setText("5");
                } else {
                    text.setText(text.getText() + "5");
                }
            }
        });
        Button btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((text.getText().toString().equals("0"))) {
                    text.setText("6");
                } else {
                    text.setText(text.getText() + "6");
                }
            }
        });
        Button btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((text.getText().toString().equals("0"))) {
                    text.setText("7");
                } else {
                    text.setText(text.getText() + "7");
                }
            }
        });
        Button btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((text.getText().toString().equals("0"))) {
                    text.setText("8");
                } else {
                    text.setText(text.getText() + "8");
                }
            }
        });
        Button btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((text.getText().toString().equals("0"))) {
                    text.setText("9");
                } else {
                    text.setText(text.getText() + "9");
                }
            }
        });
    }

//计算器
    private Stack<Character> charStack = new Stack<Character>();
    private Stack<Double> doubStack = new Stack<Double>();

    public String Recount(String value) {
        char ch = 0;
        String reValue = "", newStr = "";
        int length = 0, index = 0, count = 0, i = 0;
        length = value.length();
        while (i < length) {
            ch = value.charAt(i);
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
            }
            if (ch >= '0' && ch <= '9') {
                newStr += ch;
            } else {
                if (count >= 0)
                    newStr += ch;
            }
            ++i;
        }
        while (count > 0) {
            newStr += ")";
            count--;
        }
        length = newStr.length();
        while (index != length) {
            ch = newStr.charAt(index);
            if (ch >= '0' && ch <= '9') {
                if (index > 0)
                    if (newStr.charAt(index - 1) == ')')
                        reValue += "*";
                reValue += ch;
                if (index < length - 1) {
                    if (newStr.charAt(index + 1) == '(')
                        reValue += "*";
                }
            } else {
                if (index > 0)
                    if (ch == '(' && newStr.charAt(index - 1) == ')')
                        reValue += "*";
                if (index == 0 && ch == '-')
                    reValue += "0";
                switch (ch) {
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                    case '(':
                    case ')':
                    case '.':
                    case '^':
                        reValue += ch;
                        break;
                }
            }
            ++index;
        }
        if (reValue.charAt(0) == '-') {
            reValue = "0" + reValue;
        }
        return (reValue + "=");
    }

    private int isSwitch(char ch) {
        int number = 0;
        switch (ch) {
            case '+':
                number = 0;
                break;
            case '-':
                number = 1;
                break;
            case '*':
                number = 2;
                break;
            case '/':
                number = 3;
                break;
            case '(':
                number = 4;
                break;
            case ')':
                number = 5;
                break;
            case '^':
                number = 6;
                break;
            case '=':
                number = 7;
                break;
        }
        return number;
    }

    private char Judge(char One, char Two) {

        char[][] menu = {
                {'>', '>', '<', '<', '<', '>', '<', '>'},
                {'>', '>', '<', '<', '<', '>', '<', '>'},
                {'>', '>', '>', '>', '<', '>', '<', '>'},
                {'>', '>', '>', '>', '<', '>', '<', '>'},
                {'<', '<', '<', '<', '<', 'K', '<', 'E'},
                {'<', '<', '<', '<', '<', '<', '<', 'E'},
                {'>', '>', '>', '>', '<', '>', '>', '>'},
                {'<', '<', '<', '<', '<', '<', '<', '='},};
        int x = 0, y = 0;
        x = isSwitch(One);
        y = isSwitch(Two);
        return menu[x][y];
    }


    private String AddStacks(String reValue) {
        char nowaday = 0, nextPop = 0, ch = 0;
        int length = reValue.length();
        double number = 0, temp = 0, decimal = 1, result = 0, One = 0, Two = 0;
        boolean flag = false, sflag = false, dflag = false, nflag = false, reckon;
        charStack.push('=');
        int index = 0;
        while (index < length) {
            ch = reValue.charAt(index);
            while (ch >= '0' && ch <= '9' || ch == '.') {
                if (ch != '.') {
                    number = Double.parseDouble(String.valueOf(ch));
                    temp = (temp * 10) + number;
                    flag = true;
                    if (dflag)
                        decimal *= 10;
                } else
                    dflag = true;
                index++;
                ch = reValue.charAt(index);
            }

            reckon = true;
            if (flag == true) {
                if (nflag || sflag) {
                    if (nflag)
                        nflag = false;
                    temp = -temp;
                }
                // 小数点
                if (dflag) {
                    temp /= decimal;
                    dflag = false;
                    decimal = 1;
                }
                doubStack.push(temp);
                temp = 0;
                flag = false;
            }
            if (sflag && ch == ')')
                sflag = false;
            if (ch == '-') {
                char chs = reValue.charAt(index - 1);
                char chn = reValue.charAt(index + 1);
                if (chs == '+' || chs == '-' || chs == '*' || chs == '/'
                        || chs == '(') {

                    if (chn == '(')
                        sflag = true;
                    else
                        nflag = true;
                    reckon = false;
                }
            }
            while (reckon) {
                nowaday = reValue.charAt(index);
                nextPop = charStack.pop();
                switch (Judge(nextPop, nowaday)) {
                    case '>':
                        try {
                            Two = doubStack.pop();
                            One = doubStack.pop();
                        } catch (Exception e) {
                            return "ERROR";
                        }
                        switch (nextPop) {
                            case '+':
                                result = One + Two;
                                break;
                            case '-':
                                result = One - Two;
                                break;
                            case '*':
                                result = One * Two;
                                break;
                            case '/':
                                result = One / Two;
                                break;
                            case '^':
                                result = Math.pow(One, Two);
                                break;
                        }
                        doubStack.push(result);
                        break;
                    case '<':
                        charStack.push(nextPop);
                        charStack.push(nowaday);
                        reckon = false;
                        break;
                    case '=':
                        return (reValue + String.format("%g", doubStack.pop()));
                    case 'K':
                        ++index;
                        break;
                    case 'E':
                        return ("ERROR");
                }
            }
            ++index;
        }
        return null;
    }
}