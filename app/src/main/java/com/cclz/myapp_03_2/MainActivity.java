package com.cclz.myapp_03_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v){
        Intent it=new Intent();
        it.setAction("myaction.a123.b456"); // 呼叫以前(別隻App)的隱性 filter
        startActivity(it);
    }
}
