package com.example.imtiazaminsajid.fragmentlistview;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CountryListFragment extends Fragment {

    ListView countryLV;
    MyItemClickListener myItemClickListener;


    public CountryListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_country_list, container, false);

        countryLV = view.findViewById(R.id.countryList);



        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myItemClickListener = (MyItemClickListener) context;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(
                getActivity(),
                R.array.countries,
                R.layout.support_simple_spinner_dropdown_item
        );

        countryLV.setAdapter(adapter);

        countryLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String countryName = adapterView.getItemAtPosition(i).toString();

                myItemClickListener = new MainActivity();
                myItemClickListener.getItem(countryName);
            }
        });



    }
}
