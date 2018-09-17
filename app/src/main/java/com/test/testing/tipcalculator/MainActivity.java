package com.test.testing.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView lblServiceCost, lblTotalCost;
    EditText txtServiceCost;
    RadioButton rdbtnGood, rdbtnVeryGood, rdbtnExcellent;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblServiceCost = (TextView) findViewById(R.id.lblServiceCost);
        lblTotalCost = (TextView) findViewById(R.id.lblTotalCost);

        txtServiceCost = (EditText) findViewById(R.id.txtServiceCost);

        rdbtnGood = (RadioButton) findViewById(R.id.rdbtnGood);
        rdbtnVeryGood = (RadioButton) findViewById(R.id.rdbtnVeryGood);
        rdbtnExcellent = (RadioButton) findViewById(R.id.rdbtnExcellent);

        btnCalculate = (Button) findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (txtServiceCost.getText().toString().equals("")) {
            Toast.makeText(this, "Invalid input.", Toast.LENGTH_SHORT).show();
        } else {
            if (rdbtnGood.isChecked() == true) {
                int cost = Integer.valueOf(txtServiceCost.getText().toString());
                int costres = (cost * 5) / 100;
                lblTotalCost.setText("Total cost is: " + (costres + cost));
            } else if (rdbtnVeryGood.isChecked() == true) {
                int cost = Integer.valueOf(txtServiceCost.getText().toString());
                int costres = (cost * 10) / 100;
                lblTotalCost.setText("Total cost is: " + (costres + cost));
            } else if (rdbtnExcellent.isChecked() == true) {
                int cost = Integer.valueOf(txtServiceCost.getText().toString());
                int costres = (cost * 15) / 100;
                lblTotalCost.setText("Total cost is: " + (costres + cost));
            } else {
                Toast.makeText(this, "Invalid input.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}