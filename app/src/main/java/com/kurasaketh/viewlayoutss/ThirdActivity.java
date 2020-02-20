package com.kurasaketh.viewlayoutss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
    }
    public void next(View v){
        Intent i = new Intent(getApplicationContext(), FourthActivity.class);
        Log.i("message", "moving on to fourth page");
        startActivity(i);
    }
}
