package com.romansg.curso3semana4.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.romansg.curso3semana4.R;
import com.romansg.curso3semana4.activity.MascotasFavoritasActivity;
import com.romansg.curso3semana4.adapter.PageAdapter;
import com.romansg.curso3semana4.fragment.ListaMascotasFragment;
import com.romansg.curso3semana4.fragment.PerfilMascotaFragment;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private void toast(CharSequence text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        setSupportActionBar(toolbar);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new ListaMascotasFragment());
        fragments.add(new PerfilMascotaFragment());

        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), fragments));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setText(R.string.lista_mascotas_fragment);
        tabLayout.getTabAt(1).setText(R.string.perfil_mascota_fragment);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mContacto:
                verContacto();
                break;

            case R.id.mBiografia:
                verBiografia();
                break;

            case R.id.mFavoritas:
                verMascotasFavoritas();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void verContacto() {
        Intent intent = new Intent(this, ContactoActivity.class);
        startActivity(intent);
    }

    public void verBiografia() {
        Intent intent = new Intent(this, BiografiaActivity.class);
        startActivity(intent);
    }

    public void verMascotasFavoritas() {
        Intent intent = new Intent(this, MascotasFavoritasActivity.class);
        startActivity(intent);
    }
}
