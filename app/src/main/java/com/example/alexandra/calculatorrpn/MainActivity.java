package com.example.alexandra.calculatorrpn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView Cajatexto;
    private Button Botoncero,Botonuno,Botondos,Botontres,Botoncuatro,Botoncinco,Botonseis,Botonsiete,Botonocho,Botonnueve;
    private double opeacion1, operacion2, resultado;
    private int ope;
    private static  String historial;
    public static  String v1 = "";
    public static String v2 = "";
    public static String v3 = "";
    public static String v4 = "";
    public static String v5 = "";
    public static String v6 = "";
    public static String v7 = "";
    public static String v8 = "";
    public static String v9 = "";
    public static String v10 = "";
    public static String newop;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cajatexto = (TextView) findViewById(R.id.texto1);
        Botoncero = (Button) findViewById(R.id.button_cero);
        Botoncero.setOnClickListener(this);
        Botonuno = (Button) findViewById(R.id.button_uno);
        Botonuno.setOnClickListener(this);
        Botondos = (Button) findViewById(R.id.button_dos);
        Botondos.setOnClickListener(this);
        Botontres = (Button) findViewById(R.id.button_tres);
        Botontres.setOnClickListener(this);
        Botoncuatro = (Button) findViewById(R.id.button_cuatro);
        Botoncuatro.setOnClickListener(this);
        Botoncinco = (Button) findViewById(R.id.button_cinco);
        Botoncinco.setOnClickListener(this);
        Botonseis = (Button) findViewById(R.id.button_seis);
        Botonseis.setOnClickListener(this);
        Botonsiete = (Button) findViewById(R.id.button_siete);
        Botonsiete.setOnClickListener(this);
        Botonocho = (Button) findViewById(R.id.button_ocho);
        Botonocho.setOnClickListener(this);
        Botonnueve = (Button) findViewById(R.id.button_nueve);
        Botonnueve.setOnClickListener(this);
        findViewById(R.id.button_mas).setOnClickListener(this);
        findViewById(R.id.button_menos).setOnClickListener(this);
        findViewById(R.id.button_divide).setOnClickListener(this);
        findViewById(R.id.button_multiplica).setOnClickListener(this);
        findViewById(R.id.button_historial).setOnClickListener(this);
        findViewById(R.id.button_borrar).setOnClickListener(this);
        findViewById(R.id.button_igual).setOnClickListener(this);
        findViewById(R.id.button_punto).setOnClickListener(this);
        findViewById(R.id.button_sen).setOnClickListener(this);
        findViewById(R.id.button_cos).setOnClickListener(this);
        findViewById(R.id.button_cot).setOnClickListener(this);
        findViewById(R.id.button_sec).setOnClickListener(this);
        findViewById(R.id.button_csc).setOnClickListener(this);
        findViewById(R.id.button_tan).setOnClickListener(this);
        findViewById(R.id.button_parentesis).setOnClickListener(this);
    }
    public static void Registry(String newop) {
        if (v1.equals("")) v1 = newop;
        else if (v2.equals("")) v2 = newop;
        else if (v3.equals("")) v3 = newop;
        else if (v4.equals("")) v4 = newop;
        else if (v5.equals("")) v5 = newop;
        else if (v6.equals("")) v6 = newop;
        else if (v7.equals("")) v7 = newop;
        else if (v8.equals("")) v8 = newop;
        else if (v9.equals("")) v9 = newop;
        else if (v10.equals("")) v10 = newop;
        else {
            v1 = v2;
            v2 = v3;
            v3 = v4;
            v4 = v5;
            v5 = v6;
            v6 = v7;
            v7 = v8;
            v8 = v9;
            v9 = v10;
            v10 = newop;
        }
    }

    //Metodos de los botones
    @Override
    public void onClick(View view) {
        String captar = Cajatexto.getText().toString();
        switch (view.getId()) {
            case R.id.button_cero:
                captar = captar + "0";
                Cajatexto.setText(captar);

                break;
            case R.id.button_uno:

                captar = captar + "1";
                Cajatexto.setText(captar);
                break;
            case R.id.button_dos:

                captar = captar + "2";
                Cajatexto.setText(captar);
                break;
            case R.id.button_tres:
                captar = captar + "3";
                Cajatexto.setText(captar);
                break;
            case R.id.button_cuatro:
                captar = captar + "4";
                Cajatexto.setText(captar);
                break;
            case R.id.button_cinco:
                captar = captar + "5";
                Cajatexto.setText(captar);
                break;
            case R.id.button_seis:
                captar = captar + "6";
                Cajatexto.setText(captar);
                break;
            case R.id.button_siete:
                captar = captar + "7";
                Cajatexto.setText(captar);
                break;
            case R.id.button_ocho:
                captar = captar + "8";
                Cajatexto.setText(captar);
                break;
            case R.id.button_nueve:
                captar = captar + "9";
                Cajatexto.setText(captar);
                break;
            case R.id.button_punto:
                captar = captar + ".";
                Cajatexto.setText(captar);
                break;
            case R.id.button_cos:
                try {
                    String Aux1 = Cajatexto.getText().toString();
                    opeacion1 = Double.parseDouble(Aux1);
                } catch (NumberFormatException ignored) {
                }
                Cajatexto.setText("Cos(" + opeacion1 + ")");
                ope = 9;
                break;
            case R.id.button_sen:
                try {
                    String Aux1 = Cajatexto.getText().toString();
                    opeacion1 = Double.parseDouble(Aux1);
                } catch (NumberFormatException e) {
                }
                Cajatexto.setText("Sen(" + opeacion1 + ")");
                ope = 8;

                break;
            case R.id.button_tan:

                try {
                    String Aux1 = Cajatexto.getText().toString();
                    opeacion1 = Double.parseDouble(Aux1);
                } catch (NumberFormatException e) {
                }
                Cajatexto.setText("Tan(" + opeacion1 + ")");
                ope = 10;
                break;
            case R.id.button_sec:
                try {
                    String Aux1 = Cajatexto.getText().toString();
                    opeacion1 = Double.parseDouble(Aux1);
                } catch (NumberFormatException e) {
                }
                Cajatexto.setText("Sec(" + opeacion1 + ")");
                ope = 12;
                break;
            case R.id.button_csc:
                try {
                    String Aux1 = Cajatexto.getText().toString();
                    opeacion1 = Double.parseDouble(Aux1);
                } catch (NumberFormatException e) {
                }
                Cajatexto.setText("Csc(" + opeacion1 + ")");
                ope = 11;
                break;
            case R.id.button_cot:
                try {
                    String Aux1 = Cajatexto.getText().toString();
                    opeacion1 = Double.parseDouble(Aux1);
                } catch (NumberFormatException e) {
                }
                Cajatexto.setText("Ctg(" + opeacion1 + ")");
                ope = 13;
                break;
            case R.id.button_igual:
                try {
                    String Aux2 = Cajatexto.getText().toString();
                    operacion2 = Double.parseDouble(Aux2);
                } catch (NumberFormatException e) {
                }
                Cajatexto.setText("");
                if (ope == 1) {
                    resultado = opeacion1 + operacion2;
                    historial = "" + opeacion1 + " + " + operacion2 + "=" + resultado;
                    Registry(historial);


                } else if (ope == 2) {
                    resultado = opeacion1 - operacion2;
                    historial = "" + opeacion1 + " - " + operacion2 + "=" + resultado;
                    Registry(historial);
                } else if (ope == 3) {
                    resultado = opeacion1 * operacion2;
                    historial = "" + opeacion1 + " * " + operacion2 + "=" + resultado;
                    Registry(historial);
                } else if (ope == 4) {
                    if (operacion2 == 0) {
                        Cajatexto.setText("Error");
                    } else {
                        resultado = opeacion1 / operacion2;
                        historial = "" + opeacion1 + " + " + operacion2 + "=" + resultado;
                        Registry(historial);
                    }
                } else if (ope == 5) {
                    resultado = Math.pow(opeacion1, operacion2);
                    historial = "" + opeacion1 + " ^ " + operacion2 + "=" + resultado;
                    Registry(historial);
                } else if (ope == 6) {
                    resultado = operacion2 * (opeacion1 / 100.0);
                    historial = "% " + opeacion1 + " = " + resultado;
                    Registry(historial);
                } else if (ope == 7) {
                    resultado = Math.sqrt(opeacion1);
                    historial = "√ " + opeacion1 + " = " + resultado;
                    Registry(historial);
                } else if (ope == 8) {
                    double rad = Math.toRadians(opeacion1);
                    resultado = (Math.sin(rad));
                    historial = "Sin (" + opeacion1 + ") = " + resultado;
                    Registry(historial);
                } else if (ope == 9) {
                    double rad = Math.toRadians(opeacion1);
                    resultado = (Math.cos(rad));
                    historial = "Cos (" + opeacion1 + ") = " + resultado;
                    Registry(historial);
                } else if (ope == 10) {
                    double rad = Math.toRadians(opeacion1);
                    resultado = (Math.tan(rad));
                    historial = "Tan (" + opeacion1 + ") = " + resultado;
                    Registry(historial);

                } else if (ope == 11) {
                    double angulo = (Math.asin(opeacion1));
                    resultado = Math.toDegrees(angulo);
                    historial = "Csc (" + opeacion1 + ") = " + resultado;
                    Registry(historial);
                } else if (ope == 12) {
                    double angulo = (Math.acos(opeacion1));
                    resultado = Math.toDegrees(angulo);
                    historial = "Sec (" + opeacion1 + ") = " + resultado;
                    Registry(historial);
                } else if (ope == 13) {
                    double angulo = (Math.atan(opeacion1));
                    resultado = Math.toDegrees(angulo);
                    historial = "Cot (" + opeacion1 + ") = " + resultado;
                    Registry(historial);
                } else if (ope == 14) {
                    resultado = 1;
                    for (double i = opeacion1; i > 1; i--) {
                        resultado = resultado * 1;
                        Registry(historial);

                    }
                }
                Cajatexto.setText("" + resultado);
                opeacion1 = resultado;
                historial = "x! (" + opeacion1 + ") = " + resultado;

                break;

            case R.id.button_borrar:
                Cajatexto.setText("");
                opeacion1 = 0.0;
                operacion2 = 0.0;
                resultado = 0.0;
                break;

            case R.id.button_multiplica:
                try {
                    String Aux1 = Cajatexto.getText().toString();
                    opeacion1 = Double.parseDouble(Aux1);
                } catch (NumberFormatException e) {
                }
                Cajatexto.setText("");
                ope = 3;
                break;
            case R.id.button_mas:
                try {
                    String Aux1 = Cajatexto.getText().toString();
                    opeacion1 = Double.parseDouble(Aux1);
                } catch (NumberFormatException e) {
                }
                Cajatexto.setText("");
                ope = 1;
                break;
            case R.id.button_divide:
                try {
                    String Aux1 = Cajatexto.getText().toString();
                    opeacion1 = Double.parseDouble(Aux1);
                } catch (NumberFormatException e) {
                }
                Cajatexto.setText("");
                ope = 4;
                break;
            case R.id.button_menos:
                try {
                    String Aux1 = Cajatexto.getText().toString();
                    opeacion1 = Double.parseDouble(Aux1);
                } catch (NumberFormatException e) {
                }
                Cajatexto.setText("");
                ope = 2;
                break;


            case R.id.button_parentesis:

                try {
                    String Aux1 = Cajatexto.getText().toString();
                    opeacion1 = Double.parseDouble(Aux1);
                } catch (NumberFormatException e) {
                }
                Cajatexto.setText("(" + opeacion1 + ")");
                break;
            case R.id.button_historial:
                Intent Horizontal = new Intent(MainActivity.this, Historial.class);
                startActivity(Horizontal);
                break;


        }
    }
}
