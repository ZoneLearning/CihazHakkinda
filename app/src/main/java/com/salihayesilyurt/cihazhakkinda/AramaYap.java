package com.salihayesilyurt.cihazhakkinda;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by SalihaYesilyurt on 17.2.2016.
 */
public class AramaYap implements View.OnClickListener {

    Context mycallContext;
    EditText et_telNo;
    Button btn_call;

    public AramaYap(Context c, EditText editText, Button button) {
        mycallContext=c ;
        et_telNo = editText;
        btn_call = button;

        btn_call.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String aranacakNo = et_telNo.getText().toString();
        if (v.getId() == btn_call.getId()) {
            try {
                String p = "tel:" + aranacakNo;
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse(p));
                mycallContext.startActivity(callIntent);

            } catch (ActivityNotFoundException e) {
                Log.e("AramaActivity", "Arama Basarisiz", e);
            }
        }

    }

}
