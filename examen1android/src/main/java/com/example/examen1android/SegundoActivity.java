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
    Button btnVolver;

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





    }
}
