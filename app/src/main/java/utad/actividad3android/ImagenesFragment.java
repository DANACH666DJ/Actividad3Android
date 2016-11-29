package utad.actividad3android;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImagenesFragment extends Fragment {
    public ImageView imagen1;
    public ImageView imagen2;
    public ImageView imagen3;
    public TimerTask timerTask;
    public Timer timer;
    public MainActivity mainActivity;

    public ImagenesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mainActivity=(MainActivity)getActivity();
        // Inflate the layout for this fragment
        Log.v("ImagenesFragment","000000HOLA!!!! ");
        View v=inflater.inflate(R.layout.fragment_imagenes, container, false);
        imagen1=(ImageView) v.findViewById(R.id.imagen1);
        imagen2=(ImageView) v.findViewById(R.id.imagen2);
        imagen3=(ImageView) v.findViewById(R.id.imagen3);

        timerTask=new TimerTask() {
            @Override
            public void run() {

                getActivity().runOnUiThread(new Runnable(){
                    public void run() {
                        Log.v("ImagenesFragment","HOLA!!!! ");
                        if(imagen1.getVisibility()==View.VISIBLE){
                            imagen1.setVisibility(View.INVISIBLE);
                            imagen2.setVisibility(View.VISIBLE);
                        }else if(imagen2.getVisibility()==View.VISIBLE){
                            imagen2.setVisibility(View.INVISIBLE);
                            imagen3.setVisibility(View.VISIBLE);
                        }else if(imagen3.getVisibility()==View.VISIBLE){
                            timer.cancel();
                            mainActivity.cambiarFragment(2);
                        }
                    }
                });

            }
        };
        timer=new Timer();
        /* El primer parametro es la tarea que queremos que ejecute en este caso la que tenemos en el run
        el segundo parametro significa el tiempo que tarda en ejecutar el run y el tercer parametro
        significa cada cuanto tiempo realiza la tarea*/
        timer.schedule(timerTask,2000,2000);


        return v;

    }

}
