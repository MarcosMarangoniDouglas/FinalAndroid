package com.example.prefinal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.prefinal.DB.Country;

import java.util.ArrayList;
import java.util.List;


public class TopFragment extends Fragment {

    private static final String ARG_PARAM1 = "listCountries";

    ListView topListView;
    ArrayAdapter topArrayAdapter;

    private List<Country> countries;

    private OnFragmentInteractionListener mListener;

    public TopFragment() {
        // Required empty public constructor
    }

    public static TopFragment newInstance(ArrayList<Country> countries) {
        TopFragment fragment = new TopFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PARAM1, countries);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            this.countries = (List<Country>) getArguments().getSerializable(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        topListView = view.findViewById(R.id.topListView);

        topArrayAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, countries);
        topListView.setAdapter(topArrayAdapter);

        topListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                onCountrySelect(countries.get(position).getCode());
            }
        });
    }

    public void onCountrySelect(String code) {
        if (mListener != null) {
            mListener.onFragmentInteraction(code);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String code);
    }
}
