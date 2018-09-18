package com.example.cfloo.flood_hw1;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import yuku.ambilwarna.AmbilWarnaDialog;


public class MainActivity extends AppCompatActivity{

    private DView dView;
    private int dColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorChange();
    }

    public void colorChange(){

        Button cButton = (Button) findViewById(R.id.colorButton);
        Button nextButton = (Button) findViewById(R.id.nextButton);

        cButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                TextView cTextView = (TextView) findViewById(R.id.colorTextView);
                int red = (int)(Math.random()*255+1);
                int blue = (int) (Math.random()*255+1);
                int green = (int)(Math.random()*255+1);

                ConstraintLayout cLayout = (ConstraintLayout) findViewById(R.id.cLayout);
                EditText cText = (EditText) findViewById(R.id.colorPlainText);
                cText.setBackgroundColor(Color.WHITE);
                cLayout.setBackgroundColor(Color.rgb(red, green, blue));
                cText.setTextColor(Color.rgb(red, green, blue));
                cTextView.setText("COLOR: " + red +"r, " + green + "g, " + blue +"b, "
                        + String.format("#%02x%02x%02x", red, green, blue));
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_two);
                draw();
            }
        });
    }

    public void draw(){
        dColor = ContextCompat.getColor(MainActivity.this, R.color.colorPrimary);
        Button clearButton = (Button) findViewById(R.id.clearButton);
        Button retButton = (Button) findViewById(R.id.retButton);
        Button colorPick = (Button) findViewById(R.id.pickerButton);
        dView = (DView) findViewById(R.id.dView);
        dView.setdColor(dColor);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        dView.init(metrics);

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dView.clear();
            }
        });

        retButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
                colorChange();
            }
        });

        colorPick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorPicker();
            }
        });
    }

    public void openColorPicker(){
        AmbilWarnaDialog colorPicker = new AmbilWarnaDialog(this, dColor, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                dColor = color;
                dView.setdColor(dColor);
            }
        });
        colorPicker.show();
    }
}
