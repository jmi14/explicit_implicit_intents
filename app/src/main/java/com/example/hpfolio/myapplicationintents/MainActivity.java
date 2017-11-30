package com.example.hpfolio.myapplicationintents;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnImplicit,btnExplicit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnImplicit = (Button)findViewById(R.id.btnImplicit);
        btnExplicit = (Button) findViewById(R.id.btnExplicit);

        btnImplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(implicitIntent);
            }
        });

        btnExplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent explicitIntent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(explicitIntent);
            }
        });
    }
}
