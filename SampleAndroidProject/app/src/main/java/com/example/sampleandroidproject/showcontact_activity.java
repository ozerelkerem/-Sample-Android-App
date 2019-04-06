package com.example.sampleandroidproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ShowableListMenu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class showcontact_activity extends AppCompatActivity {

    private Button CallButton, MailButton, ListCoursesButton;
    private TextView namesurnameTextView, telephoneTextView, idnoTextView, emailTextView;
    private ImageView newcontImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showcontact_activity);

        newcontImageView = (ImageView)findViewById(R.id.newcontantImageView);
        namesurnameTextView = (TextView)findViewById(R.id.namesurnameTextView);
        telephoneTextView = (TextView)findViewById(R.id.telephoneTextView);
        idnoTextView = (TextView)findViewById(R.id.idnoTextView);
        emailTextView = (TextView)findViewById(R.id.emailTextView);
        CallButton = (Button)findViewById(R.id.CallButton);
        MailButton = (Button)findViewById(R.id.MailButton);
        ListCoursesButton = (Button)findViewById(R.id.ListCoursesButton);

        Contact a = (Contact)getIntent().getSerializableExtra("contact");

        telephoneTextView.setText(a.telephone);
        idnoTextView.setText(a.idno);
        namesurnameTextView.setText(a.namesurname);
        emailTextView.setText(a.email);
        if(a.image.equals("")) {
            newcontImageView.setImageResource(R.mipmap.ic_launcher_round);
        }
        else {
            newcontImageView.setImageURI(Uri.parse(a.image));
        }
        ListCoursesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(showcontact_activity.this, courselist_activity.class));
            }
        });
        CallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+telephoneTextView.getText().toString()));
                startActivity(intent);
            }
        });
        MailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"+emailTextView.getText().toString()));
                startActivity(intent);
            }
        });

    }
}
