package com.example.activityunitone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ejemplo.micalculadora.CalculadoraSalario;

public class MainActivity extends AppCompatActivity {

    private EditText salarioBaseEditText, horasExtrasEditText, bonificacionEditText;
    private TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salarioBaseEditText = findViewById(R.id.salarioBaseEditText);
        horasExtrasEditText = findViewById(R.id.horasExtrasEditText);
        bonificacionEditText = findViewById(R.id.bonificacionEditText);
        resultadoTextView = findViewById(R.id.resultadoTextView);
        Button calcularButton = findViewById(R.id.calcularButton);

        calcularButton.setOnClickListener(v -> calcularYMostrarSalario());
    }

    private void calcularYMostrarSalario() {
        int salarioBase = Integer.parseInt(salarioBaseEditText.getText().toString());
        int horasExtras = Integer.parseInt(horasExtrasEditText.getText().toString());
        int bonificacion = Integer.parseInt(bonificacionEditText.getText().toString());

        double salarioFinal = CalculadoraSalario.calcularSalario(salarioBase, horasExtras, bonificacion);
        String resultado = getResources().getString(R.string.result)+ salarioFinal;
        resultadoTextView.setText(resultado);
    }
}