package com.devf.intententreaplicaciones;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Actividad1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_entre_aplicaciones);
        Button button1 = (Button)findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent intent = new Intent(Actividad1.this, actividad2.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Estas en la actividad2", Toast.LENGTH_SHORT).show();
            }







        });

    }


}
