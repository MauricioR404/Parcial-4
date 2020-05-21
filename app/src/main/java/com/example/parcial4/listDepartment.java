package com.example.parcial4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listDepartment extends ListActivity {
    String[] nameDepartaments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_list_department);
        nameDepartaments = getResources().getStringArray(R.array.departamentos);

        ArrayAdapter<String> lista;
        lista = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, nameDepartaments);
        setListAdapter(lista);

        //onListItemClick(ListView 1, View v, int position, long id) {

        //}
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent i = new Intent(listDepartment.this, Municipality.class);
        nameDepartaments = getResources().getStringArray(R.array.departamentos);
        String name = nameDepartaments[position];
        i.putExtra("department", name);
        startActivity(i);
    }
}
