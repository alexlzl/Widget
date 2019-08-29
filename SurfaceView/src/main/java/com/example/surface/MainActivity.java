package com.example.surface;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

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
 private Animation loadAnimation;
 private SurfaceViewSinFun surfaceView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadAnimation = AnimationUtils.loadAnimation(this,
                R.anim.al);
        loadAnimation.setFillAfter(true);
        surfaceView=findViewById(R.id.test);

//        setContentView(new SurfaceViewHandWriting(this));
//        setContentView(new SurfaceViewSinFun(this));
//        setContentView(new MySurfaceView(this));
//        TextView textView=new TextView(this);
//        textView.setText("test");
//        textView.setTextColor(getResources().getColor(R.color.colorAccent));
//        MySurfaceView mySurfaceView=new MySurfaceView(this);
//        mySurfaceView.setZOrderOnTop(false);
//        mySurfaceView.setTranslationY(100);
//        FrameLayout.LayoutParams cameraFL = new FrameLayout.LayoutParams(320, 240,Gravity.TOP); // set size
//        cameraFL.setMargins(900, 50, 0, 0);  // set position
//        mySurfaceView.setLayoutParams(cameraFL);

//getWindow().getDecorView().setBackgroundResource(R.color.colorPrimary);
//        getWindow().addContentView(mySurfaceView,cameraFL);
//        getWindow().setLayout(500,500);

    }

    public void test(View view){
      startActivity(new Intent(this,Main2Activity.class));
    }

    public void test1(View view){
        Toast.makeText(this,"test",Toast.LENGTH_SHORT).show();
        surfaceView.startAnimation(loadAnimation);
    }
}
