package com.example.mrgscafeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sign_in_button:
                Intent intent = new Intent(this, main_menu.class);
                startActivity(intent);
                break;
        }
    }
}