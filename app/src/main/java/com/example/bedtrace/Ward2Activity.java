package com.example.bedtrace;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Ward2Activity extends AppCompatActivity {

    ImageButton imgBtnWard2BB1, imgBtnWard2BB2, imgBtnWard2BB3, imgBtnWard2BB4;
    FloatingActionButton fBtnHome;
    TextView tvWardName, tvBedNo13, tvBedNo14, tvBedNo15, tvBedNo16,
            tvStatusB1, tvStatusB2, tvStatusB3, tvStatusB4,
            tvPatientB1, tvPatientB2, tvPatientB3;
    String wardName, bedNo13, bedNo14, bedNo15, bedNo16,
            statusB1, statusB2, statusB3, statusB4,
            patientB1, patientB2, patientB4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ward_2);

        imgBtnWard2BB1 = findViewById(R.id.imgBtn_Ward2B_Bed1);
        imgBtnWard2BB2 = findViewById(R.id.imgBtn_Ward2B_Bed2);
        imgBtnWard2BB3 = findViewById(R.id.imgBtn_Ward2B_Bed3);
        imgBtnWard2BB4 = findViewById(R.id.imgBtn_Ward2B_Bed4);

        fBtnHome = findViewById(R.id.fb_home);
        tvWardName = findViewById(R. id. textView7);

        tvBedNo13 = findViewById(R. id. textView13);
        tvBedNo14 = findViewById(R. id. textView14);
        tvBedNo15 = findViewById(R. id. textView15);
        tvBedNo16 = findViewById(R. id. textView16);

        tvStatusB1 = findViewById(R. id. status_c2_b1);
        tvStatusB2 = findViewById(R. id. status_c2_b5);
        tvStatusB3 = findViewById(R. id. status_c2_b3);
        tvStatusB4 = findViewById(R. id. status_c2_b6);

        tvPatientB1 = findViewById(R. id. patient_c2_b1);
        tvPatientB2 = findViewById(R. id. patient_c2_b4);
        tvPatientB3 = findViewById(R. id. patient_c2_b3);

        //action for button ward 2BB1
        imgBtnWard2BB1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                wardName = tvWardName.getText().toString();
                bedNo13 = tvBedNo13.getText().toString();
                patientB1 = tvPatientB1.getText().toString();
                statusB1 = tvStatusB1.getText().toString();

                Toast.makeText(Ward2Activity.this,wardName,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Ward2Activity.this, AssignBedActivity.class);
                intent.putExtra("wardName", wardName);
                intent.putExtra("bedNo", bedNo13);
                intent.putExtra("patientName", patientB1);
                intent.putExtra("status", statusB1);
                startActivity(intent);
            }

        });

        //action for button ward 2BB2
        imgBtnWard2BB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wardName = tvWardName.getText().toString();
                bedNo14 = tvBedNo14.getText().toString();
                patientB2 = tvPatientB2.getText().toString();
                statusB2 = tvStatusB2.getText().toString();

                Toast.makeText(Ward2Activity.this,wardName,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Ward2Activity.this, AssignBedActivity.class);
                intent.putExtra("wardName", wardName);
                intent.putExtra("bedNo", bedNo14);
                intent.putExtra("patientName", patientB2);
                intent.putExtra("status", statusB2);
                startActivity(intent);
            }
        });

        //action for button ward 2BB3
        imgBtnWard2BB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wardName = tvWardName.getText().toString();
                bedNo15 = tvBedNo15.getText().toString();
                statusB3 = tvStatusB3.getText().toString();

                Toast.makeText(Ward2Activity.this,wardName,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Ward2Activity.this, AssignBedActivity.class);
                intent.putExtra("wardName", wardName);
                intent.putExtra("bedNo", bedNo15);
                intent.putExtra("status", statusB3);
                startActivity(intent);
            }
        });

        //action for button ward 2BB4
        imgBtnWard2BB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wardName = tvWardName.getText().toString();
                bedNo16 = tvBedNo16.getText().toString();
                patientB4 = tvPatientB3.getText().toString();
                statusB4 = tvStatusB3.getText().toString();

                Toast.makeText(Ward2Activity.this,wardName,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Ward2Activity.this, AssignBedActivity.class);
                intent.putExtra("wardName", wardName);
                intent.putExtra("bedNo", bedNo16);
                intent.putExtra("status", statusB3);
                startActivity(intent);
            }
        });

        //action for button ward 2BB5
        fBtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ward2Activity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
