package com.romansg.curso3semana4.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.romansg.curso3semana4.R;
import com.romansg.curso3semana4.adapter.MascotaAdapter;
import com.romansg.curso3semana4.pojo.Mascota;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListaMascotasFragment extends Fragment {
    ArrayList<Mascota> mascotas;
    RecyclerView rvMascotas;

    public ListaMascotasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lista_mascotas, container, false);

        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascotas = view.findViewById(R.id.rvMascotas);
        rvMascotas.setLayoutManager(manager);

        inicializarMascotas();

        MascotaAdapter adapter = new MascotaAdapter(mascotas, getActivity());
        rvMascotas.setAdapter(adapter);

        return view;
    }

    private void inicializarMascotas() {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Abby", R.drawable.abby));
        mascotas.add(new Mascota("Bunny", R.drawable.bunny));
        mascotas.add(new Mascota("Carrot", R.drawable.carrot));
        mascotas.add(new Mascota("Clifford", R.drawable.clifford));
        mascotas.add(new Mascota("Dakota", R.drawable.dakota));
        mascotas.add(new Mascota("Dexter", R.drawable.dexter));
        mascotas.add(new Mascota("Fiona", R.drawable.fiona));
        mascotas.add(new Mascota("Loki", R.drawable.loki));
        mascotas.add(new Mascota("Milo", R.drawable.milo));
        mascotas.add(new Mascota("Morgan", R.drawable.morgan));
        mascotas.add(new Mascota("Oscar", R.drawable.oscar));
        mascotas.add(new Mascota("Puffy", R.drawable.puffy));
        mascotas.add(new Mascota("Rabito", R.drawable.rabito));
        mascotas.add(new Mascota("Rex", R.drawable.rex));
        mascotas.add(new Mascota("Scooter", R.drawable.scooter));
        mascotas.add(new Mascota("Squirtle", R.drawable.squirtle));
        mascotas.add(new Mascota("Tiger", R.drawable.tiger));
        mascotas.add(new Mascota("Tucky", R.drawable.tucky));
        mascotas.add(new Mascota("Wilson", R.drawable.wilson));
    }
}
