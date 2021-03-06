package synoverge.com.utilslib;

import android.content.Context;
import android.net.ConnectivityManager;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by soninait on 5/1/2017.
 */

public class Utility{

    public static boolean isEdtTextEmpty(EditText editText) {
        if (editText.getText().toString().trim().equalsIgnoreCase("")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean chkInternetConnection(Context mContext) {

        ConnectivityManager connectivityManager = (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivityManager.getActiveNetworkInfo() != null
                && connectivityManager.getActiveNetworkInfo().isAvailable()
                && connectivityManager.getActiveNetworkInfo().isConnected()) {

            return true;
        } else {
            return false;
        }
    }

    public static void showToast(Context mContext,String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
    }

    public static void showSnack(View view, String text) {
        Snackbar.make(view, text, Snackbar.LENGTH_LONG).show();
    }

}
