package com.nimblinteractive.joistdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InvoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);
        setTitle(getString(R.string.new_estimate));
    }
}
