package com.romansg.curso3semana4.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.romansg.curso3semana4.R;
import com.romansg.curso3semana4.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by roman on 23/03/18.
 */

public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder> {
    private ArrayList<Mascota> mascotas;
    private Activity activity;
    private int seleccion = 0;

    public MascotaAdapter(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.mascota, parent, false);

        return new MascotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder holder, final int position) {
        final Mascota mascota = mascotas.get(position);

        holder.ivPetPhoto.setImageResource(mascota.getFoto());
        holder.tvPetName.setText(mascota.getNombre());
        holder.tvPetLikes.setText(mascota.getLikes() + "");

        holder.btnPetLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int likes = mascota.getLikes() + 1;
                mascota.setLikes(likes);
                holder.tvPetLikes.setText(likes + "");

                Toast.makeText(activity, "Diste like a " + mascota.getNombre(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivPetPhoto;
        private ImageButton btnPetLike;
        private TextView tvPetName;
        private TextView tvPetLikes;

        public MascotaViewHolder(View itemView) {
            super(itemView);

            ivPetPhoto = itemView.findViewById(R.id.ivPetPhoto);
            btnPetLike = itemView.findViewById(R.id.btnPetLike);
            tvPetName = itemView.findViewById(R.id.tvPetName);
            tvPetLikes  = itemView.findViewById(R.id.tvPetLikes);
        }
    }
}
