package com.example.examen1android;

import android.content.Intent;
import android.view.View;

import utad.libreria.QBAdmin;

/**
 * Created by asus on 20/12/2016.
 */

public class SegundoControlador implements View.OnClickListener, View.OnFocusChangeListener{
    SegundoActivity vista;

    public SegundoControlador(SegundoActivity vista) {
        this.vista = vista;


    }
    public void onClick(View view) {
        if (view.getId() == vista.categNot.btnVolver.getId()) {
            Intent intent = new Intent(vista, MainActivity.class);
            vista.startActivity(intent);
            vista.finish();

        }

    }

    @Override
    public void onFocusChange(View view, boolean b) {

    }
}
