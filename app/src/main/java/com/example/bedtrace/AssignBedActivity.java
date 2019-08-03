package com.example.bedtrace;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AssignBedActivity extends AppCompatActivity {

    String wardName, bedNo, patientName, status;
    TextView tvWardName, tvBedNo, tvPatientName, tvRegNo;
    EditText etName, etRegNo;
    Button btnSave, btnReport;
    Spinner spStatus;
    FloatingActionButton fBtnHome;

    DatabaseReference dbPatientBed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign_bed);

        dbPatientBed = FirebaseDatabase.getInstance().getReference("patientBedStatus");

        btnReport = findViewById(R.id.btn_report);
        fBtnHome = findViewById(R.id.fb_home);
        tvWardName = findViewById(R.id.ward);
        tvBedNo = findViewById(R.id.no_bed);
        etName = findViewById(R.id.patient_name);
        etRegNo = findViewById(R.id.reg_no);
        spStatus = findViewById(R.id.spBedStatus);
        btnSave = findViewById(R.id.btn_save);

        Intent intent = getIntent();
        wardName = intent.getStringExtra("wardName");
        bedNo = intent.getStringExtra("bedNo");
        patientName = intent.getStringExtra("patientName");
        status = intent.getStringExtra("status");

        tvWardName.setText(wardName);
        tvBedNo.setText(bedNo);
        if (patientName != null) {
            etName.setText(patientName);
        }
        etRegNo.setText("1906230003");
        spStatus.setPrompt(status);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assignPaientToBed();
            }
        });

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

    private void assignPaientToBed() {
        String name = etName.getText().toString().trim();
        String regNo = etRegNo.getText().toString().trim();
        String ward = tvWardName.getText().toString().trim();
        String bed = tvBedNo.getText().toString().trim();
        String status = spStatus.getSelectedItem().toString();

        //check if patient name is empty
        if (!TextUtils.isEmpty(name)) {

            String id = dbPatientBed.push().getKey();
            PatientBedModel pbm = new PatientBedModel(id, name, regNo, ward, bed, status);
            dbPatientBed.child(id).setValue(pbm);

            Toast.makeText(this, "Success!, Patient have been assigned!", Toast.LENGTH_LONG).show();

        } else {

            Toast.makeText(this, "Warning!, Patient is empty!", Toast.LENGTH_LONG).show();

        }


    }


}
