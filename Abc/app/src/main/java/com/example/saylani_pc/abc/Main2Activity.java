package com.example.saylani_pc.abc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {
public static final String a="title";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public  void abc(View v){
        Intent i = new Intent(this,MainActivity.class);
        i.putExtra("he1l2loed","world");

    }
}
