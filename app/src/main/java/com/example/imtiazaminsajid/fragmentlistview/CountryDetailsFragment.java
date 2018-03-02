package com.example.imtiazaminsajid.fragmentlistview;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CountryDetailsFragment extends Fragment {
    TextView countryTV;


    public CountryDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_country_details, container, false);
        countryTV=view.findViewById(R.id.countryname);

        countryTV.setText(getArguments().getString("Country"));

        return view;
    }

}
