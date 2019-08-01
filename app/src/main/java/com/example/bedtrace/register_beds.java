package com.example.bedtrace;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register_beds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_beds);

        Button btnReport;
        FloatingActionButton fBtnHome;

        btnReport = findViewById(R.id.btn_report);
        fBtnHome = findViewById(R.id.fb_home);

        btnReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register_beds.this, report.class);
                startActivity(intent);
            }
        });

        fBtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register_beds.this, main_page.class);
                startActivity(intent);
            }
        });
    }
}
