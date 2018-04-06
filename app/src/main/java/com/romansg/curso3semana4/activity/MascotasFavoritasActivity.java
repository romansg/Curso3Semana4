package com.romansg.curso3semana4.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import com.romansg.curso3semana4.R;
import com.romansg.curso3semana4.adapter.MascotaAdapter;
import com.romansg.curso3semana4.pojo.Mascota;

import java.util.ArrayList;

public class MascotasFavoritasActivity extends AppCompatActivity {
    private Toolbar toolbar;

    ArrayList<Mascota> mascotas;
    RecyclerView rvMascotasFavoritas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvMascotasFavoritas = findViewById(R.id.rvMascotasFavoritas);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotasFavoritas.setLayoutManager(manager);

        inicializarMascotas();

        MascotaAdapter adapter = new MascotaAdapter(mascotas, this);
        rvMascotasFavoritas.setAdapter(adapter);
    }

    private void inicializarMascotas() {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Bunny", R.drawable.bunny));
        mascotas.add(new Mascota("Fiona", R.drawable.fiona));
        mascotas.add(new Mascota("Morgan", R.drawable.morgan));
        mascotas.add(new Mascota("Puffy", R.drawable.puffy));
        mascotas.add(new Mascota("Scooter", R.drawable.scooter));

        mascotas.get(0).setLikes(5);
        mascotas.get(1).setLikes(3);
        mascotas.get(2).setLikes(6);
        mascotas.get(3).setLikes(5);
        mascotas.get(4).setLikes(8);
    }
}
