package com.example.alexandra.calculatorrpn;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.alexandra.calculatorrpn.MainActivity.v1;
import static com.example.alexandra.calculatorrpn.MainActivity.v10;
import static com.example.alexandra.calculatorrpn.MainActivity.v2;
import static com.example.alexandra.calculatorrpn.MainActivity.v3;
import static com.example.alexandra.calculatorrpn.MainActivity.v4;
import static com.example.alexandra.calculatorrpn.MainActivity.v5;
import static com.example.alexandra.calculatorrpn.MainActivity.v6;
import static com.example.alexandra.calculatorrpn.MainActivity.v7;
import static com.example.alexandra.calculatorrpn.MainActivity.v8;
import static com.example.alexandra.calculatorrpn.MainActivity.v9;

public class Historial extends AppCompatActivity{

    private TextView posicion1,posicion2,posicion3, posicion4,posicion6,posicion5,posicion7,posicion8,posicion9,posicion10 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);
        Button borrar = (Button) findViewById(R.id.borrarhistorial);


        posicion1 = (TextView) findViewById(R.id.Posicion1);
        posicion2 = (TextView) findViewById(R.id.Posicion2);
        posicion3 = (TextView) findViewById(R.id.Posicion3);
        posicion4 = (TextView) findViewById(R.id.Posicion4);
        posicion5 = (TextView) findViewById(R.id.Posicion5);
        posicion6 = (TextView) findViewById(R.id.Posicion6);
        posicion7 = (TextView) findViewById(R.id.Posicion7);
        posicion8 = (TextView) findViewById(R.id.Posicion8);
        posicion9 = (TextView) findViewById(R.id.Posicion9);
        posicion10 = (TextView) findViewById(R.id.Posicion10);
        posicion1.setText(""+v1);
        posicion2.setText(""+v2);
        posicion3.setText(""+v3);
        posicion4.setText(""+v4);
        posicion5.setText(""+v5);
        posicion6.setText(""+v6);
        posicion7.setText(""+v7);
        posicion8.setText(""+v8);
        posicion9.setText(""+v9);
        posicion10.setText(""+v10);


        borrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                posicion1.setText("");
                posicion2.setText("");
                posicion3.setText("");
                posicion4.setText("");
                posicion5.setText("");
                posicion6.setText("");
                posicion7.setText("");
                posicion8.setText("");
                posicion9.setText("");
                posicion10.setText("");
                Toast.makeText(Historial.this, "Ready, History deleted ", Toast.LENGTH_SHORT).show();
            }
        });


    }

}
