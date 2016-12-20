package com.example.examen1android;

import android.content.Intent;
import android.view.View;

import utad.libreria.QBAdmin;

/**
 * Created by asus on 20/12/2016.
 */

public class SegundoControlador implements View.OnClickListener, View.OnFocusChangeListener{
    SegundoActivity vista;
    String noticias[];

    public SegundoControlador(SegundoActivity vista) {
        this.vista = vista;
        noticias=new String[]{
                vista.getResources().getString(R.string.Deportes1),
                vista.getResources().getString(R.string.Deportes2),
                vista.getResources().getString(R.string.Deportes3),
                vista.getResources().getString(R.string.Cine1),
                vista.getResources().getString(R.string.Cine2),
                vista.getResources().getString(R.string.Cine3),
                vista.getResources().getString(R.string.Tecnologia1),
                vista.getResources().getString(R.string.Tecnologia2),
                vista.getResources().getString(R.string.Tecnologia3),
                vista.getResources().getString(R.string.Turismo1),
                vista.getResources().getString(R.string.Turismo2),
                vista.getResources().getString(R.string.Turismo3),
                vista.getResources().getString(R.string.Arte1),
                vista.getResources().getString(R.string.Arte2),
                vista.getResources().getString(R.string.Arte3),
                vista.getResources().getString(R.string.Politica1),
                vista.getResources().getString(R.string.Politica2),
                vista.getResources().getString(R.string.Politica3)
        };


    }
    public void onClick(View view) {
        if (view.getId() == vista.categNot.btnVolver.getId()) {
            Intent intent = new Intent(vista, MainActivity.class);
            vista.startActivity(intent);
            vista.finish();
        }/*else if(view.getId() == vista.categNot.btnCine.getId()){
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

        if(view.getId() == vista.noticias.noticia1.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[0]);
        }*/




    }

    @Override
    public void onFocusChange(View view, boolean b) {

    }
}
