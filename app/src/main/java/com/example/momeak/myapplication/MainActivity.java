package com.example.momeak.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.icheny.transition.ElementTransition;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.textView3)
    TextView textView3;
    @BindView(R.id.imageView4)
    ImageView imageView4;
    @BindView(R.id.weathers)
    ImageView weathers;
    @BindView(R.id.textView4)
    TextView textView4;
    @BindView(R.id.textView5)
    TextView textView5;
    @BindView(R.id.textView6)
    TextView textView6;
    @BindView(R.id.textView7)
    TextView textView7;
    @BindView(R.id.textView8)
    TextView textView8;
    @BindView(R.id.imageView6)
    ImageView imageView6;
    @BindView(R.id.imageView7)
    ImageView imageView7;
    @BindView(R.id.imageView8)
    ImageView imageView8;
    @BindView(R.id.textView9)
    TextView textView9;
    @BindView(R.id.imageView9)
    ImageView imageView9;
    @BindView(R.id.imageView10)
    ImageView imageView10;
    @BindView(R.id.textView12)
    TextView textView12;
    @BindView(R.id.textView10)
    TextView textView10;
    @BindView(R.id.textView13)
    TextView textView13;
    @BindView(R.id.textView11)
    TextView textView11;
    @BindView(R.id.textView29)
    TextView textView29;
    private String[] txt = {"上海", "广州", "香港", "北京"};
    final myApp app = (myApp) getApplication();
    private myApp myapp;
    private myApp myapp_city;
    private int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        myapp_city = (myApp) getApplication();
        for (int i = 0; i < txt.length; i++) {
            if (txt[i] == myapp_city.getName()) {
                sum = i;
                Toast.makeText(MainActivity.this, myapp_city.getName(), Toast.LENGTH_SHORT).show();
            }
        }
        textView2.setText(txt[sum]);
        Slide slide = new Slide();
        slide.setDuration(1000);
        getWindow().setExitTransition(slide);
    }

    @OnClick({R.id.imageView8, R.id.imageView7, R.id.imageView6, R.id.weathers, R.id.textView4, R.id.textView29, R.id.textView5, R.id.textView6, R.id.textView2, R.id.textView3, R.id.imageView9, R.id.imageView10})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imageView8:
                imageView7.setImageDrawable(getResources().getDrawable(R.drawable.label2));
                imageView6.setImageDrawable(getResources().getDrawable(R.drawable.label1));
                imageView8.setImageDrawable(getResources().getDrawable(R.drawable.label03));
                imageView9.setImageDrawable(getResources().getDrawable(R.drawable.homelike));
                imageView10.setImageDrawable(getResources().getDrawable(R.drawable.jhouse));
                textView10.setText("Homelike");
                textView11.setText("一流的品质和管家服务");
                textView12.setText("Jhouse民宿");
                textView13.setText("为您提供家的温暖和舒适");
                break;
            case R.id.imageView7:
                imageView6.setImageDrawable(getResources().getDrawable(R.drawable.label1));
                imageView8.setImageDrawable(getResources().getDrawable(R.drawable.label3));
                imageView7.setImageDrawable(getResources().getDrawable(R.drawable.label02));
                imageView9.setImageDrawable(getResources().getDrawable(R.drawable.amusement_park));
                imageView10.setImageDrawable(getResources().getDrawable(R.drawable.ar_spa));
                textView10.setText("缤纷游乐园");
                textView11.setText("活力星期天，缤纷游乐园");
                textView12.setText("艾瑞 SPA");
                textView13.setText("体验来自意大利的神秘");
                break;
            case R.id.imageView6:
                imageView7.setImageDrawable(getResources().getDrawable(R.drawable.label2));
                imageView8.setImageDrawable(getResources().getDrawable(R.drawable.label3));
                imageView6.setImageDrawable(getResources().getDrawable(R.drawable.label01));
                imageView9.setImageDrawable(getResources().getDrawable(R.drawable.queencake));
                imageView10.setImageDrawable(getResources().getDrawable(R.drawable.couture));
                textView10.setText("QueeCake");
                textView11.setText("甜主厨婚礼马卡龙定制");
                textView12.setText("Couture");
                textView13.setText("蒂哪·卡顿尔法式下午茶");
                break;
            case R.id.weathers:
            case R.id.textView4:
                Intent intents = new Intent(MainActivity.this, weather.class);
                ElementTransition.startActivity(intents, MainActivity.this,weathers);
                break;
            case R.id.textView29:
            case R.id.textView5:
            case R.id.textView6:
                Intent intents3 = new Intent(MainActivity.this, list.class);
                myapp_city = (myApp) getApplication();
                myapp_city.setName(textView2.getText().toString());
                startActivity(intents3);
                break;
            case R.id.textView2:
            case R.id.textView3:
                Intent intents5 = new Intent(MainActivity.this, city_choose.class);
                startActivity(intents5);
                break;
            case R.id.imageView9:
                Intent intents6 = new Intent(MainActivity.this, particulars.class);
                myapp = (myApp) getApplication();
                myapp.setName(textView10.getText().toString());
                startActivity(intents6);
                break;
            case R.id.imageView10:
                Intent intents7 = new Intent(MainActivity.this, particulars.class);
                myapp = (myApp) getApplication();
                myapp.setName(textView12.getText().toString());
                startActivity(intents7);
                break;

        }
    }
}