package com.example.intentandintentfilters1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    private TextView mTvName, mTvAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        mTvName=findViewById(R.id.tvName);
        mTvAge=findViewById(R.id.tvAge);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        mTvName.setText(name);
        String age=intent.getStringExtra("age");
        mTvAge.setText(age);
    }
}