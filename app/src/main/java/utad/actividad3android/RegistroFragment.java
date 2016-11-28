package utad.actividad3android;


import android.os.Bundle;
import android.os.Debug;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegistroFragment extends Fragment {

    public TextView texto;
    public Button btnLogin;


    public RegistroFragment() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        View v=inflater.inflate(R.layout.fragment_registro, container, false);
        texto=(TextView) v.findViewById(R.id.textoRegistro);
        btnLogin=(Button)v.findViewById(R.id.buttonLogin);



        return v;



    }

}
