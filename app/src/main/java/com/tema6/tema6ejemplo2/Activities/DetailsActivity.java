package com.tema6.tema6ejemplo2.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.tema6.tema6ejemplo2.Fragments.*;
import com.tema6.tema6ejemplo2.Models.Mail;
import com.tema6.tema6ejemplo2.R;

public class DetailsActivity extends AppCompatActivity {

    private String subject;
    private String message;
    private String senderName;


    //Inflamos los detalles
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        if (getIntent().getExtras() != null) {
            subject = getIntent().getStringExtra("subject");
            message = getIntent().getStringExtra("message");
            senderName = getIntent().getStringExtra("senderName");
        }
        Mail mail = new Mail(subject,message,senderName);

        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
        detailsFragment.renderText(mail);

    }
}