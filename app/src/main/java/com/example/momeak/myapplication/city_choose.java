package com.example.momeak.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class city_choose extends AppCompatActivity {
    @BindView(R.id.view3)
    View view3;
    @BindView(R.id.view6)
    View view6;
    @BindView(R.id.view7)
    View view7;
    @BindView(R.id.view8)
    View view8;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.imageView43)
    ImageView imageView43;
    @BindView(R.id.textView58)
    TextView textView58;
    @BindView(R.id.textView59)
    TextView textView59;
    @BindView(R.id.imageView44)
    ImageView imageView44;
    @BindView(R.id.imageView45)
    ImageView imageView45;
    @BindView(R.id.textView60)
    TextView textView60;
    @BindView(R.id.textView61)
    TextView textView61;
    @BindView(R.id.imageView46)
    ImageView imageView46;
    @BindView(R.id.imageView47)
    ImageView imageView47;
    @BindView(R.id.textView62)
    TextView textView62;
    @BindView(R.id.textView63)
    TextView textView63;
    @BindView(R.id.imageView48)
    ImageView imageView48;
    @BindView(R.id.textView74)
    TextView textView74;
    @BindView(R.id.imageView18)
    ImageView imageView18;
    @BindView(R.id.imageView40)
    ImageView imageView40;
    @BindView(R.id.imageView41)
    ImageView imageView41;
    @BindView(R.id.textView37)
    TextView textView37;
    @BindView(R.id.viewpager)
    ViewPager mViewpager;
    private ViewPager viewPager;
    private int[] arr = {R.drawable.shanghai, R.drawable.guangzhou, R.drawable.xianggang, R.drawable.beijing};
    private String[] txt = {"上海", "广州", "香港", "北京"};
    private int currIndex = -1;
    private myApp myapp_city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_city_choose);
        ButterKnife.bind(this);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setPageTransformer(true, new GalleyTransFormer());
        viewPager.setOffscreenPageLimit(4);
        viewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return arr.length;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView((View) object);
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                ImageView imageView = new ImageView(getBaseContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setImageResource(arr[position]);
                container.addView(imageView);
                return imageView;
            }
        });
        viewPager.setCurrentItem(0);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageSelected(int arg0) {
                Animation anim = null;
                switch (arg0) {
                    case 0:
                        textView74.setText(txt[0]);
                        if (currIndex == (arg0 + 1)) {
                            anim = new TranslateAnimation(arg0 + 1, arg0, 0, 0);
                        }
                        break;
                    case 1:
                        textView74.setText(txt[1]);
                        if (arg0 == (currIndex + 1)) {
                            anim = new TranslateAnimation(arg0 - 1, arg0, 0, 0);
                        } else if (arg0 == (currIndex - 1)) {
                            anim = new TranslateAnimation(arg0 + 1, arg0, 0, 0);
                        }
                        break;
                    case 2:
                        textView74.setText(txt[2]);
                        if (arg0 == (currIndex + 1)) {
                            anim = new TranslateAnimation(arg0 - 1, arg0, 0, 0);
                        } else if (arg0 == (currIndex - 1)) {
                            anim = new TranslateAnimation(arg0 + 1, arg0, 0, 0);
                        }
                        break;
                    case 3:
                        textView74.setText(txt[3]);
                        if (arg0 == (currIndex + 1)) {
                            anim = new TranslateAnimation(arg0 - 1, arg0, 0, 0);
                        } else if (arg0 == (currIndex - 1)) {
                            anim = new TranslateAnimation(arg0 + 1, arg0, 0, 0);
                        }
                        break;
                    case 4:
                        textView74.setText(txt[4]);
                        if (arg0 == (currIndex + 1)) {
                            anim = new TranslateAnimation(arg0 - 1, arg0, 0, 0);
                        } else if (arg0 == (currIndex - 1)) {
                            anim = new TranslateAnimation(arg0 + 1, arg0, 0, 0);
                        }
                        break;
                    case 5:
                        textView74.setText(txt[5]);
                        if (arg0 == (currIndex + 1)) {
                            anim = new TranslateAnimation(arg0 - 1, arg0, 0, 0);
                        }
                        break;
                    default:
                        break;
                }
                currIndex = arg0;

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });
    }

    @OnClick({R.id.imageView41, R.id.button})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imageView41:
                this.finish();
                break;
            case R.id.button:
                Intent intents = new Intent(city_choose.this, home.class);
                myapp_city = (myApp) getApplication();
                myapp_city.setName(textView74.getText().toString());
                startActivity(intents);
                break;
        }
    }
}
