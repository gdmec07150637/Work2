package cn.edu.gdmec.s07150637.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Work2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work2);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Work3","apk onStart,老子知道了");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Work3","apk onResume,老子知道了");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Work3","apk onPause,老子知道了");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Work3","apk onStop,老子知道了");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Work3","apk onRestart,老子知道了");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Work3","apk onDestroy,老子知道了");
    }

}
