package com.example.part2example1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    //gitHub token: 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
    ImageView iv;
    Switch sw;
    SeekBar sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView)findViewById(R.id.iv);
        sw = (Switch)findViewById(R.id.sw);
        sw.setOnCheckedChangeListener(this);

        sb = (SeekBar)findViewById(R.id.sb);
        sb.setOnSeekBarChangeListener(this);
        sb.setMax(100);
        sb.setProgress(100);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(compoundButton==sw){
            if(b){
                iv.setVisibility(View.VISIBLE);
            }
            else{
                iv.setVisibility(View.INVISIBLE);
            }
        }

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        if(seekBar==sb){
            float alpah = (float)i/100;
            iv.setAlpha(alpah);

        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}