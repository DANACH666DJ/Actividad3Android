package utad.actividad3android;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.quickblox.core.model.QBBaseCustomObject;
import com.quickblox.users.model.QBUser;

import java.util.ArrayList;

import utad.libreria.QBAdmin;
import utad.libreria.QBAdminListener;

public class MainActivity extends AppCompatActivity  {
     RegistroFragment registroFragment;
     LoginFragment loginFragment;
     ImagenesFragment imgFragment;
     Button btnLogin ;
     Button btnRegistro;
     Button btnOkLogin;
     Button btnOkRegistro;
     FragmentTransaction transaction;
     MainActivityController controlador;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlador=new MainActivityController(this);
        FragmentManager fm=getSupportFragmentManager();
        registroFragment=(RegistroFragment)fm.findFragmentById(R.id.fragmentRegistro);
        loginFragment=(LoginFragment) fm.findFragmentById(R.id.fragmentLogin);
        imgFragment=(ImagenesFragment)fm.findFragmentById(R.id.fragmentImagenes);


        btnLogin=registroFragment.btnLogin;
        btnLogin.setOnClickListener(controlador);
        btnRegistro=loginFragment.btnRegistro;
        btnRegistro.setOnClickListener(controlador);

        btnOkLogin=loginFragment.btnOkLogin;
        btnOkLogin.setOnClickListener(controlador);

        btnOkRegistro=registroFragment.btnOkRegistro;
        btnOkRegistro.setOnClickListener(controlador);

        transaction=fm.beginTransaction();
        cambiarFragment(1);
        //transaction.commit();

    }

    public void cambiarFragment(int ifrg){
        FragmentManager fm=getSupportFragmentManager();
        transaction=fm.beginTransaction();
        transaction.hide(loginFragment);
        transaction.hide(registroFragment);
        transaction.hide(imgFragment);

        if(ifrg==1){
            transaction.show(imgFragment);
        }else if(ifrg==2){
            transaction.show(registroFragment);
        }else if(ifrg==3){
            transaction.show(loginFragment);
        }
        transaction.commit();

    }


}
