package com.example.bedtrace;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AssignBedActivity extends AppCompatActivity {

    String wardName, bedNo;
    TextView tvWardName, tvBedNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign_bed);

        Button btnReport;
        FloatingActionButton fBtnHome;

        btnReport = findViewById(R.id.btn_report);
        fBtnHome = findViewById(R.id.fb_home);
        tvWardName = findViewById(R.id.ward);
        tvBedNo = findViewById(R.id.no_bed);

        Intent intent = getIntent();
        wardName = intent.getStringExtra("wardName");
        bedNo = intent.getStringExtra("bedNo");
        tvWardName.setText(wardName);
        tvBedNo.setText(bedNo);


        btnReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AssignBedActivity.this, DiagnoseActivity.class);
                startActivity(intent);
            }
        });

        fBtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AssignBedActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
