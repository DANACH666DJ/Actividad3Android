package utad.actividad3android;

import android.view.View;

/**
 * Created by asus on 28/11/2016.
 */

public class MainActivityController implements View.OnClickListener,View.OnFocusChangeListener{
    MainActivity vista;
    int num;




    public MainActivityController(MainActivity vista){
        this.vista=vista;

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==vista.btnLogin.getId()){
            vista.transaction.show(vista.loginFragment);
            vista.transaction.hide(vista.registroFragment);
            vista.transaction.commitNow();
        }



    }

    @Override
    public void onFocusChange(View view, boolean b) {

    }
}
