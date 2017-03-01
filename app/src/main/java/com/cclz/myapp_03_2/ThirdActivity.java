package com.cclz.myapp_03_2;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView tv;
        tv = (TextView) findViewById(R.id.textView2);

        Intent it=getIntent();
        Bundle b=it.getExtras();
        String m = b.getString("msg");
//        String m=it.getStringExtra("msg");
        tv.setText(m);
    }
//    public void click1(View v){
//        EditText ed=(EditText) findViewById(R.id.editText);
//        String str=ed.getText().toString();
//        Intent it=new Intent(ThirdActivity.this, MainActivity.class);
//
//        Bundle b=new Bundle();
//        b.putString("msg", str);
//        it.putExtras(b);
//        it.putExtra("msg", str);
//        startActivity(it);
//    }
}
