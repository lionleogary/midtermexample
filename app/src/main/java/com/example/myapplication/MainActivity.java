package com.example.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int size=40;
    TextView txv,txv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void bigger(View v){

        txv2=findViewById(R.id.textView2);
        txv2.setTextSize(++size);

    }
    public void smaller(View v){

        txv2=findViewById(R.id.textView2);
        txv2.setTextSize(--size);

    }
    public void clear(View v){
        txv=findViewById(R.id.editText2);
        txv2=findViewById(R.id.textView2);
        txv2.setText(txv.getText().toString()+(String)txv2.getText().toString());
        txv.setText("");
        txv2.setMovementMethod(new ScrollingMovementMethod());

    }
    public void changeforecolor(View v){
        txv2=findViewById(R.id.textView2);
        txv2.setTextColor(getResources().getColor(R.color.pink));
    }
    public void changebackcolor(View v){
        txv2=findViewById(R.id.textView2);
        txv2.setBackgroundColor(getResources().getColor(R.color.green));
    }

}
