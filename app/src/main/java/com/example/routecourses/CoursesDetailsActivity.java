package com.example.routecourses;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CoursesDetailsActivity extends AppCompatActivity {

    ImageView courseImv;

    TextView courseDetailsTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_details);

        courseImv = findViewById(R.id.imv_course_details);
        courseDetailsTv = findViewById(R.id.tv_course_details);

        Intent intent = getIntent();
        if (intent == null)
            return;

        switch (intent.getStringExtra("course")){
            case "android":
                courseDetailsTv.setText(R.string.android_details);
                courseImv.setImageResource(R.drawable.android_course);
                break;

            case "ios":
                courseDetailsTv.setText(R.string.ios_details);
                courseImv.setImageResource(R.drawable.ios_course);
                break;
            case "fullstack":
                courseDetailsTv.setText(R.string.full_stack_details);
                courseImv.setImageResource(R.drawable.fullstack_course);
                break;
        }
    }
}