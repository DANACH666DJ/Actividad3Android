package utad.actividad3android;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
     RegistroFragment registroFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm=getSupportFragmentManager();
        registroFragment=(RegistroFragment)fm.findFragmentById(R.id.fragmentRegistro);
        FragmentTransaction transaction=fm.beginTransaction();
        transaction.hide(registroFragment);

        transaction.commit();




    }
}
