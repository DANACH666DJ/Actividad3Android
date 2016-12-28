package com.example.examen1android;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Registro registroFragment;
    Login loginFragment;
    Button btnLogin ;
    Button btnRegistro;
    Button btnOkLogin;
    Button btnOkRegistro;
    Button btnSpain;
    Button btnEngland;
    Button btnFrance;
    TextView txtUsuario;
    TextView txtPassword;
    FragmentTransaction transaction;
    Controlador controlador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlador=new Controlador(this);
        FragmentManager fm=getSupportFragmentManager();
        registroFragment=(Registro)fm.findFragmentById(R.id.fragmentRegistro);
        loginFragment=(Login) fm.findFragmentById(R.id.fragmentLogin);

        btnLogin=registroFragment.btnLogin;
        btnLogin.setOnClickListener(controlador);
        btnRegistro=loginFragment.btnRegistro;
        btnRegistro.setOnClickListener(controlador);

        btnOkLogin=loginFragment.btnOkLogin;
        btnOkLogin.setOnClickListener(controlador);

        btnOkRegistro=registroFragment.btnOkRegistro;
        btnOkRegistro.setOnClickListener(controlador);


        btnEngland=loginFragment.btnEngland;
        btnEngland.setOnClickListener(controlador);

        btnSpain=loginFragment.btnSpain;
        btnSpain.setOnClickListener(controlador);

        btnFrance=loginFragment.btnFrance;
        btnFrance.setOnClickListener(controlador);


        txtUsuario=loginFragment.txtUsuario;
        txtUsuario.setOnClickListener(controlador);

        txtPassword=loginFragment.txtPassword;
        txtPassword.setOnClickListener(controlador);

        transaction=fm.beginTransaction();
        cambiarFragment(1);
        //transaction.commit();


    }

    public void cambiarFragment(int ifrg){
        FragmentManager fm=getSupportFragmentManager();
        transaction=fm.beginTransaction();
        transaction.hide(loginFragment);
        transaction.hide(registroFragment);


        if(ifrg==1){
            transaction.show(loginFragment);
        }else if(ifrg==2){
            transaction.show(registroFragment);
        }
        transaction.commit();

    }
}
