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
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.prefinal.DB.AfricanCrisis;

import java.util.ArrayList;

public class BottomFragment extends Fragment {
  private static final String ARG_PARAM1 = "param1";

  private ArrayList<AfricanCrisis> africanCrisis;
  private ListView bottomListView;
  private ArrayAdapter bottomArrayAdapter;

  public BottomFragment() { }

  public static BottomFragment newInstance(ArrayList<AfricanCrisis> africanCrisis) {
    BottomFragment fragment = new BottomFragment();
    Bundle args = new Bundle();
    args.putSerializable(ARG_PARAM1, africanCrisis);
    fragment.setArguments(args);
    return fragment;
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments() != null) {
      africanCrisis = (ArrayList<AfricanCrisis>) getArguments().getSerializable(ARG_PARAM1);
    }
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_bottom, container, false);
  }

  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    bottomListView = view.findViewById(R.id.bottomListView);
    bottomArrayAdapter = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1, africanCrisis);
    bottomListView.setAdapter(bottomArrayAdapter);
  }
}
