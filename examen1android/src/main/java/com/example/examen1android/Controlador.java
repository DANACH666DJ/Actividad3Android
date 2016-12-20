package com.example.examen1android;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.quickblox.core.model.QBBaseCustomObject;
import com.quickblox.users.model.QBUser;

import java.util.ArrayList;
import java.util.HashMap;

import utad.libreria.QBAdmin;
import utad.libreria.QBAdminListener;

/**
 * Created by asus on 20/12/2016.
 */

public class Controlador implements View.OnClickListener, View.OnFocusChangeListener, QBAdminListener {
    MainActivity vista;
    QBAdmin qbAdmin;


    public Controlador(MainActivity vista) {
        this.vista = vista;
        qbAdmin = new QBAdmin(this, vista);

    }


    @Override
    public void onClick(View view) {
        if (view.getId() == vista.btnLogin.getId()) {
            vista.cambiarFragment(1);
            //vista.transaction.commitNow();
        } else if (view.getId() == vista.btnRegistro.getId()) {
            vista.cambiarFragment(2);
        } else if (view.getId() == vista.btnOkLogin.getId()) {
            String usuario = vista.loginFragment.usuario.getText().toString();
            String contraseña = vista.loginFragment.contraseña.getText().toString();
            qbAdmin.Login(usuario, contraseña);
        } else if (view.getId() == vista.btnOkRegistro.getId()) {
            String nombre = vista.registroFragment.nombre.getText().toString();
            String email = vista.registroFragment.email.getText().toString();
            String contraseña = vista.registroFragment.contraseña.getText().toString();
            String repetirContraseña = vista.registroFragment.repetirContraseña.getText().toString();
            qbAdmin.Registro(nombre, email, contraseña, repetirContraseña);
        }


       //Comprobamos los botones de cambiar idiomas y e lo mandamos a qbAdmin
        if(view.getId() == vista.btnEngland.getId()){
            qbAdmin.selectTablaIdiomas("England");

        }else if(view.getId() == vista.btnFrance.getId()){
            qbAdmin.selectTablaIdiomas("France");
        }else if(view.getId() == vista.btnSpain.getId()){
            qbAdmin.selectTablaIdiomas("Spain");

        }

    }

    @Override
    public void onFocusChange(View view, boolean b) {

    }

    @Override
    public void logeado(boolean logeado, QBUser user) {
        if (logeado == true) {
            Log.v("Controller", "Login correcto " + user.getEmail());
            Context context = vista.getApplicationContext();
            CharSequence text = "Se ha logeo correctamente";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            Intent intent = new Intent(vista, SegundoActivity.class);
            vista.startActivity(intent);
            vista.finish();


        } else if (logeado == false) {
            Log.v("Controller", "Login incorrecto ");
            Context context = vista.getApplicationContext();
            CharSequence text = "Nombre o contraseña incorrectos";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }

    }

    @Override
    public void registrado(boolean registrado, QBUser user) {
        if (registrado == true) {
            Log.v("Controller", "Registro correcto ");
            Context context = vista.getApplicationContext();
            CharSequence text = "Registro realizado con exito";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            vista.cambiarFragment(1);
        } else if (registrado == false) {
            Context context = vista.getApplicationContext();
            CharSequence text = "El usuario ya existe ";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

    }

    @Override
    public void datosDescargados(ArrayList<QBBaseCustomObject> datos) {

    }

    @Override
    public void datosTablaIdiomaDescargados(HashMap<Integer, String> p) {
        /*vista.loginFragment.(p.get(1));
        vista.texto2.setText(p.get(2));
        vista.btnFrance.setText(p.get(3));
        vista.btnEngland.setText(p.get(4));
        vista.btnSpain.setText(p.get(5));*/

    }
}
