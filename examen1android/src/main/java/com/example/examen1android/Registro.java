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
public class Registro extends Fragment {
    public EditText nombre;
    public EditText email;
    public EditText contraseña;
    public EditText repetirContraseña;
    public Button btnLogin;
    public Button btnOkRegistro;


    public Registro() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_registro, container, false);

        btnLogin=(Button)v.findViewById(R.id.buttonLogin);
        btnOkRegistro=(Button)v.findViewById(R.id.btnOkRegistro);
        nombre=(EditText)v.findViewById(R.id.editTextNombreUsuario);
        email=(EditText)v.findViewById(R.id.editTextEmail);
        contraseña=(EditText)v.findViewById(R.id.editTextContraseña);
        repetirContraseña=(EditText)v.findViewById(R.id.editTextRepetirContraseña);



        return v;
    }

}
