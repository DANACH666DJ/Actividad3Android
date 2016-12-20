package com.example.examen1android;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {
    CategoriaNoticias categNot;
    Noticias noticias;
    InformacionNoticia inforNot;
    Button btnDeportes ;
    Button btnTurismo;
    Button btnTecnologia;
    Button btnArte;
    Button btnPolitica;
    Button btnCine;
    Button btnVolver;
    Button btnnoticia1;
    Button btnnoticia2;
    Button btnnoticia3;
    Button btnVolverNoticia;
    TextView txtNoticia;

    FragmentTransaction transaction;
    SegundoControlador controlador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        controlador=new SegundoControlador(this);
        FragmentManager fm=getSupportFragmentManager();
        categNot=(CategoriaNoticias) fm.findFragmentById(R.id.fragmentCatNoticias);
        noticias=(Noticias) fm.findFragmentById(R.id.fragmentNoticias);
        inforNot=(InformacionNoticia) fm.findFragmentById(R.id.fragmentInforNoticia);

        btnDeportes=categNot.btnDeportes;
        btnDeportes.setOnClickListener(controlador);

        btnTurismo=categNot.btnTurismo;
        btnTurismo.setOnClickListener(controlador);

        btnTecnologia=categNot.btnTecnologia;
        btnTecnologia.setOnClickListener(controlador);

        btnArte=categNot.btnArte;
        btnArte.setOnClickListener(controlador);

        btnPolitica=categNot.btnPolitica;
        btnPolitica.setOnClickListener(controlador);

        btnCine=categNot.btnCine;
        btnCine.setOnClickListener(controlador);

        btnVolver=categNot.btnVolver;
        btnVolver.setOnClickListener(controlador);

        btnnoticia1=noticias.noticia1;
        btnnoticia1.setOnClickListener(controlador);

        btnnoticia2=noticias.noticia2;
        btnnoticia2.setOnClickListener(controlador);


        btnnoticia3=noticias.noticia3;
        btnnoticia3.setOnClickListener(controlador);

        btnVolverNoticia=inforNot.btnVolver;
        btnVolverNoticia.setOnClickListener(controlador);

        txtNoticia=inforNot.txtNoticia;
        txtNoticia.setOnClickListener(controlador);


        transaction=fm.beginTransaction();
        cambiarFragment(1);
        //transaction.commit();

    }

    public void cambiarFragment(int ifrg){
        FragmentManager fm=getSupportFragmentManager();
        transaction=fm.beginTransaction();
        transaction.hide(categNot);
        transaction.hide(noticias);
        transaction.hide(inforNot);

        if(ifrg==1){
            transaction.show(categNot);
        }else if(ifrg==2){
            transaction.show(noticias);
        }else if(ifrg==3){
            transaction.show(inforNot);
        }
        transaction.commit();

    }
}
