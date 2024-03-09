package com.example.puzzel;

// Random Puzzle

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button b[]=new Button[9];
    Button btnreset;
    TextView txtWin;
    int count=0;
    ArrayList List=new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0;i<b.length;i++)
        {
            int id=getResources().getIdentifier("b" +i,"id",getPackageName());
            b[i]=findViewById(id);
            b[i].setOnClickListener(this);
        }
        txtWin=findViewById(R.id.txtWin);
        btnreset=findViewById(R.id.btnreset);
        btnreset.setOnClickListener(this);

        for (int i=0;i<b.length;i++)
        {
            count++;
            while (count<=8){
                int min=0,max=9;
                int r=new Random().nextInt(max-min)+min;
                System.out.println("r ="+r);
                if(List.isEmpty())
                {
                    List.add(r);
                }
                if(!List.contains(r))
                {
                    List.add(r);
                    System.out.println("R"+List);
                    break;
                }
                Log.d("TTT", "onCreate: List"+List);
            }
        }
        for(int i=0 ;i<b.length ;i++)
        {
            b[i].setText(""+List.get(i));
            if(List.get(i).equals(0))
            {
                b[i].setText("");
            }
        }
    }

    @Override
    public void onClick(View view)
    {

        if(view.getId()==b[0].getId())
        {
            if(b[1].getText().equals(""))
            {
                b[1].setText(""+b[0].getText());
                b[0].setText("");
                cal();
            } else if (b[3].getText().equals(""))
            {
                b[3].setText(""+b[0].getText());
                b[0].setText("");
                cal();
            }
        }

        if(view.getId()==b[1].getId())
        {
            if(b[2].getText().equals(""))
            {
                b[2].setText(""+b[1].getText());
                b[1].setText("");cal();
            }else if(b[0].getText().equals(""))
            {
                b[0].setText(""+b[1].getText());
                b[1].setText("");cal();
            } else if (b[4].getText().equals(""))
            {
                b[4].setText(""+b[1].getText());
                b[1].setText("");cal();
            }
        }

        if(view.getId()==b[2].getId())
        {
            if(b[1].getText().equals(""))
            {
                b[1].setText(""+b[2].getText());
                b[2].setText("");cal();
            } else if (b[5].getText().equals(""))
            {
                b[5].setText(""+b[2].getText());
                b[2].setText("");cal();
            }
        }

        if(view.getId()==b[3].getId())
        {
            if(b[0].getText().equals(""))
            {
                b[0].setText(""+b[3].getText());
                b[3].setText("");cal();
            } else if (b[4].getText().equals(""))
            {
                b[4].setText(""+b[3].getText());
                b[3].setText("");cal();
            } else if (b[6].getText().equals(""))
            {
                b[6].setText(""+b[3].getText());
                b[3].setText("");cal();
            }
        }
        if(view.getId()==b[4].getId())
        {
            if(b[1].getText().equals(""))
            {
                b[1].setText(""+b[4].getText());
                b[4].setText("");cal();
            } else if (b[3].getText().equals(""))
            {
                b[3].setText(""+b[4].getText());
                b[4].setText("");cal();
            } else if (b[5].getText().equals(""))
            {
                b[5].setText(""+b[4].getText());
                b[4].setText("");cal();
            } else if (b[7].getText().equals(""))
            {
                b[7].setText(""+b[4].getText());
                b[4].setText("");cal();
            }
        }



        if(view.getId()==b[5].getId())
        {
            if(b[2].getText().equals(""))
            {
                b[2].setText(""+b[5].getText());
                b[5].setText("");cal();
            } else if (b[4].getText().equals(""))
            {
                b[4].setText(""+b[5].getText());
                b[5].setText("");cal();
            } else if (b[8].getText().equals(""))
            {
                b[8].setText(""+b[5].getText());
                b[5].setText("");
                cal();
            }
        }

        if(view.getId()==b[6].getId())
        {
            if(b[3].getText().equals(""))
            {
                b[3].setText(""+b[6].getText());
                b[6].setText("");
                cal();
            }else if(b[7].getText().equals(""))
            {
                b[7].setText(""+b[6].getText());
                b[6].setText("");
                cal();
            }
        }

        if(view.getId()==b[7].getId())
        {
            if(b[4].getText().equals(""))
            {
                b[4].setText(""+b[7].getText());
                b[7].setText("");
                cal();
            }else if (b[6].getText().equals(""))
            {
                b[6].setText(""+b[7].getText());
                b[7].setText("");
                cal();
            } else if (b[8].getText().equals(""))
            {
                b[8].setText(""+b[7].getText());
                b[7].setText("");
                cal();
            }
        }

        if(view.getId()==b[8].getId())
        {
            if (b[5].getText().equals(""))
            {
                b[5].setText("" + b[8].getText());
                b[8].setText("");
                cal();
            } else if (b[7].getText().equals(""))
            {
                b[7].setText("" + b[8].getText());
                b[8].setText("");
                cal();
            }
        }

    }

    private void cal()
    {
        if(b[0].getText().equals("1")&&b[1].getText().equals("2") && b[2].getText().equals("3") && b[3].getText().equals("4") && b[4].getText().equals("5") && b[5].getText().equals("6") && b[6].getText().equals("7") && b[7].getText().equals("8") && b[8].getText().equals("") )
        {
            txtWin.setText("WIN");
        }
    }
}