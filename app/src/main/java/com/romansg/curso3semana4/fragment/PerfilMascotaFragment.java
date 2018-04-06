package com.romansg.curso3semana4.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.romansg.curso3semana4.R;
import com.romansg.curso3semana4.adapter.MiniaturaAdapter;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_perfil_mascota, container, false);

        GridLayoutManager manager = new GridLayoutManager(getActivity(), 3);

        rvMascotaFotos = view.findViewById(R.id.rvMascotaFotos);
        rvMascotaFotos.setLayoutManager(manager);

        inicializarMascotas();

        MiniaturaAdapter adapter = new MiniaturaAdapter(mascotas, getActivity());
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

        mascotas.get(0).setLikes(3);
        mascotas.get(1).setLikes(0);
        mascotas.get(2).setLikes(5);
        mascotas.get(3).setLikes(2);
        mascotas.get(4).setLikes(1);
        mascotas.get(5).setLikes(0);
        mascotas.get(6).setLikes(4);
        mascotas.get(7).setLikes(2);
    }
}
