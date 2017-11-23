package com.example.proyecto_pc.seccion_02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private int layout ;
    private List<String> names;

    public MyAdapter(Context context, int layout , List<String> names){
        this.context=context;
        this.layout=layout;
        this.names=names;

    }


    @Override
    public int getCount() {
        return this.names.size();
    }

    @Override
    public Object getItem(int position) {
        return this.names.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        //View Holder Pattern
        viewHolder holder;
        if (convertView==null){
            //Inflamos la vista que ha llegado con el layout personalizado
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView= layoutInflater.inflate(this.layout,null);

            holder = new viewHolder();
            //Referenciamos el evento a modificar y lo rrenenamos
            holder.nameTextView = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(holder);
        }else {
            holder = (viewHolder) convertView.getTag();
        }


        //Trae el valor actual de la posicion
        String currentName = names.get(position);
//        currentName=(String) getItem(position);


        holder.nameTextView.setText(currentName);

        //devolvemos la vista inflada y modificada nuestros datos
        return convertView;
    }


    static class viewHolder{
        private TextView nameTextView;


    }
}
