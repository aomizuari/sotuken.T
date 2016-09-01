package com.example.tanabe.sotukent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class sub1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub1);

        Intent intent = this.getIntent();
        String text = intent.getStringExtra("sendText");
        TextView textView = (TextView)this.findViewById(R.id.textView);
        textView.setText(text);

        String text2 = intent.getStringExtra("sendText2");
        TextView textView2 = (TextView)this.findViewById(R.id.textView2);
        textView2.setText(text2);
    }
}