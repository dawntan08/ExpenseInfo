package com.liway.expenseinfo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.expense_category_spinner);



    }
}
