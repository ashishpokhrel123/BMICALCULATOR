package com.example.bmicalcutor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et1, et2;
    Button btn;
     TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.wtg);
        et2 = findViewById(R.id.ht);
        btn = findViewById(R.id.bmical);

        result =  findViewById(R.id.bmires);

        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String st1 = et1.getText().toString();
        String st2 = et2.getText().toString();


        if (st2 != null && !"".equals(st2)
                && st1 != null && !"".equals(st1)) {
            float heightValue = Float.parseFloat(st2) ;
            float weightValue = Float.parseFloat(st1);

            float bmi = weightValue / (heightValue * heightValue);


            displayBMI(bmi);


        }
    }

    public void displayBMI (float bmi) {
        String category;
        if (bmi < 18f) {
            category = " underweight";
        } else if (bmi >=18f && bmi <= 25f) {
            category = "Normal";

        } else {
            category ="Overweight";
        }
        category = bmi + "\n\n" + category;
        result.setText("BMI="+category);


    }

}





