package com.example.bedtrace;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Ward1Activity extends AppCompatActivity {

    ImageButton imgBtnWard1AB1, imgBtnWard1AB2;
    FloatingActionButton fBtnHome;
    TextView tvWardName, tvBedNo11, tvBedNo12, tvStatusc1b1, tvStatusc1b2, tvPatient;
    String wardName, bedNo11, bedNo12, statusB1, statusB2, patientName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ward_1);

        imgBtnWard1AB1 = findViewById(R.id.imgBtn_Ward1A_Bed1);
        imgBtnWard1AB2 = findViewById(R.id.imgBtn_Ward1A_Bed2);
        fBtnHome = findViewById(R.id.fb_home);
        tvWardName = findViewById(R. id. textView6);
        tvBedNo11 = findViewById(R. id. textView11);
        tvBedNo12 = findViewById(R. id. textView12);
        tvStatusc1b1 = findViewById(R. id. status_c1_b1);
        tvStatusc1b2 = findViewById(R. id. status_c1_b2);
        tvPatient = findViewById(R. id. patient_c1_b);

//        if (tvStatusc1b1 == null) {
//            tvStatusc1b1.setText(BedStatusEnum.DISCHARGE.getStingValue());
//        }

        //action for button ward 1AB1
        imgBtnWard1AB1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                wardName = tvWardName.getText().toString();
                bedNo11 = tvBedNo11.getText().toString();
                patientName = tvPatient.getText().toString();
                statusB1 = tvStatusc1b1.getText().toString();

                Toast.makeText(Ward1Activity.this,wardName,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Ward1Activity.this, AssignBedActivity.class);
                intent.putExtra("wardName", wardName);
                intent.putExtra("bedNo", bedNo11);
                intent.putExtra("patientName", patientName);
                intent.putExtra("status", statusB1);
                startActivity(intent);
            }

        });

        //action for button ward 1AB2
        imgBtnWard1AB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wardName = tvWardName.getText().toString();
                bedNo12 = tvBedNo12.getText().toString();
                patientName = tvPatient.getText().toString();
                statusB2 = tvStatusc1b2.getText().toString();

                Toast.makeText(Ward1Activity.this,wardName,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Ward1Activity.this, AssignBedActivity.class);
                intent.putExtra("wardName", wardName);
                intent.putExtra("bedNo", bedNo12);
                intent.putExtra("patientName", patientName);
                if (statusB2 != null) {
                    intent.putExtra("status", statusB2);
                }
                startActivity(intent);

            }

        });

        //action for floating button
        fBtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ward1Activity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
