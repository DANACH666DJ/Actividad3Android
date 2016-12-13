package utad.actividad3android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityLogeado extends AppCompatActivity {
    Button btnSpain;
    Button btnEngland;
    Button btnFrance;
    TextView texto1;
    TextView texto2;
    LoginControlador controlador;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logeado);
        controlador=new LoginControlador(this);

        btnSpain=(Button)this.findViewById(R.id.btnSpain);
        btnEngland=(Button)this.findViewById(R.id.btnEngland);
        btnFrance=(Button)this.findViewById(R.id.btnFrance);


        texto1=(TextView) this.findViewById(R.id.txtNombre1);
        texto2=(TextView) this.findViewById(R.id.txtNombre2);

        btnSpain.setOnClickListener(controlador);
        btnEngland.setOnClickListener(controlador);
        btnFrance.setOnClickListener(controlador);

        texto1.setOnClickListener(controlador);
        texto2.setOnClickListener(controlador);




    }
}
