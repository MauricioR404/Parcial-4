package com.example.parcial4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class singleMunicipality extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_municipality);

        String department = getIntent().getExtras().getString("department");
        String municipality = getIntent().getExtras().getString("municipality");

        TextView textMunicipality = (TextView) findViewById(R.id.municipality);
        TextView textDepartment = (TextView) findViewById(R.id.department);

        textDepartment.setText("Departamento : " + department);
        textMunicipality.setText("Municipio: :" + municipality);
    }
}
