package com.fanlat.gpillaca.reproductor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_mp4;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_mp4 = (Button) findViewById(R.id.button_mp4);


        intent = new Intent(MainActivity.this, ReproductorActivity.class);

        button_mp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.putExtra("url","http://link.theplatform.com/s/NGweTC/media/BwldAcyRE7zw");
                intent.putExtra("tipo", "mp4");
                finish();
                startActivity(intent);

            }
        });


    }
}
