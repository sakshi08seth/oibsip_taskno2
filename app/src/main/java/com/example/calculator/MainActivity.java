package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    TextView dzero,zero,dot,equals,one,two,three,addition,four,five,six,minus,seven,eight,nine,multiply,blank1,ac,blank2,division,inputtext,outputtext;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        dzero=findViewById(R.id.dzero);
        zero=findViewById(R.id.zero);
        dot=findViewById(R.id.dot);
        equals=findViewById(R.id.equals);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        addition=findViewById(R.id.addition);
        minus=findViewById(R.id.minus);
        multiply=findViewById(R.id.multiply);
        division=findViewById(R.id.divide);
        blank1=findViewById(R.id.blank);
        ac=findViewById(R.id.ac);
        blank2=findViewById(R.id.blank2);
        inputtext=findViewById(R.id.inputtext);
        outputtext=findViewById(R.id.outputtext);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"9");
            }
        });
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"+");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"-");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"×");
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"%");
            }
        });
        dzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"00");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+".");
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputtext.setText("");
                outputtext.setText("");
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                data=data.replaceAll("×","*");
                data=data.replaceAll("%","/");
                Context rhino=Context.enter();
                rhino.setOptimizationLevel(-1);
                String finalresult="";
                Scriptable scriptable=rhino.initStandardObjects();
                finalresult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
                outputtext.setText(finalresult);
            }
        });


    }
}