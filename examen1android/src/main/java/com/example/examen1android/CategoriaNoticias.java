package com.example.examen1android;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoriaNoticias extends Fragment {
    Button btnDeportes ;
    Button btnTurismo;
    Button btnTecnologia;
    Button btnArte;
    Button btnPolitica;
    Button btnCine;


    public CategoriaNoticias() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_categoria_noticias, container, false);

        btnDeportes=(Button)v.findViewById(R.id.btnDeportes);
        btnTurismo=(Button)v.findViewById(R.id.btnTurismo);
        btnTecnologia=(Button) v.findViewById(R.id.btnTecnologia);
        btnArte=(Button) v.findViewById(R.id.btnArte);
        btnPolitica=(Button) v.findViewById(R.id.btnPolitica);
        btnCine=(Button) v.findViewById(R.id.btnCine);



        return v;
    }

}
