package com.romansg.curso3semana4.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
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
public class PerfilMascotaFragment extends Fragment {
    ArrayList<Mascota> mascotas;
    RecyclerView rvMascotaFotos;

    public PerfilMascotaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_perfil_mascota, container, false);

        GridLayoutManager manager = new GridLayoutManager(getActivity(), 3);

        rvMascotaFotos = view.findViewById(R.id.rvMascotaFotos);
        rvMascotaFotos.setLayoutManager(manager);

        inicializarMascotas();

        MascotaAdapter adapter = new MascotaAdapter(mascotas, getActivity());
        rvMascotaFotos.setAdapter(adapter);

        return view;
    }

    private void inicializarMascotas() {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Fiona", R.drawable.fiona));
        mascotas.add(new Mascota("Fiona", R.drawable.fiona));
        mascotas.add(new Mascota("Fiona", R.drawable.fiona));
        mascotas.add(new Mascota("Fiona", R.drawable.fiona));
        mascotas.add(new Mascota("Fiona", R.drawable.fiona));
        mascotas.add(new Mascota("Fiona", R.drawable.fiona));
        mascotas.add(new Mascota("Fiona", R.drawable.fiona));
        mascotas.add(new Mascota("Fiona", R.drawable.fiona));
        mascotas.add(new Mascota("Fiona", R.drawable.fiona));
        mascotas.add(new Mascota("Fiona", R.drawable.fiona));
        mascotas.add(new Mascota("Fiona", R.drawable.fiona));
        mascotas.add(new Mascota("Fiona", R.drawable.fiona));
        mascotas.add(new Mascota("Fiona", R.drawable.fiona));
        mascotas.add(new Mascota("Fiona", R.drawable.fiona));
    }
}
