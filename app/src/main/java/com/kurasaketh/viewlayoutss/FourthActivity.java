package com.kurasaketh.viewlayoutss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FourthActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_layout);
    }
    public void next(View v){
        Intent i = new Intent(getApplicationContext(), FifthActivity.class);
        Log.i("message", "moving on to fifth page");
        startActivity(i);
    }
}
