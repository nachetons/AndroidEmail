package com.tema6.tema6ejemplo2.Fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.tema6.tema6ejemplo2.Models.Mail;
import com.tema6.tema6ejemplo2.R;

public class DetailsFragment extends Fragment {

    private LinearLayout wrapper;
    private TextView textViewListSubject;
    private TextView textViewListMessage;
    private TextView textViewListSenderName;


    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        wrapper = (LinearLayout) view.findViewById(R.id.Wrapper2);
        textViewListSubject = (TextView) view.findViewById(R.id.textViewListSubject);
        textViewListMessage = (TextView) view.findViewById(R.id.textViewListMessage);
        textViewListSenderName = (TextView) view.findViewById(R.id.textViewListSenderName);
        wrapper.setVisibility(View.GONE);


        // Inflate the layout for this fragment
        return view;
    }

    public void renderText(Mail mail) {

        wrapper.setVisibility(View.VISIBLE);
        textViewListSubject.setText(mail.getSubject());
        textViewListSenderName.setText(mail.getSenderName());
        textViewListMessage.setText(mail.getMessage());
    }

}