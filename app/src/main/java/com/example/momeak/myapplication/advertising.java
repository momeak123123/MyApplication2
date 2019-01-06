package com.example.momeak.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class advertising extends AppCompatActivity implements View.OnClickListener{
    private TextView mTv;
    private Handler handler;
    private Runnable runnable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_advertising);

        initView();
        handler = new Handler();
        handler.postDelayed(runnable=new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(advertising.this,home.class);
                startActivity(intent);
                finish();

            }
        },3000);

    }

    private void initView() {
        mTv = (TextView) findViewById(R.id.tv);
        mTv.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:

                break;
            case R.id.tv:
                Intent intent=new Intent(advertising.this,home.class);
                startActivity(intent);
                finish();
                //对点击的按钮进行判断，如果点击完成则停止自动跳转（不然会跳转2次）
                if (runnable!=null){
                    handler.removeCallbacks(runnable);
                }
                break;
        }
    }
}