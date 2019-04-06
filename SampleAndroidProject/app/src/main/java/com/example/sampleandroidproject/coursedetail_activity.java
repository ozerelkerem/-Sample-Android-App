package com.example.sampleandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class coursedetail_activity extends AppCompatActivity {

    private TextView coursenameTextView, coursenoteTextView, coursetotalstudentTextView, courseavgnoteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coursedetail_activity);

        Course course = (Course)getIntent().getSerializableExtra("course");

        courseavgnoteTextView = (TextView) findViewById(R.id.courseavgnoteTextView);
        coursenoteTextView = (TextView) findViewById(R.id.coursenoteTextView);
        coursetotalstudentTextView = (TextView) findViewById(R.id.coursetotalstudentTextView);
        coursenameTextView = (TextView) findViewById(R.id.coursenameTextView);

        courseavgnoteTextView.setText(course.avgnote);
        coursenoteTextView.setText(course.note);
        coursetotalstudentTextView.setText(course.totalstudent);
        coursenameTextView.setText(course.name);

    }
}
