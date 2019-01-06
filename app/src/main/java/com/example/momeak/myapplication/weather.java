package com.example.momeak.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.icheny.transition.ElementTransition;

public class weather extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_weather);
        ButterKnife.bind(this);
        ElementTransition.runEnterAnim(weather.this);
    }

    @OnClick(R.id.imageView16)
    public void onViewClicked() {
        this.finish();
    }
}