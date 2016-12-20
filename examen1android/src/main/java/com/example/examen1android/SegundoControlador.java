package com.example.examen1android;

import android.content.Intent;
import android.view.View;

import utad.libreria.QBAdmin;

/**
 * Created by asus on 20/12/2016.
 */

public class SegundoControlador implements View.OnClickListener, View.OnFocusChangeListener{
    SegundoActivity vista;
    String categorias[];

    public SegundoControlador(SegundoActivity vista) {
        this.vista = vista;
        categorias=new String[]{
                vista.getResources().getString(R.string.Deportes),
                vista.getResources().getString(R.string.Tecnologia),
                vista.getResources().getString(R.string.Turismo),
                vista.getResources().getString(R.string.Cine),
                vista.getResources().getString(R.string.Politica),
                vista.getResources().getString(R.string.Arte)
        };


    }
    public void onClick(View view) {
        if (view.getId() == vista.categNot.btnVolver.getId()) {
            Intent intent = new Intent(vista, MainActivity.class);
            vista.startActivity(intent);
            vista.finish();
        }else if(view.getId() == vista.categNot.btnCine.getId()){
            vista.cambiarFragment(2);
        }else if(view.getId() == vista.categNot.btnTecnologia.getId()){
            vista.cambiarFragment(2);
        }else if(view.getId() == vista.categNot.btnTurismo.getId()){
            vista.cambiarFragment(2);
        }else if(view.getId() == vista.categNot.btnArte.getId()){
            vista.cambiarFragment(2);
        }else if(view.getId() == vista.categNot.btnDeportes.getId()){
            vista.cambiarFragment(2);
        }else if(view.getId() == vista.categNot.btnPolitica.getId()){
            vista.cambiarFragment(2);
        }

    }

    @Override
    public void onFocusChange(View view, boolean b) {

    }
}
