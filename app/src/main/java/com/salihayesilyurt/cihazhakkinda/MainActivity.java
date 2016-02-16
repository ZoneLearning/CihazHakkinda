package com.salihayesilyurt.cihazhakkinda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_camera;
    private TextView tv_info;
    private Button btn_cihazOzellikleri;
    private Button btn_cihazApi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_info = (TextView) findViewById(R.id.tv_info);
        btn_camera = (Button) findViewById(R.id.btn_click);
        btn_cihazOzellikleri = (Button) findViewById(R.id.btn_cihaz_ozellikleri);
        btn_cihazApi = (Button) findViewById(R.id.btn_cihaz_api);

        Camera camera = new Camera(this, tv_info, btn_camera);

    }

}
