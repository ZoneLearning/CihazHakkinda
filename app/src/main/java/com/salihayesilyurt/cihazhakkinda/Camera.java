package com.salihayesilyurt.cihazhakkinda;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by SalihaYesilyurt on 17.2.2016.
 */
public class Camera extends BaseControl {

    /* extends BaseControl dediğimiz anda bunu yazmayı zorunlu kılar. Hata verir.
     Bu sınıfı BaseControl den extend etmişsin ama onun 3 parametreli constructor ı var
     onu belirt diye. super ile BaseControl sınıfının constructor'ını kullanabiliriz.
     IKKAT!! --> zaten biz extends BaseControl dediğimizde hata veriyor. Alt+Enter diyince onu düzeltmemiz için
     create constructor matching super hatasını çıkarıyor. Enter dediğimizde aşağıdaki ifadyi kendisi yazıyor,
     elle yazmanıza gerek yok  */
    public Camera(Context context, TextView text, Button button) {
        super(context, text, button);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        if (v.getId() == btn.getId()) {
            PackageManager packageManager = c.getPackageManager();
            if (packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_FRONT)) {
                tv_info.setText("Haydi selfi çekelim");
            } else {
                tv_info.setText("Kamera yok");
            }

        }


    }
}
