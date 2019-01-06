package com.example.momeak.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class login extends AppCompatActivity {


    @BindView(R.id.buttonlogin)
    Button buttonlogin;
    @BindView(R.id.view2)
    View view2;
    @BindView(R.id.view4)
    View view4;
    @BindView(R.id.imageView37)
    ImageView imageView37;
    @BindView(R.id.textView53)
    TextView textView53;
    @BindView(R.id.imageView36)
    ImageView imageView36;
    @BindView(R.id.textView51)
    TextView textView51;
    @BindView(R.id.textView55)
    TextView textView55;
    @BindView(R.id.editText)
    EditText editText;
    @BindView(R.id.editText6)
    EditText editText6;
    @BindView(R.id.returns)
    ImageView returns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.buttonlogin, R.id.returns})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.buttonlogin:
                myApp appState = ((myApp) getApplicationContext());
                appState.setNames(editText.getText().toString());
                myApp appStated = ((myApp) getApplicationContext());
                appStated.setNamesd(editText6.getText().toString());
                Intent intents1 = new Intent(login.this, home.class);
                startActivity(intents1);
                login.this.finish();
                break;
            case R.id.returns:
                this.finish();
                break;
        }
    }
}
