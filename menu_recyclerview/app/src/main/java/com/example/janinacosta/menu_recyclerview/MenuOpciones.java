package com.example.janinacosta.menu_recyclerview;

/**
 * Created by Janina Costa on 25/12/2016.
 */

public class MenuOpciones {
    private int imagen;
    private String color;

    public MenuOpciones(int imagen, String color) {
        this.imagen = imagen;
        this.color = color;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
