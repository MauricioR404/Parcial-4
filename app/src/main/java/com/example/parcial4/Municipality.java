package com.example.parcial4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Municipality extends ListActivity {
    String[] nameMunicipality, getNameMunicipality;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_municipality);

        String department = getIntent().getExtras().getString("department");

        //It is not the most practical but it works XD
        switch (department) {
            case "Ahuachapán":
                nameMunicipality = getResources().getStringArray(R.array.ahuachapan);
                break;
            case "Santa Ana":
                nameMunicipality = getResources().getStringArray(R.array.santana);
                break;
            case "Sonsonate":
                nameMunicipality = getResources().getStringArray(R.array.sonsonate);
                break;
            case "Usulután":
                nameMunicipality = getResources().getStringArray(R.array.usulutan);
                break;
            case "San Miguel":
                nameMunicipality = getResources().getStringArray(R.array.sanmiguel);
                break;
            case "Morazán":
                nameMunicipality = getResources().getStringArray(R.array.morazan);
                break;
            case "La Unión":
                nameMunicipality = getResources().getStringArray(R.array.launion);
                break;
            case "La Libertad":
                nameMunicipality = getResources().getStringArray(R.array.lalibertad);
                break;
            case "Chalatenango":
                nameMunicipality = getResources().getStringArray(R.array.chalatenango);
                break;
            case "Cuscatlán":
                nameMunicipality = getResources().getStringArray(R.array.cuscatlan);
                break;
            case "San Salvador (la capital)":
                nameMunicipality = getResources().getStringArray(R.array.sansalvador);
                break;
            case "La Paz":
                nameMunicipality = getResources().getStringArray(R.array.lapaz);
                break;
            case "Cabañas":
                nameMunicipality = getResources().getStringArray(R.array.cabanas);
                break;
            case "San Vicente":
                nameMunicipality = getResources().getStringArray(R.array.sanvicente);
                break;
            default:
                nameMunicipality = getResources().getStringArray(R.array.chalatenango);
                break;

        }

        ArrayAdapter<String> lista;
        lista = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, nameMunicipality);
        setListAdapter(lista);

    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent i = new Intent(Municipality.this, singleMunicipality.class);
        String department = getIntent().getExtras().getString("department");

        getNameMunicipality = getResources().getStringArray(R.array.departamentos);

        switch (department) {
            case "Ahuachapán":
                getNameMunicipality = getResources().getStringArray(R.array.ahuachapan);
                break;
            case "Santa Ana":
                getNameMunicipality = getResources().getStringArray(R.array.santana);
                break;
            case "Sonsonate":
                getNameMunicipality = getResources().getStringArray(R.array.sonsonate);
                break;
            case "Usulután":
                getNameMunicipality = getResources().getStringArray(R.array.usulutan);
                break;
            case "San Miguel":
                getNameMunicipality = getResources().getStringArray(R.array.sanmiguel);
                break;
            case "Morazán":
                getNameMunicipality = getResources().getStringArray(R.array.morazan);
                break;
            case "La Unión":
                getNameMunicipality = getResources().getStringArray(R.array.launion);
                break;
            case "La Libertad":
                getNameMunicipality = getResources().getStringArray(R.array.lalibertad);
                break;
            case "Chalatenango":
                getNameMunicipality = getResources().getStringArray(R.array.chalatenango);
                break;
            case "Cuscatlán":
                getNameMunicipality = getResources().getStringArray(R.array.cuscatlan);
                break;
            case "San Salvador (la capital)":
                getNameMunicipality = getResources().getStringArray(R.array.sansalvador);
                break;
            case "La Paz":
                getNameMunicipality = getResources().getStringArray(R.array.lapaz);
                break;
            case "Cabañas":
                getNameMunicipality = getResources().getStringArray(R.array.cabanas);
                break;
            case "San Vicente":
                getNameMunicipality = getResources().getStringArray(R.array.sanvicente);
                break;
            default:
                getNameMunicipality = getResources().getStringArray(R.array.chalatenango);
                break;

        }

        String municipality = getNameMunicipality[position];

        i.putExtra("department", department);
        i.putExtra("municipality", municipality);
        startActivity(i);
    }
}
