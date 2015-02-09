package com.example.tarde.terremotos;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tarde on 09/02/2015.
 */
public class TerremotoAdapter extends BaseAdapter {

    private Activity contexto;
    private int layout;
    private List<Terremoto> listado;

    public TerremotoAdapter(Activity contexto, int layout, List<Terremoto> listado) {
        this.contexto = contexto;
        this.layout = layout;
        this.listado = listado;
    }

    @Override
    public int getCount() {
        if(listado != null){
            return listado.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if(listado != null && listado.size()>position){
            return listado.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Terremoto terremoto = listado.get(position);
        TerremotoViewHelper terremotoViewHelper;
        if(convertView == null){
            convertView = contexto.getLayoutInflater().inflate(layout, null);
            terremotoViewHelper = new TerremotoViewHelper();
            terremotoViewHelper.titulo = (TextView)convertView.findViewById(R.id.titulo);
            terremotoViewHelper.descripcion = (TextView) convertView.findViewById(R.id.descripcion);
            convertView.setTag(terremotoViewHelper);
        }else{
            terremotoViewHelper = (TerremotoViewHelper) convertView.getTag();
        }
        terremotoViewHelper.titulo.setText(terremoto.getTitulo());
        terremotoViewHelper.descripcion.setText(String.valueOf(terremoto.getDescripcion()));

        return convertView;
    }

    class TerremotoViewHelper{
        TextView titulo;
        TextView descripcion;
    }
}
