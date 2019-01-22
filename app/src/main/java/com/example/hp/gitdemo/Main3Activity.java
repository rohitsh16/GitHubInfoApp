package com.example.hp.gitdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    Button button1;public static TextView textView,textView1,textView2,textView3,textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button1=(Button)findViewById(R.id.button2);
         textView=(TextView)findViewById(R.id.textView);
        textView1=(TextView)findViewById(R.id.textView2);
        textView2=(TextView)findViewById(R.id.textView3);
        textView3=(TextView)findViewById(R.id.textView4);
        textView4=(TextView)findViewById(R.id.textView5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity2();
            }
        });
    }
    public void startActivity2(){
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
