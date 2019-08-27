package com.example.surface;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * @ describe 
 * 
 * @author lzl
 *
 * @ time 2019/8/26 20:15
 * 
 * @ param
 * 
 * @ return
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MySurfaceView(this));
//        TextView textView=new TextView(this);
//        textView.setText("test");
//        textView.setTextColor(getResources().getColor(R.color.colorAccent));
//        getWindow().addContentView(textView,new WindowManager.LayoutParams(100,100));
//        getWindow().setLayout(500,500);

    }
}
