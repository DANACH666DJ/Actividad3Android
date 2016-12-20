package com.example.examen1android;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Registro registroFragment;
    Login loginFragment;
    Button btnLogin ;
    Button btnRegistro;
    Button btnOkLogin;
    Button btnOkRegistro;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
