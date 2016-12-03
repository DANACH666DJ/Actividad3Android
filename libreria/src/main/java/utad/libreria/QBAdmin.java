package utad.libreria;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.quickblox.auth.QBAuth;
import com.quickblox.auth.model.QBSession;
import com.quickblox.core.QBEntityCallback;
import com.quickblox.core.QBSettings;
import com.quickblox.core.exception.QBResponseException;
import com.quickblox.users.QBUsers;
import com.quickblox.users.model.QBUser;

/**
 * Created by daniel.garcimartin on 22/11/2016.
 */
public class QBAdmin {
    QBAdminListener listener;
    public String APP_ID;
    public String AUTH_KEY;
    public String AUTH_SECRET;
    public String ACCOUNT_KEY;


    public QBAdmin(QBAdminListener listener, Activity activity) {
        APP_ID = "39315";
        AUTH_KEY = "Tqqq2xKM93KpV5p";
        AUTH_SECRET = "PGGSmqQdtOXerVx";
        ACCOUNT_KEY = "LZzoR8SCau5CmyhPC6xx";
        QBSettings.getInstance().init(activity, APP_ID, AUTH_KEY, AUTH_SECRET);
        QBSettings.getInstance().setAccountKey(ACCOUNT_KEY);
        this.listener = listener;

        QBAuth.createSession(new QBEntityCallback<QBSession>() {

            @Override
            public void onSuccess(QBSession session, Bundle params) {
                // You have successfully created the session
                Log.v("Controller", "Inicio de sesión correcto");
                // Now you can use QuickBlox API!
            }

            @Override
            public void onError(QBResponseException errors) {
                Log.v("Controller", "Inicio de sesión fallido");

            }
        });

    }


    public void Login(String suser, String pass) {
        QBUser users = new QBUser(suser, pass);


        QBUsers.signIn(users, new QBEntityCallback<QBUser>() {

            public void onSuccess(QBUser user, Bundle params) {
                listener.logeado(true, user);

            }


            public void onError(QBResponseException errors) {
                listener.logeado(false, null);

            }
        });

    }

    public void Registro(String nombre, String email, final String contraseña, final String repetirContraseña) {

        final QBUser users = new QBUser(nombre, contraseña);

        users.setEmail(email);
        users.setFullName(nombre);


        QBUsers.signUp(users, new QBEntityCallback<QBUser>() {
            @Override

            public void onSuccess(QBUser user, Bundle args) {
                    listener.registrado(true, user);
            }


            @Override
            public void onError(QBResponseException errors) {
                    listener.registrado(false, users);
            }
        });


    }


    public void selectTabla() {
        //listener.datosDescargados();
    }


}
