package com.example.examen1android;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Login extends Fragment {
    public TextView txtUsuario;
    public TextView txtPassword;
    public EditText usuario;
    public EditText contraseña;
    public Button btnRegistro;
    public Button btnOkLogin;
    public Button btnSpain;
    public Button btnEngland;
    public Button btnFrance;


    public Login() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_login, container, false);
        usuario=(EditText)v.findViewById(R.id.usuario);
        contraseña=(EditText)v.findViewById(R.id.contraseña);
        btnRegistro=(Button)v.findViewById(R.id.botonRegistro);
        btnOkLogin=(Button)v.findViewById(R.id.btnOkLogin);
        btnSpain=(Button)v.findViewById(R.id.btnSpain);
        btnFrance=(Button)v.findViewById(R.id.btnFrance);
        btnEngland=(Button)v.findViewById(R.id.btnEngland);
        txtUsuario=(TextView)v.findViewById(R.id.txtUsuario);
        txtPassword=(TextView)v.findViewById(R.id.txtPassword);
        return v;
    }

}
