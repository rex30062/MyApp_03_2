package com.cclz.myapp_03_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
    public void click2(View v){
        EditText ed=(EditText) findViewById(R.id.editText);
        String str=ed.getText().toString();
        Intent it=new Intent(MainActivity.this, ThirdActivity.class);

        Bundle b=new Bundle();
        b.putString("msg", str);
        it.putExtras(b);
//        it.putExtra("msg", str);
        startActivity(it);
    }
}
