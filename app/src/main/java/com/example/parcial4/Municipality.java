package com.example.parcial4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Municipality extends ListActivity {
    String[] nameMunicipality;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_municipality);

        String municipality = getIntent().getExtras().getString("municipality");
        String name = "ahuachapan";

        //It is not the most practical but it works XD
        switch (municipality) {
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
}
