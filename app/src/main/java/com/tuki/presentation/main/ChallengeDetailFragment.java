package com.tuki.presentation.main;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tuki.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChallengeDetailFragment extends Fragment {


    public ChallengeDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_challenge_detail, container, false);
    }

}
