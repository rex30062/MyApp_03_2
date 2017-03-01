package com.cclz.myapp_03_2;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView tv;
        tv = (TextView) findViewById(R.id.textView2);

        Intent it=getIntent();
        String m=it.getStringExtra("msg");
        tv.setText(m);
    }
}
