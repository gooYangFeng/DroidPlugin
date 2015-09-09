package com.example.ApiTest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityTestActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_test);
        ButterKnife.bind(this);

//        findViewById(R.id.button1).setOnClickListener(this);
//        findViewById(R.id.button2).setOnClickListener(this);
//        findViewById(R.id.button3).setOnClickListener(this);
//        findViewById(R.id.button4).setOnClickListener(this);
    }

//    @Override
//    public void onClick(View v) {
//        int id = v.getId();
//        if (id == R.id.button1) {
//            startActivity(new Intent(this, StandardActivity.class));
//        } else if (id == R.id.button2) {
//            startActivity(new Intent(this, SingleTopActivity.class));
//        } else if (id == R.id.button3) {
//            startActivity(new Intent(this, SingleTaskActivity.class));
//        } else if (id == R.id.button4) {
//            startActivity(new Intent(this, SingleInstanceActivity.class));
//        }
//    }

    @OnClick(R.id.button1)
    void onStandardActivity() {
        startActivity(new Intent(this, StandardActivity.class));
    }
    @OnClick(R.id.button2)
    void onSingleTopActivity() {
        startActivity(new Intent(this, SingleTopActivity.class));
    }
    @OnClick(R.id.button3)
    void onSingleTaskActivity() {
        startActivity(new Intent(this, SingleTaskActivity.class));
    }
    @OnClick(R.id.button4)
    void onSingleInstanceActivity() {
        startActivity(new Intent(this, SingleInstanceActivity.class));
    }
}
