package com.romansg.curso3semana4.pojo;

/**
 * Created by roman on 23/03/18.
 */

public class Mascota {
    private String nombre;
    private int foto;
    private int likes;

    public Mascota(String nombre, int foto) {
        this.nombre = nombre;
        this.foto = foto;
        this.likes = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}