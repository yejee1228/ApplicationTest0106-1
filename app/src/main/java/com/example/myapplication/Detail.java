package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        final Context _this = Detail.this;
        Intent intent = this.getIntent();
        String seq = intent.getExtras().getString("seq");
        Toast.makeText(_this, "넘어온 값"+seq, Toast.LENGTH_LONG).show();
    }

}
