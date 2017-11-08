package com.phonlab.sonyusbdebug;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enableDebug(View view){
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.sonymobile.coresettings", "com.sonymobile.coresettings.CoreSettingsMainActivity"));
        if(getPackageManager().resolveActivity(intent, 0) != null){
            startActivity(intent);
        } else {
            Toast.makeText(this, "Sorry, USB debugging is not possible at this time", Toast.LENGTH_SHORT).show();
        }
    }
}
