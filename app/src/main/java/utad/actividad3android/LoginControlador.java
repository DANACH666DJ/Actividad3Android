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

    }

    @Override
    public void registrado(boolean registrado, QBUser user) {

    }

    @Override
    public void datosDescargados(ArrayList<QBBaseCustomObject> datos) {

    }

    @Override
    public void datosTablaIdiomaDescargados(HashMap<Integer, String> p) {
        vista.texto1.setText(p.get(1));
        vista.texto2.setText(p.get(2));
        vista.btnFrance.setText(p.get(3));
        vista.btnEngland.setText(p.get(4));
        vista.btnSpain.setText(p.get(5));


    }
}
