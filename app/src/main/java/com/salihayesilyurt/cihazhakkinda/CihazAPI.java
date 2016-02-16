package com.salihayesilyurt.cihazhakkinda;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Saliha Yesilyurt on 17.2.2016.
 */
public class CihazAPI extends BaseControl {
    public CihazAPI(Context context, TextView text, Button button) {
        super(context, text, button);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == btn.getId()) {

            tv_info.setText("Bu cihazın API'si : " + Integer.toString(Build.VERSION.SDK_INT));
        }
    }
}
