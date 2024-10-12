package com.example.routecourses;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.imv_android_course || v.getId() == R.id.btn_android_course ){
            moveToCoursesDetailsActivity("android");
            return;
        }

        if(v.getId() == R.id.imv_ios_course || v.getId() == R.id.btn_ios_course ){
            moveToCoursesDetailsActivity("ios");
            return;
        }

        if(v.getId() == R.id.imv_fullstack_course || v.getId() == R.id.btn_fullstack_course ){
            moveToCoursesDetailsActivity("fullstack");
            return;
        }
    }

    private void moveToCoursesDetailsActivity(String course) {
        Intent intent = new Intent(MainActivity.this, CoursesDetailsActivity.class);
        intent.putExtra("course", course);
        startActivity(intent);
    }
}