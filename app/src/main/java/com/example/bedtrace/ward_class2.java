package com.example.bedtrace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ward_class2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ward_class2);

        ImageButton imgBtnWard2BB1, imgBtnWard2BB2, imgBtnWard2BB3, imgBtnWard2BB4;

        imgBtnWard2BB1 = findViewById(R.id.imgBtn_Ward2B_Bed1);
        imgBtnWard2BB2 = findViewById(R.id.imgBtn_Ward2B_Bed2);
        imgBtnWard2BB3 = findViewById(R.id.imgBtn_Ward2B_Bed3);
        imgBtnWard2BB4 = findViewById(R.id.imgBtn_Ward2B_Bed4);

        imgBtnWard2BB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ward_class2.this, register_beds.class);
                startActivity(intent);
            }
        });

        imgBtnWard2BB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ward_class2.this, register_beds.class);
                startActivity(intent);
            }
        });

        imgBtnWard2BB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ward_class2.this, register_beds.class);
                startActivity(intent);
            }
        });

        imgBtnWard2BB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ward_class2.this, register_beds.class);
                startActivity(intent);
            }
        });
    }
}
