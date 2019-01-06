package com.example.momeak.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class my extends AppCompatActivity {

    @BindView(R.id.view9)
    View view9;
    @BindView(R.id.textView77)
    TextView textView77;
    @BindView(R.id.textView78)
    TextView textView78;
    @BindView(R.id.view12)
    View view12;
    @BindView(R.id.view11)
    View view11;
    @BindView(R.id.view13)
    View view13;
    @BindView(R.id.imageView12)
    ImageView imageView12;
    @BindView(R.id.textView80)
    TextView textView80;
    @BindView(R.id.imageView13)
    ImageView imageView13;
    @BindView(R.id.view14)
    View view14;
    @BindView(R.id.imageView3)
    ImageView imageView3;
    @BindView(R.id.textView79)
    TextView textView79;
    @BindView(R.id.imageView11)
    ImageView imageView11;
    @BindView(R.id.imageView14)
    ImageView imageView14;
    @BindView(R.id.textView81)
    TextView textView81;
    @BindView(R.id.imageView17)
    ImageView imageView17;
    @BindView(R.id.roundedImageView)
    RoundedImageView roundedImageView;
    @BindView(R.id.imageView57)
    ImageView imageView57;
    @BindView(R.id.textView83)
    TextView textView83;
    @BindView(R.id.imageView58)
    ImageView imageView58;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_my);
        ButterKnife.bind(this);
        myApp appState = ((myApp) getApplicationContext());
        textView77.setText(appState.getNames());
        myApp appStates = ((myApp) getApplicationContext());
        textView78.setText(appStates.getNamesd());
    }


}
