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
    //Este string lo creo para igualarlo a cada tipo de noticia una vez pinches en cada boton
    String not;



    public SegundoControlador(SegundoActivity vista) {
        String not="";
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
        }else if(view.getId() == vista.categNot.btnCine.getId()){
            not="cine";
            vista.cambiarFragment(2);
        }else if(view.getId() == vista.categNot.btnTecnologia.getId()){
            not="tecnologia";
            vista.cambiarFragment(2);
        }else if(view.getId() == vista.categNot.btnTurismo.getId()){
            not="turismo";
            vista.cambiarFragment(2);
        }else if(view.getId() == vista.categNot.btnArte.getId()){
            not="arte";
            vista.cambiarFragment(2);
        }else if(view.getId() == vista.categNot.btnDeportes.getId()){
            not="deportes";
            vista.cambiarFragment(2);
        }else if(view.getId() == vista.categNot.btnPolitica.getId()){
            not="politica";
            vista.cambiarFragment(2);
        }else if(view.getId() ==vista.noticias.btnCategNoticias.getId()){
            vista.cambiarFragment(1);
        }else if(view.getId() ==vista.inforNot.btnNoticias.getId()){
            vista.cambiarFragment(2);
        }

        /*Comprobaciones para que si nuestro string se igualo a un tipo de noticia u otro
        al pinchar en los botones de arriba de categoria de noticias,muestre las noticias
        de cada tipo estableciendo el texto de nuestro fragment de información de noticias,
        a cada noticia del array segun pulse noticia 1,2 o 3.
         */

        if(not=="deportes"&&view.getId() == vista.noticias.noticia1.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[0]);
        }else if(not=="deportes"&&view.getId() == vista.noticias.noticia2.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[1]);
        }else if(not=="deportes"&&view.getId() == vista.noticias.noticia3.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[2]);
        }else if(not=="cine"&&view.getId() == vista.noticias.noticia1.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[3]);
        }else if(not=="cine"&&view.getId() == vista.noticias.noticia2.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[4]);
        }else if(not=="cine"&&view.getId() == vista.noticias.noticia3.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[5]);
        }else if(not=="tecnologia"&&view.getId() == vista.noticias.noticia1.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[6]);
        }else if(not=="tecnologia"&&view.getId() == vista.noticias.noticia2.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[7]);
        }else if(not=="tecnologia"&&view.getId() == vista.noticias.noticia3.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[8]);
        }else if(not=="turismo"&&view.getId() == vista.noticias.noticia1.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[9]);
        }else if(not=="turismo"&&view.getId() == vista.noticias.noticia2.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[10]);
        }else if(not=="turismo"&&view.getId() == vista.noticias.noticia3.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[11]);
        }else if(not=="arte"&&view.getId() == vista.noticias.noticia1.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[12]);
        }else if(not=="arte"&&view.getId() == vista.noticias.noticia2.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[13]);
        }else if(not=="arte"&&view.getId() == vista.noticias.noticia3.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[14]);
        }else if(not=="politica"&&view.getId() == vista.noticias.noticia1.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[15]);
        }else if(not=="politica"&&view.getId() == vista.noticias.noticia2.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[16]);
        }else if(not=="politica"&&view.getId() == vista.noticias.noticia3.getId()){
            vista.cambiarFragment(3);
            vista.inforNot.txtNoticia.setText(noticias[17]);
        }


    }

    @Override
    public void onFocusChange(View view, boolean b) {

    }
}
