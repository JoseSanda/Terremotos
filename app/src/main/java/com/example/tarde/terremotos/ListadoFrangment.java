package com.example.tarde.terremotos;

import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListadoFrangment extends Fragment {

    private ListView listado;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_listado, container);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //TODO Recuperamos el listado de BBDD
        List<Terremoto> list = new ArrayList<>();

        listado = (ListView) getActivity().findViewById(R.id.lvTerremotos);
        listado.setAdapter(new TerremotoAdapter(getActivity(),R.layout.list_item_terremoto,list));

    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener listener){
        listado.setOnItemClickListener(listener);
    }


}
