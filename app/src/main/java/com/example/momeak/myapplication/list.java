package com.example.momeak.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class list extends AppCompatActivity {
    private myApp myapp;
    @BindView(R.id.imageView28)
    ImageView imageView28;
    @BindView(R.id.textView34)
    TextView textView34;
    @BindView(R.id.boxs)
    LinearLayout boxs;
    private myApp myapp_city;
    private LinearLayout mLinearLayout;
    private View mGridView;
    private String[] city = {"上海", "广州", "香港", "北京"};
    private int[] image = {R.drawable.queencake, R.drawable.queencake, R.drawable.queencake, R.drawable.queencake, R.drawable.queencake, R.drawable.queencake, R.drawable.queencake, R.drawable.queencake, R.drawable.queencake, R.drawable.queencake};
    private String[] txt = {"上海迪士尼乐园", "上海东方明珠", "QueenCake", "QueenCake", "QueenCake", "QueenCake", "QueenCake", "QueenCake", "QueenCake", "QueenCake"};
    private String[] txts = {"甜主题婚礼马卡龙定制", "甜主题婚礼马卡龙定制", "甜主题婚礼马卡龙定制", "甜主题婚礼马卡龙定制", "甜主题婚礼马卡龙定制", "甜主题婚礼马卡龙定制", "甜主题婚礼马卡龙定制", "甜主题婚礼马卡龙定制", "甜主题婚礼马卡龙定制", "甜主题婚礼马卡龙定制"};
    private String[] txtsd = {"660", "660", "660", "660", "660", "660", "660", "660", "660", "660"};
    private String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);
        mLinearLayout = (LinearLayout) findViewById(R.id.boxs);
        myapp_city = (myApp) getApplication();
        for (int i = 0; i < city.length; i++) {
            if (city[i] == myapp_city.getName()) {

            }
        }
        //开始添加数据
        for ( int x = 0; x < image.length; x++) {
            View view = LayoutInflater.from(this).inflate(R.layout.grisview, mLinearLayout, false);
            ImageView img = (ImageView) view.findViewById(R.id.imageView5);
            TextView tv = (TextView) view.findViewById(R.id.textView35);
            TextView tvs = (TextView) view.findViewById(R.id.textView36);
            TextView tvsd = (TextView) view.findViewById(R.id.textView75);
            img.setImageResource(image[x]);
            tv.setText(txt[x]);
            tvs.setText(txts[x]);
            tvsd.setText(txtsd[x]);
            data=txt[x];
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Intent intents = new Intent(list.this, particulars.class);
                    myapp = (myApp) getApplication();
                    myapp.setName(data);
                    startActivity(intents);
                }
            });
            mLinearLayout.addView(view);
        }
    }


    @OnClick({R.id.imageView28})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imageView28:
               this.finish();
                break;
           

        }
    }
}