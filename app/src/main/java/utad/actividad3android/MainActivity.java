package utad.actividad3android;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
     TextFragment testFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm=getSupportFragmentManager();
        testFragment=(TextFragment)fm.findFragmentById(R.id.MiFragmento);
        FragmentTransaction transaction=fm.beginTransaction();
        transaction.hide(testFragment);
        transaction.show(testFragment);
        transaction.commit();




    }
}
