package utad.libreria;

import com.quickblox.core.model.QBBaseCustomObject;
import com.quickblox.users.model.QBUser;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by asus on 29/11/2016.
 */

public interface QBAdminListener {


    public void logeado(boolean logeado, QBUser user);
    public void registrado(boolean registrado, QBUser user);
    public void datosDescargados(ArrayList<QBBaseCustomObject>datos);
    public void datosTablaIdiomaDescargados(HashMap<Integer,String> p);

}
