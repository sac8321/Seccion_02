package com.example.proyecto_pc.seccion_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView =(ListView) findViewById(R.id.listView);

        //Datos a mostrar
        List<String> names = new ArrayList<String>();
        names.add("Jorge");
        names.add("Monica");
        names.add("Andres");
        names.add("Juan");

        //Adaptador , la forma visual de como se muestran los datos
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);

        //Establecemos el adaptados con nuestro List view
        listView.setAdapter(adapter);


    }
}
