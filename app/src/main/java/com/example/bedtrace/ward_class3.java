package com.example.bedtrace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ward_class3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ward_class3);

        ImageButton imgBtnWard3CB1, imgBtnWard3CB2, imgBtnWard3CB3, imgBtnWard3CB4, imgBtnWard3CB5, imgBtnWard3CB6;

        imgBtnWard3CB1 = findViewById(R.id.imgBtn_Ward3C_Bed1);
        imgBtnWard3CB2 = findViewById(R.id.imgBtn_Ward3C_Bed2);
        imgBtnWard3CB3 = findViewById(R.id.imgBtn_Ward3C_Bed3);
        imgBtnWard3CB4 = findViewById(R.id.imgBtn_Ward3C_Bed4);
        imgBtnWard3CB5 = findViewById(R.id.imgBtn_Ward3C_Bed5);
        imgBtnWard3CB6 = findViewById(R.id.imgBtn_Ward3C_Bed6);

        imgBtnWard3CB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ward_class3.this, register_beds.class);
                startActivity(intent);
            }
        });

        imgBtnWard3CB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ward_class3.this, register_beds.class);
                startActivity(intent);
            }
        });

        imgBtnWard3CB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ward_class3.this, register_beds.class);
                startActivity(intent);
            }
        });

        imgBtnWard3CB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ward_class3.this, register_beds.class);
                startActivity(intent);
            }
        });

        imgBtnWard3CB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ward_class3.this, register_beds.class);
                startActivity(intent);
            }
        });

        imgBtnWard3CB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ward_class3.this, register_beds.class);
                startActivity(intent);
            }
        });
    }
}
