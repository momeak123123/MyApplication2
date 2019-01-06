package com.example.momeak.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;

public class getGdMapUri extends AppCompatActivity {

    private void openGaoDeMap(double slat, double slon,double dlat, double dlon, String dname) {
        try {
            // APP_NAME  自己应用的名字
            String uri = getGdMapUri("城市指南",
                    String.valueOf(slat),
                    String.valueOf(slon),
                    String.valueOf(dlat),
                    String.valueOf(dlon),
                    dname);
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setPackage("com.autonavi.minimap");
            intent.setData(Uri.parse(uri));
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static String getGdMapUri(String appName, String slat, String slon, String dlat, String dlon, String dname){
        String newUri = "androidamap://navi?sourceApplication=%1$s&poiname=%2$s&lat=%3$s&lon=%4$s&dev=1&style=2";
        return String.format(newUri, appName, dname, dlat, dlon);
    }

}
