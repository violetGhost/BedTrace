package com.example.bedtrace;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Ward3Activity extends AppCompatActivity {

    ImageButton imgBtnWard3CB1, imgBtnWard3CB2, imgBtnWard3CB3, imgBtnWard3CB4, imgBtnWard3CB5, imgBtnWard3CB6;
    FloatingActionButton fBtnHome;
    TextView tvWardName, tvBedNo17, tvBedNo18, tvBedNo19, tvBedNo20, tvBedNo21, tvBedNo22;
    String wardName, bedNo17, bedNo18, bedNo19, bedNo20, bedNo21, bedNo22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ward_3);

        imgBtnWard3CB1 = findViewById(R.id.imgBtn_Ward3C_Bed1);
        imgBtnWard3CB2 = findViewById(R.id.imgBtn_Ward3C_Bed2);
        imgBtnWard3CB3 = findViewById(R.id.imgBtn_Ward3C_Bed3);
        imgBtnWard3CB4 = findViewById(R.id.imgBtn_Ward3C_Bed4);
        imgBtnWard3CB5 = findViewById(R.id.imgBtn_Ward3C_Bed5);
        imgBtnWard3CB6 = findViewById(R.id.imgBtn_Ward3C_Bed6);
        fBtnHome = findViewById(R.id.fb_home);
        tvWardName = findViewById(R. id. textView9);
        tvBedNo17 = findViewById(R. id. textView17);
        tvBedNo18 = findViewById(R. id. textView18);
        tvBedNo19 = findViewById(R. id. textView19);
        tvBedNo20 = findViewById(R. id. textView20);
        tvBedNo21 = findViewById(R. id. textView21);
        tvBedNo22 = findViewById(R. id. textView22);

        //action for button ward 3CB1
        imgBtnWard3CB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wardName = tvWardName.getText().toString();
                bedNo17 = tvBedNo17.getText().toString();

                Toast.makeText(Ward3Activity.this,wardName,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Ward3Activity.this, AssignBedActivity.class);
                intent.putExtra("wardName", wardName);
                intent.putExtra("bedNo", bedNo17);
                startActivity(intent);

            }
        });

        //action for button ward 3CB2
        imgBtnWard3CB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wardName = tvWardName.getText().toString();
                bedNo18 = tvBedNo18.getText().toString();

                Toast.makeText(Ward3Activity.this,wardName,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Ward3Activity.this, AssignBedActivity.class);
                intent.putExtra("wardName", wardName);
                intent.putExtra("bedNo", bedNo18);
                startActivity(intent);

            }
        });

        //action for button ward 3CB3
        imgBtnWard3CB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wardName = tvWardName.getText().toString();
                bedNo19 = tvBedNo19.getText().toString();

                Toast.makeText(Ward3Activity.this,wardName,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Ward3Activity.this, AssignBedActivity.class);
                intent.putExtra("wardName", wardName);
                intent.putExtra("bedNo", bedNo19);
                startActivity(intent);

            }
        });

        //action for button ward 3CB4
        imgBtnWard3CB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wardName = tvWardName.getText().toString();
                bedNo20 = tvBedNo20.getText().toString();

                Toast.makeText(Ward3Activity.this,wardName,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Ward3Activity.this, AssignBedActivity.class);
                intent.putExtra("wardName", wardName);
                intent.putExtra("bedNo", bedNo20);
                startActivity(intent);

            }
        });

        //action for button ward 3CB5
        imgBtnWard3CB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wardName = tvWardName.getText().toString();
                bedNo21 = tvBedNo21.getText().toString();

                Toast.makeText(Ward3Activity.this,wardName,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Ward3Activity.this, AssignBedActivity.class);
                intent.putExtra("wardName", wardName);
                intent.putExtra("bedNo", bedNo21);
                startActivity(intent);

            }
        });

        //action for button ward 3CB6
        imgBtnWard3CB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wardName = tvWardName.getText().toString();
                bedNo22 = tvBedNo22.getText().toString();

                Toast.makeText(Ward3Activity.this,wardName,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Ward3Activity.this, AssignBedActivity.class);
                intent.putExtra("wardName", wardName);
                intent.putExtra("bedNo", bedNo22);
                startActivity(intent);

            }
        });

        fBtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ward3Activity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
