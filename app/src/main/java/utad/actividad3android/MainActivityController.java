package utad.actividad3android;

import android.provider.Settings;
import android.util.Log;
import android.view.View;

import com.quickblox.core.model.QBBaseCustomObject;
import com.quickblox.users.model.QBUser;

import java.util.ArrayList;

import utad.libreria.QBAdmin;
import utad.libreria.QBAdminListener;

/**
 * Created by asus on 28/11/2016.
 */

public class MainActivityController implements View.OnClickListener, View.OnFocusChangeListener, QBAdminListener {
    MainActivity vista;
    QBAdmin qbAdmin;


    public MainActivityController(MainActivity vista) {
        this.vista = vista;
        qbAdmin = new QBAdmin(this, vista);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == vista.btnLogin.getId()) {
            vista.cambiarFragment(3);
            //vista.transaction.commitNow();
        } else if (view.getId() == vista.btnRegistro.getId()) {
            vista.cambiarFragment(2);
        } else if (view.getId() == vista.loginFragment.btnOkLogin.getId()) {
            String usuario = vista.loginFragment.usuario.getText().toString();
            String contraseña = vista.loginFragment.contraseña.getText().toString();
            qbAdmin.Login(usuario, contraseña);
        } else if (view.getId() == vista.registroFragment.btnOkRegistro.getId()) {
            String nombre = vista.registroFragment.nombre.getText().toString();
            String email = vista.registroFragment.email.getText().toString();
            String contraseña = vista.registroFragment.contraseña.getText().toString();
            qbAdmin.Registro(nombre, email, contraseña);


        }
    }

    @Override
    public void onFocusChange(View view, boolean b) {

    }

    @Override
    public void logeado(boolean logeado, QBUser user) {
        if (logeado)
            Log.v("Controller", "HEY SE HA LOGEADO " + user.getEmail());

    }

    @Override
    public void registrado(boolean registrado, QBUser user) {
        if (registrado)
            Log.v("Controller", "HEY SE REGISTRADO " + user.getEmail());

    }

    @Override
    public void datosDescargados(ArrayList<QBBaseCustomObject> datos) {

    }
}
