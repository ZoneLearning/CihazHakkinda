package com.salihayesilyurt.cihazhakkinda;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Saliha Yesilyurt on 17.2.2016.
 */
public class BaseControl implements View.OnClickListener {

    //Bu sınıftan extend edilen sınıflar da protected
    //olanları kullanabilir.
    //Camera sınıfı da TumOzellikler sınıfı da üç tane aynı parametreyi alıyor.
    //Yani ortak tipte değişkenleri var. O zaman bunları kullanan bir sınıf yazalım
    // ve her iki ya da ne kadar sınıf  varsa hepsi bunu extend edip, kendine göre şekillendirsin.

    protected Button btn;
    protected TextView tv_info;
    Context c;

    public BaseControl(Context context, TextView text, Button button) {

        c = context;
        tv_info = text;
        btn = button;

        btn.setOnClickListener(this);
    }

    //BaseControl sınıfı aynı zamanda clickListener'ı implement ettiği için onu extend edenler ya bunu kullanacak
    // ya da bu onClick() metodunu oveerride edip kendilerine göre düzenleyecek.
    @Override
    public void onClick(View view) {

    }
}

