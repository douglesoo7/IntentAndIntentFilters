package com.example.intentandintentfilters1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEtFirstName, mEtLastName, mEtAge;
    private Button mBtnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewsAndListeners();
    }

    private void initViewsAndListeners() {
        mEtFirstName=findViewById(R.id.etFirstName);
        mEtLastName=findViewById(R.id.etLastName);
        mEtAge=findViewById(R.id.etAge);
        mBtnNext=findViewById(R.id.btnNext);
        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                String name=mEtFirstName.getText().toString()+" "+mEtLastName.getText().toString();
                intent.putExtra("name",name);
                intent.putExtra("age",mEtAge.getText().toString());
                startActivity(intent);
            }
        });
    }
}