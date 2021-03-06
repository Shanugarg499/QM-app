package com.example.huda_haryana.ui.loan_calculator;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.huda_haryana.R;

public class Loan_CalculatorFragment extends Fragment {

    private LoanCalculatorViewModel mViewModel;

    public static Loan_CalculatorFragment newInstance() {
        return new Loan_CalculatorFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = ViewModelProviders.of(this).get(LoanCalculatorViewModel.class);
        return inflater.inflate(R.layout.loan__calculator_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(LoanCalculatorViewModel.class);
        // TODO: Use the ViewModel
    }

}
