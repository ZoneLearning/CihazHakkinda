package com.salihayesilyurt.cihazhakkinda;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by User on 17.2.2016.
 */
public class Camera implements View.OnClickListener {

    private TextView textView;
    private Button btn;
    Context c;

    public Camera (Context context, TextView text, Button button){
        c=context;
        textView=text;
        btn=button;

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == btn.getId()){
            PackageManager packageManager = c.getPackageManager();
            if(packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_FRONT)){
                textView.setText("Haydi selfi çekelim");
            }else{
                textView.setText("Kamera yok");
            }

        }


    }
}
