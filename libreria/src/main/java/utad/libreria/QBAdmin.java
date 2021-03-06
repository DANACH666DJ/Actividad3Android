package utad.libreria;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.util.Log;
import android.widget.Toast;

import com.quickblox.auth.QBAuth;
import com.quickblox.auth.model.QBSession;
import com.quickblox.core.QBEntityCallback;
import com.quickblox.core.QBSettings;
import com.quickblox.core.exception.QBResponseException;
import com.quickblox.core.model.QBBaseCustomObject;
import com.quickblox.core.request.QBRequestBuilder;
import com.quickblox.core.request.QBRequestGetBuilder;
import com.quickblox.customobjects.QBCustomObjects;
import com.quickblox.customobjects.model.QBCustomObject;
import com.quickblox.users.QBUsers;
import com.quickblox.users.model.QBUser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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

    public void Registro(String nombre, String email, String contraseña,  String repetirContraseña) {

        final QBUser users = new QBUser(nombre, contraseña,repetirContraseña);

        users.setEmail(email);
        users.setFullName(nombre);

        if(contraseña.equals(repetirContraseña)) {


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

        }else{

            Log.v("Controller", "Las contraseñas no son iguales");
        }


    }


    public void selectTablaIdiomas(String id_idioma) {

        QBRequestGetBuilder requestBuilder =new QBRequestGetBuilder();

        requestBuilder.eq("IdIdioma",id_idioma);

        QBCustomObjects.getObjects("Idiomas",requestBuilder ,new QBEntityCallback<ArrayList <QBCustomObject>>(){
            @Override
            public void onSuccess(ArrayList<QBCustomObject> customObjects, Bundle params) {
                HashMap<Integer,String> palabras=new HashMap<Integer, String>();
                for (int i=0;i<customObjects.size();i++){
                    Log.v("QBAdmin","Fila"+i+" "+customObjects.get(i).getFields());
                    String sValor=customObjects.get(i).getFields().get("Valor").toString();
                    int iPalabra=(int)customObjects.get(i).getFields().get("IdPalabra");

                    palabras.put(iPalabra,sValor);
                }

                listener.datosTablaIdiomaDescargados(palabras);
            }

            @Override
            public void onError(QBResponseException errors) {

            }
        });

        }



}
