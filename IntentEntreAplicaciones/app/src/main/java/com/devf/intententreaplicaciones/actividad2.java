package com.devf.intententreaplicaciones;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by braulioalejandroramirez on 21/05/16.
 */
public class actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad2);
        Button button2 = (Button)findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(actividad2.this, Actividad1.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Estas en la actividad1", Toast.LENGTH_LONG).show();

            }







        });

    }


}
