package epm.senacrs.com.br.receiversms;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by 631110317 on 04/06/16.
 */
public class UsandoIntentService extends IntentService {

    public UsandoIntentService() {
        super("UsandoIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        Log.e("INTENTSERVICE", "onHandleIntent");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("INTENTSERVICE", "onCreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("INTENTSERVICE", "onDestroi");
    }
}
