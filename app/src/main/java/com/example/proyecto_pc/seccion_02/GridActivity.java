package com.example.proyecto_pc.seccion_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GridActivity extends AppCompatActivity {

    private List<String> names;
    private GridView gridView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        gridView=(GridView)findViewById(R.id.gridView);

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



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridActivity.this,"Has hecho click" + names.get(position),Toast.LENGTH_LONG).show();
            }
        });

        //Enlazamos con nuestro adaptador personalizado
        MyAdapter myAdapter = new MyAdapter(this, R.layout.grid_item,names);
      gridView.setAdapter(myAdapter);


    }
}
