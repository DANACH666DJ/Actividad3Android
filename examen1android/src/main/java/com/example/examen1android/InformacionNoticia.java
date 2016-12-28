package com.example.examen1android;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InformacionNoticia extends Fragment {
    Button btnNoticias ;
    TextView txtNoticia;


    public InformacionNoticia() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_informacion_noticia, container, false);

        btnNoticias=(Button)v.findViewById(R.id.btnNoticias);
        txtNoticia=(TextView) v.findViewById(R.id.txtNoticia);




        return v;
    }

}
