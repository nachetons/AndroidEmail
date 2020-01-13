package com.tema6.tema6ejemplo2.Fragments;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.tema6.tema6ejemplo2.Adapters.*;

import com.tema6.tema6ejemplo2.Models.Mail;
import com.tema6.tema6ejemplo2.R;
import com.tema6.tema6ejemplo2.Utils.*;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DataFragment extends Fragment {


    private ListView listView;
    private List<Mail> mails;
    private MailAdapter Adapter;
    private TextView textViewListSenderName;
    private OnFragmentInteractionListener mListener;


    public DataFragment() {
        // Required empty public constructor
    }
//Inflamos el layout
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_data, container, false);
        // Lógica para capturar los elementos de la UI


        listView = (ListView) view.findViewById(R.id.listViewDetails);
        mails = Util.getDummyData();
        Adapter = new MailAdapter(getContext(),R.layout.list_view_mail, mails);


        listView.setAdapter(Adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                mListener.onListClick(mails.get(position));
                textViewListSenderName = (TextView) view.findViewById(R.id.textViewListSubject);
                textViewListSenderName.setTextColor(Color.GRAY);
            }
        });


        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
        }
    }
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;

    }



    public interface OnFragmentInteractionListener {
        void onListClick(Mail mail);
    }

}