package com.devf.intentprueba;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class IntentPrueba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_prueba);
        Button button1= (Button)findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View v) {
                                       String url="http://www.ruthymar.com";
                                       Intent intent = new Intent(Intent.ACTION_VIEW);
                                       intent.setData(Uri.parse(url));
                                       startActivity(intent);

                                       }
                                   }
        );





    }




}
