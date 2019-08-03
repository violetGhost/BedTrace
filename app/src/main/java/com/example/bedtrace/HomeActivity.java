package com.example.bedtrace;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeActivity extends AppCompatActivity{

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        NavigationView navigationView;
        ImageButton imgBtnClass1, imgBtnClass2, imgBtnClass3;
        TextView tvArticle;
        auth = FirebaseAuth.getInstance();

        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        /*ActionBar myActionBar = getSupportActionBar();
        myActionBar.setDisplayHomeAsUpEnabled(true);*/

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgBtnClass1 = findViewById(R.id.img_btn_class1);
        imgBtnClass2 = findViewById(R.id.img_btn_class2);
        imgBtnClass3 = findViewById(R.id.img_btn_class3);

        tvArticle = findViewById(R.id.article);

        navigationView = findViewById(R.id.navigation_view);

//        tvArticle.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                Intent intent;
                switch(menuItem.getItemId()){
                    case R.id.profile:
                        intent = new Intent(HomeActivity.this, UserProfileActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.details_bedtrace:
                        intent = new Intent(HomeActivity.this, AboutAppActivity.class);
                        startActivity(intent);
                        break;
                }
                drawerLayout.closeDrawer(drawerLayout);
                return true;
            }
        });

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

        if (drawerToggle.onOptionsItemSelected(item)){
            return true;
        }

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
            case R.id.logout:
                //method logout
                auth.signOut();
                startActivity(new Intent(HomeActivity.this, LoginActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
