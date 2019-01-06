package com.example.momeak.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class main extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button2, R.id.button3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button2:
                Intent intents1 = new Intent(main.this, login.class);
                startActivity(intents1);
                main.this.finish();
                break;
            case R.id.button3:
                Intent intents2 = new Intent(main.this, register.class);
                startActivity(intents2);
                main.this.finish();
                break;
        }
    }
}
