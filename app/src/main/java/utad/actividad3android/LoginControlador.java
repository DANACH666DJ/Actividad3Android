package utad.actividad3android;

import android.view.View;

import com.quickblox.core.model.QBBaseCustomObject;
import com.quickblox.users.model.QBUser;

import java.util.ArrayList;
import java.util.HashMap;

import utad.libreria.QBAdmin;
import utad.libreria.QBAdminListener;

/**
 * Created by asus on 13/12/2016.
 */

public class LoginControlador implements View.OnClickListener, View.OnFocusChangeListener, QBAdminListener {
    ActivityLogeado vista;
    QBAdmin qbAdmin;


    public LoginControlador(ActivityLogeado vista) {
        this.vista= vista;
        qbAdmin = new QBAdmin(this, vista);
    }


    @Override
    public void onClick(View view) {



    }

    @Override
    public void onFocusChange(View view, boolean b) {

    }

    @Override
    public void logeado(boolean logeado, QBUser user) {

    }

    @Override
    public void registrado(boolean registrado, QBUser user) {

    }

    @Override
    public void datosDescargados(ArrayList<QBBaseCustomObject> datos) {

    }

    @Override
    public void datosTablaIdiomaDescargados(HashMap<Integer, String> p) {

    }
}
