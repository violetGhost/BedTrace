package com.example.bedtrace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton imgBtnClass1, imgBtnClass2, imgBtnClass3;
        TextView tvArticle;

        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        /*ActionBar myActionBar = getSupportActionBar();
        myActionBar.setDisplayHomeAsUpEnabled(true);*/

        imgBtnClass1 = findViewById(R.id.img_btn_class1);
        imgBtnClass2 = findViewById(R.id.img_btn_class2);
        imgBtnClass3 = findViewById(R.id.img_btn_class3);
        tvArticle = findViewById(R.id.article);

//        tvArticle.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);

        imgBtnClass1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Ward1Activity.class);
                startActivity(intent);
            }
        });

        imgBtnClass2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Ward2Activity.class);
                startActivity(intent);
            }
        });

        imgBtnClass3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Ward3Activity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_top_toolbar,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent intent;
        switch(item.getItemId()){
            case R.id.profile:
                intent = new Intent(HomeActivity.this, UserProfileActivity.class);
                startActivity(intent);
                break;
            case R.id.details_bedtrace:
                intent = new Intent(HomeActivity.this, AboutAppActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
