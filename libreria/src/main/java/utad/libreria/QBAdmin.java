package utad.libreria;

import android.app.Activity;
import android.content.Context;

import com.quickblox.core.QBSettings;

/**
 * Created by daniel.garcimartin on 22/11/2016.
 */
public class QBAdmin {
    QBAdminListener listener;
    static final String APP_ID = "39315";
    static final String AUTH_KEY = "Tqqq2xKM93KpV5p";
    static final String AUTH_SECRET = "PGGSmqQdtOXerVx";
    static final String ACCOUNT_KEY = "LZzoR8SCau5CmyhPC6xx";

    public QBAdmin(Activity activity){
        QBSettings.getInstance().init(activity, APP_ID, AUTH_KEY, AUTH_SECRET);
        QBSettings.getInstance().setAccountKey(ACCOUNT_KEY);
    }

    public void QBAdminListener (QBAdminListener listener) {
        this.listener=listener;
    }


    
}
