package com.example.examen1android;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Noticias extends Fragment {
    Button noticia1 ;
    Button noticia2;
    Button noticia3;


    public Noticias() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_noticias, container, false);

        noticia1=(Button)v.findViewById(R.id.btnNoticia1);
        noticia2=(Button)v.findViewById(R.id.btnNoticia2);
        noticia3=(Button) v.findViewById(R.id.btnNoticia3);



        return v;
    }

}
