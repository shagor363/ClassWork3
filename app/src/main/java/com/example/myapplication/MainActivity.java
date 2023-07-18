package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt1;
    Button btn1,btn2,btn3,btn4,btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnSub,btnMult, btnDiv, btnEqual, btnDot, btnDel;

    float mValueOne, mValueTwo;
    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMult = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnDot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnEq);
        btnDel = findViewById(R.id.btnDel);

        edt1 = findViewById(R.id.edt1);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+ "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "4");
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "9");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + ".");
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText("");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt1 == null)
                {
                    edt1.setText("");
                }
                else
                {
                    mValueOne = Float.parseFloat(edt1.getText()+"");
                    Addition = true;
                    edt1.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(edt1.getText()+"");
                Subtract = true;
                edt1.setText(null);
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(edt1.getText()+"");
                Multiplication=true;
                edt1.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(edt1.getText()+"");
                Division = true;
                edt1.setText(null);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueTwo = Float.parseFloat(edt1.getText()+"");

                if (Addition == true)
                {
                    edt1.setText(mValueOne+mValueTwo+"");
                    Addition = false;
                }
                if (Subtract == true)
                {
                    edt1.setText(mValueOne-mValueTwo + "");
                    Subtract = false;
                }
                if (Multiplication == true)
                {
                    edt1.setText(mValueOne*mValueTwo + "");
                    Multiplication = false;
                }
                if (Division == true)
                {
                    edt1.setText(mValueOne/mValueTwo + "");
                    Division = false;
                }
            }
        });
    }
}