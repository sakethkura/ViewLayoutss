package com.kurasaketh.viewlayoutss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SixthActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth_layout);
    }
    public void next(View v){
        Intent i = new Intent(getApplicationContext(), SeventhActivity.class);
        startActivity(i);
    }
}
