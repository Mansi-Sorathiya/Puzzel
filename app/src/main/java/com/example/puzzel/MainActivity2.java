package com.example.puzzel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        txt=findViewById(R.id.txt);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(btn2.getText().equals(""))
                {
                    btn2.setText(""+btn1.getText());
                    btn1.setText("");
                    cal();
                }
                else if(btn4.getText().equals(""))
                {
                    btn4.setText(""+btn1.getText());
                    btn1.setText("");
                    cal();
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(btn3.getText().equals(""))
                {
                    btn3.setText(""+btn2.getText());
                    btn2.setText("");
                    cal();
                }
                else if(btn5.getText().equals(""))
                {
                    btn5.setText(""+btn2.getText());
                    btn2.setText("");
                    cal();
                }
                else if(btn1.getText().equals(""))
                {
                    btn1.setText(""+btn2.getText());
                    btn2.setText("");
                    cal();
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(btn2.getText().equals(""))
                {
                    btn2.setText(""+btn3.getText());
                    btn3.setText("");
                    cal();
                }
                else if(btn6.getText().equals(""))
                {
                    btn6.setText(""+btn3.getText());
                    btn3.setText("");
                    cal();
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(btn1.getText().equals(""))
                {
                    btn1.setText(""+btn4.getText());
                    btn4.setText("");
                    cal();
                }
                else if(btn5.getText().equals(""))
                {
                    btn5.setText(""+btn4.getText());
                    btn4.setText("");
                    cal();
                }
                else if(btn7.getText().equals(""))
                {
                    btn7.setText(""+btn4.getText());
                    btn4.setText("");
                    cal();
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(btn2.getText().equals(""))
                {
                    btn2.setText(""+btn5.getText());
                    btn5.setText("");
                    cal();
                }
                else if(btn4.getText().equals(""))
                {
                    btn4.setText(""+btn5.getText());
                    btn5.setText("");
                    cal();
                }
                else if(btn6.getText().equals(""))
                {
                    btn6.setText(""+btn5.getText());
                    btn5.setText("");
                    cal();
                }
                else if(btn8.getText().equals(""))
                {
                    btn8.setText(""+btn5.getText());
                    btn5.setText("");
                    cal();
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(btn3.getText().equals(""))
                {
                    btn3.setText(""+btn6.getText());
                    btn6.setText("");
                    cal();
                }
                else if(btn5.getText().equals(""))
                {
                    btn5.setText(""+btn6.getText());
                    btn6.setText("");
                    cal();
                }
                else if(btn9.getText().equals(""))
                {
                    btn9.setText(""+btn6.getText());
                    btn6.setText("");
                    cal();
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(btn4.getText().equals(""))
                {
                    btn4.setText(""+btn7.getText());
                    btn7.setText("");
                    cal();
                }
                else if(btn8.getText().equals(""))
                {
                    btn8.setText(""+btn7.getText());
                    btn7.setText("");
                    cal();
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(btn7.getText().equals(""))
                {
                    btn7.setText(""+btn8.getText());
                    btn8.setText("");
                    cal();
                }
                else if(btn5.getText().equals(""))
                {
                    btn5.setText(""+btn8.getText());
                    btn8.setText("");
                    cal();
                }
                else if(btn9.getText().equals(""))
                {
                    btn9.setText(""+btn8.getText());
                    btn8.setText("");
                    cal();
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                if(btn8.getText().equals(""))
                {
                    btn8.setText(""+btn9.getText());
                    btn9.setText("");
                    cal();
                }
                else if(btn6.getText().equals(""))
                {
                    btn6.setText(""+btn9.getText());
                    btn9.setText("");
                    cal();
                }
            }
        });
    }
    public void cal()
    {
        if(btn1.getText().equals("1") && btn2.getText().equals("2") && btn3.getText().equals("3") && btn4.getText().equals("4") && btn5.getText().equals("5") && btn6.getText().equals("6") && btn7.getText().equals("7") && btn8.getText().equals("8") && btn9.getText().equals(""))
        {
            txt.setText("Win");
        }
    }
}