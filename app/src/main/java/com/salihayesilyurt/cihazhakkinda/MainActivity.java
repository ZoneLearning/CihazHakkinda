package com.salihayesilyurt.cihazhakkinda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_camera;
    private TextView tv_info;
    private Button btn_cihazOzellikleri;
    private Button btn_cihazApi;
    private Button btn_call;
    private EditText et_call;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();


        Camera camera = new Camera(this, tv_info, btn_camera);
        TumOzellikler tumOzellikler = new TumOzellikler(this,tv_info,btn_cihazOzellikleri);
        CihazAPI cihazAPI = new CihazAPI(this,tv_info,btn_cihazApi);
        AramaYap aramaYap = new  AramaYap(this,et_call,btn_call);

    }

    private void initialize() {

        tv_info = (TextView) findViewById(R.id.tv_info);
        btn_camera = (Button) findViewById(R.id.btn_click);
        btn_cihazOzellikleri = (Button) findViewById(R.id.btn_cihaz_ozellikleri);
        btn_cihazApi = (Button) findViewById(R.id.btn_cihaz_api);
        et_call = (EditText) findViewById(R.id.et_phone);
        btn_call = (Button) findViewById(R.id.btn_call);
    }

}
