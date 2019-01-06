package com.example.momeak.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class particulars extends AppCompatActivity {
    private myApp myapp;
    private Button but;
    private TextView text;
    private ImageView ima;
    private ImageView imas;
    private View view;
    @BindView(R.id.imageView49)
    ImageView imageView49;
    @BindView(R.id.textView64)
    TextView textView64;
    @BindView(R.id.boxs2)
    LinearLayout boxs2;
    public String phones;
    public int sum;
    private LinearLayout mLinearLayout;
    private View mGridView;
    private View mGridView1;
    private int[] image = {R.drawable.queencake, R.drawable.couture};
    private String[] txt = {"QueenCake", "Couture"};
    private String[] txts = {"甜主题婚礼马卡龙定制", "蒂娜·卡尔顿法式下午茶"};
    private String[] xing = {"4星", "5星"};
    private String[] price = {"660", "580"};
    private String[] site = {"圆明园路169号协进大楼6-7楼", "仲昂山路16号6-7楼"};
    private String[] phone = {"15913420136", "15362141841"};
    private String[] introduces = {"该店的招牌菜式有“若风草莓，甜蜜黑珍珠”等值得您到店一试；QueenCake 甜主厨婚礼马卡龙定制", "该店的招牌菜式有“菜品”等值得您到店一试；Couture 蒂娜·卡尔顿法式下午茶"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_particulars);
        ButterKnife.bind(this);
        inintent();
        but = findViewById(R.id.button4);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ima = findViewById(R.id.imageView51);
        ima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imas = findViewById(R.id.imageView56);
        imas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phones));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        view = findViewById(R.id.view10);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        text = findViewById(R.id.textView70);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void inintent() {
        mLinearLayout = (LinearLayout) findViewById(R.id.boxs2);
        myapp = (myApp) getApplication();
        for (int i = 0; i < txt.length; i++) {
            if (txt[i] == myapp.getName()) {
                sum = i;
            }
        }
        View view = LayoutInflater.from(this).inflate(R.layout.particulars, mLinearLayout, false);
        ImageView img = (ImageView) view.findViewById(R.id.imageView50);
        TextView tv = (TextView) view.findViewById(R.id.textView65);
        TextView tvs = (TextView) view.findViewById(R.id.textView66);
        TextView tvse = (TextView) view.findViewById(R.id.textView67);
        TextView tvsed = (TextView) view.findViewById(R.id.textView68);
        TextView tvseds = (TextView) view.findViewById(R.id.textView70);
        TextView tva = (TextView) view.findViewById(R.id.textView73);
        tva.setText(introduces[sum]);
        img.setImageResource(image[sum]);
        tv.setText(txt[sum]);
        tvs.setText(txts[sum]);
        tvse.setText(xing[sum]);
        tvsed.setText(price[sum]);
        tvseds.setText(site[sum]);
        phones = phone[sum];
        mLinearLayout.addView(view);
    }

    @OnClick({R.id.imageView49})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imageView49:
                this.finish();
                break;

        }
    }
}
