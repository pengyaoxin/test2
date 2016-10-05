package cn.edu.gdmec.s07150738.test2;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.d(TAG,"onStart() called with:"+"我要开始了");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG,"onResume() called with:"+"我要显示了");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG,"onPause() called with:"+"我失去焦点了");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG,"onStop() called with:"+"有人挡在我前面了");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG,"onDestroy() called with:"+"我要挂了");
        super.onDestroy();
    }
}
