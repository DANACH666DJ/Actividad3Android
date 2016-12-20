package com.example.examen1android;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

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


    }
}
