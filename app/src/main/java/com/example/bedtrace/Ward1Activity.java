package com.example.bedtrace;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Ward1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ward_1);

        ImageButton imgBtnWard1AB1, imgBtnWard1AB2;
        FloatingActionButton fBtnHome;

        imgBtnWard1AB1 = findViewById(R.id.imgBtn_Ward1A_Bed1);
        imgBtnWard1AB2 = findViewById(R.id.imgBtn_Ward1A_Bed2);
        fBtnHome = findViewById(R.id.fb_home);

        imgBtnWard1AB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ward1Activity.this, AssignBedActivity.class);
                startActivity(intent);
            }
        });

        imgBtnWard1AB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ward1Activity.this, AssignBedActivity.class);
                startActivity(intent);
            }
        });

        fBtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ward1Activity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
