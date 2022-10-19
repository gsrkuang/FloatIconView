package com.colin.gamefloatview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    FloatIconView floatIconView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatIconView = new FloatIconView(this);
        floatIconView.setOnFloatIconViewClickListener(new FloatIconView.OnFloatIconViewClickListener() {
            @Override
            public void onItemClick() {
                Toast.makeText(MainActivity.this,"悬浮按钮被点击！!",Toast.LENGTH_SHORT).show();

            }
        });

        Button btnHide = findViewById(R.id.hide);
        btnHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                floatIconView.hide();
            }
        });
        Button btnShow = findViewById(R.id.show);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                floatIconView.show();

            }
        });
    }
}