package com.tema6.tema6ejemplo2.Activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.tema6.tema6ejemplo2.Fragments.DataFragment;
import com.tema6.tema6ejemplo2.Fragments.*;
import com.tema6.tema6ejemplo2.Models.Mail;
import com.tema6.tema6ejemplo2.R;

public class MainActivity extends FragmentActivity implements DataFragment.OnFragmentInteractionListener {

    private boolean isMultiPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setMultiPanel();
    }

    //Cada vez que clickeamos un correo nos almacena y envia la informacion al details fragment
    @Override
    public void onListClick(Mail mail) {

        if (isMultiPanel) {
            DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
            detailsFragment.renderText(mail);
        } else {
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra("subject",mail.getSubject());
            intent.putExtra("message",mail.getMessage());
            intent.putExtra("senderName",mail.getSenderName());
            startActivity(intent);
        }

    }

    private void setMultiPanel() {
        isMultiPanel = (getSupportFragmentManager().findFragmentById(R.id.detailsFragment) != null);
    }
}