package com.example.sampleandroidproject;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class newcontact_activity extends AppCompatActivity {

    private final int GALERYPICKCODE = 1;

    private ImageView newcontantImageView;
    private Button SaveButton, ClearButton;
    private EditText namesurnameEditText,idnoEditText, telephoneEditText, emailEditText;
    private String imageuri="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newcontact_activity);

        newcontantImageView = (ImageView)findViewById(R.id.newcontantImageView);
        SaveButton = (Button)findViewById(R.id.SaveButton);
        ClearButton = (Button)findViewById(R.id.ClearButton);
        namesurnameEditText = (EditText)findViewById(R.id.namesurnameEditText);
        idnoEditText = (EditText)findViewById(R.id.idnoEditText);
        telephoneEditText = (EditText)findViewById(R.id.telephoneEditText);
        emailEditText = (EditText)findViewById(R.id.emailEditText);

        SaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contact a = new Contact(namesurnameEditText.getText().toString(),idnoEditText.getText().toString()
                        ,emailEditText.getText().toString(),telephoneEditText.getText().toString(), imageuri);
                Intent intent = new Intent(newcontact_activity.this, showcontact_activity.class);
                intent.putExtra("contact", a);
                startActivity(intent);
            }
        });

        ClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newcontantImageView.setImageResource(R.mipmap.ic_launcher_round);
                namesurnameEditText.setText("");
                telephoneEditText.setText("");
                idnoEditText.setText("");
                emailEditText.setText("");
                imageuri = "";
            }
        });

        newcontantImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                intent.setType("image/*");

                startActivityForResult(Intent.createChooser(intent, "Select Picture"),GALERYPICKCODE);


            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK)
        {
            if(requestCode == GALERYPICKCODE)
            {
                Uri selectedimage = data.getData();
                newcontantImageView.setImageURI(selectedimage);
                imageuri = selectedimage.toString();
            }
        }
    }
}
