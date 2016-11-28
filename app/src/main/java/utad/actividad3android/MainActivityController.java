package utad.actividad3android;

import android.view.View;

/**
 * Created by asus on 28/11/2016.
 */

public class MainActivityController implements View.OnClickListener,View.OnFocusChangeListener{
    MainActivity vista;





    public MainActivityController(MainActivity vista){
        this.vista=vista;

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == vista.btnLogin.getId()) {
            vista.cambiarFragment(3);
            //vista.transaction.commitNow();
        }else if(view.getId()==vista.btnRegistro.getId()){
            vista.cambiarFragment(2);
        }
    }

    @Override
    public void onFocusChange(View view, boolean b) {

    }
}
