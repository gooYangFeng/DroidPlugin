package com.example.ApiTest;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyActivity extends Activity implements OnClickListener {


    private static final String TAG = "MyActivity";
    private static final String PACKAGE_MIME_TYPE = "application/vnd.android.package-archive";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ButterKnife.bind(this);

//        findViewById(R.id.button1).setOnClickListener(this);
//        findViewById(R.id.button2).setOnClickListener(this);
//        findViewById(R.id.button3).setOnClickListener(this);
//        findViewById(R.id.button4).setOnClickListener(this);
//        findViewById(R.id.button5).setOnClickListener(this);
//        findViewById(R.id.button6).setOnClickListener(this);
//        findViewById(R.id.button7).setOnClickListener(this);
//        findViewById(R.id.button8).setOnClickListener(this);
//        findViewById(R.id.button9).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.button1) {
            startActivity(new Intent(this, ServiceTest1.class));
        } else if (id == R.id.button2) {
            startActivity(new Intent(this, ContentProviderTest.class));
        } else if (id == R.id.button3) {
            startActivity(new Intent(this, BroadcastReceiverTest.class));
        } else if (id == R.id.button4) {
            Toast.makeText(this, "哈哈Tost成功显示", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.button5) {
            startActivity(new Intent(this, NotificationTest.class));
        } else if (id == R.id.button6) {
            startActivity(new Intent(this, ServiceTest2.class));
        } else if (id == R.id.button7) {
            startActivity(new Intent(this, ContentProviderTest2.class));
        } else if (id == R.id.button8) {
            try {
                PackageManager pm = getPackageManager();
                List<PackageInfo> infos = pm.getInstalledPackages(0);
                if (infos != null && infos.size() > 0) {
                    Log.e(TAG, "infos.size=" + infos.size());
                    for (PackageInfo info : infos) {
                        Log.e(TAG, "info.pkg=" + info.applicationInfo.loadLabel(pm) + ",pkg:" + info.packageName);
                    }
                }
            } catch (Exception e) {
                Log.e(TAG, "e", e);
            }
        } else if (id == R.id.button9) {
            startActivity(new Intent(this,ActivityTestActivity.class));
        }

    }
    @OnClick(R.id.button1)
    void onServiceTest() {
        startActivity(new Intent(this, ServiceTest1.class));
    }
    @OnClick(R.id.button2)
    void onProviderTest() {
        startActivity(new Intent(this, ContentProviderTest.class));
    }
    @OnClick(R.id.button3)
    void onBroadcastTest() {
        startActivity(new Intent(this, BroadcastReceiverTest.class));
    }
    @OnClick(R.id.button4)
    void onToastTest() {
        Toast.makeText(this, "哈哈Tost成功显示", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.button5)
    void onNotificationTest() {
        startActivity(new Intent(this, NotificationTest.class));
    }
    @OnClick(R.id.button6)
    void onServicePlusTest() {
        startActivity(new Intent(this, ServiceTest2.class));
    }
    @OnClick(R.id.button7)
    void onProviderPlusTest() {
        startActivity(new Intent(this, ContentProviderTest2.class));
    }
    @OnClick(R.id.button8)
    void onPackageScanTest() {
        try {
            PackageManager pm = getPackageManager();
            List<PackageInfo> infos = pm.getInstalledPackages(0);
            if (infos != null && infos.size() > 0) {
                Log.e(TAG, "infos.size=" + infos.size());
                for (PackageInfo info : infos) {
                    Log.e(TAG, "info.pkg=" + info.applicationInfo.loadLabel(pm) + ",pkg:" + info.packageName);
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "e", e);
        }
    }

    @OnClick(R.id.button9)
    void onActivityTest() {
        startActivity(new Intent(this, ActivityTestActivity.class));
    }
}
