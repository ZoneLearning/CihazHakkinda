package com.salihayesilyurt.cihazhakkinda;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by SalihaYesilyurt on 17.2.2016.
 */
public class TumOzellikler extends BaseControl {
    public TumOzellikler(Context context, TextView text, Button button) {
        super(context, text, button);
    }

    @Override
    public void onClick(View view) {
        super.onClick(view);
        if (view.getId() == btn.getId()) {
            PackageManager packageManager = c.getPackageManager();
            FeatureInfo[] featuresList = packageManager.getSystemAvailableFeatures();

            String s="";
            for ( FeatureInfo f: featuresList){

                // + operatoru ile stringleri peş peşe dizebiliyorum
                // Alt satıra geçmek için \n kullanıyorum.
                if(f.name != null){
                    s=s+f.name + "\n";
                }
            }

            tv_info.setText(s);

        }
    }
}
