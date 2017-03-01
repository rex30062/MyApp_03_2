package com.cclz.myapp_03_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
    public void click3(View v){
        Intent it=new Intent(MainActivity.this, FourthActivity.class);
        startActivityForResult(it, 321);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView tv5=(TextView) findViewById(R.id.textView4);
        tv5.setText(data.getStringExtra("ans"));
    }
}
