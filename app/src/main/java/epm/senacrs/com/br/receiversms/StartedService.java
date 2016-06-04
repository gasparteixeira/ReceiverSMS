package epm.senacrs.com.br.receiversms;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;


/**
 * Created by 631110317 on 04/06/16.
 */
public class StartedService extends Service {

    @Override
    public IBinder onBind(Intent intent){
        return null;
    }

    public void onCreate() {

    }
}
