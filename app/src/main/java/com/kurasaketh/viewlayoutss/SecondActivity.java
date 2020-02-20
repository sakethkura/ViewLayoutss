package com.kurasaketh.viewlayoutss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
    }
    public void next(View v){
        Intent i = new Intent(getApplicationContext(), ThirdActivity.class);
        Log.i("message", "moving on to third page");
        startActivity(i);
    }
}
