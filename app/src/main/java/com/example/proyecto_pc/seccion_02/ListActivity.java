package com.example.proyecto_pc.seccion_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private ListView listView ;
    private List<String> names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView =(ListView) findViewById(R.id.listView);

        //Datos a mostrar
        names = new ArrayList<String>();
        names.add("Jorge");
        names.add("Monica");
        names.add("Andres");
        names.add("Juan");
        names.add("Jorge");
        names.add("Monica");
        names.add("Andres");
        names.add("Juan");
        names.add("Jorge");
        names.add("Monica");
        names.add("Andres");
        names.add("Juan");
        names.add("Jorge");
        names.add("Monica");
        names.add("Andres");
        names.add("Juan");
        names.add("Jorge");
        names.add("Monica");
        names.add("Andres");
        names.add("Juan");
        names.add("Jorge");
        names.add("Monica");
        names.add("Andres");
        names.add("Juan");

        //Adaptador , la forma visual de como se muestran los datos
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);

        //Establecemos el adaptados con nuestro List view
       // listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListActivity.this,"Has hecho click" + names.get(position),Toast.LENGTH_LONG).show();
            }
        });

        //Enlazamos con nuestro adaptador personalizado
        MyAdapter myAdapter = new MyAdapter(this, R.layout.list_item,names);
        listView.setAdapter(myAdapter);

    }
}

