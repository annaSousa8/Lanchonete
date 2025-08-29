package com.example.atividade;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    String opcoes[] = {"Pão Bola (R$3,00)", "Pão Sírio(R$2,50)", "Pão Integral(R$4,00)"};
    Spinner spnPao = findViewById(R.id.spinner);
    ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
            android.R.layout.simple_spinner_item, opcoes);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spnPao.setAdapter(adapter);

        CheckBox cbCarne = findViewById(R.id.cbCarne);
        CheckBox cbFrango = findViewById(R.id.cbFrango);
        CheckBox cbBacon = findViewById(R.id.cbBacon);
        CheckBox cbCalabresa = findViewById(R.id.cbCalabresa);
        CheckBox cbPresunto = findViewById(R.id.cbPresunto);
        CheckBox cbMussarela = findViewById(R.id.cbMussarela);
        CheckBox cbCheddar = findViewById(R.id.cbCheddar);
        CheckBox cbRequeijao = findViewById(R.id.cbRequeijao);
        CheckBox cbAlface = findViewById(R.id.cbAlface);
        CheckBox cbTomate = findViewById(R.id.cbTomate);
        CheckBox cbMilho = findViewById(R.id.cbMilho);
        CheckBox cbErvilha = findViewById(R.id.cbErvilha);

        TextView txtFinalizar = findViewById(R.id.txtFinalizar);

        Button btnFinalizar = findViewById(R.id.btnFinalizar);
        btnFinalizar.setOnClickListener((View v) -> {
            double valorTotal = 0;

            if(cbCarne.isChecked()){
                valorTotal = valorTotal + 5.0;
            }
            if(cbFrango.isChecked()){
                valorTotal = valorTotal + 4.25;
            }
            if(cbBacon.isChecked()){
                valorTotal = valorTotal + 2.0;
            }
            if(cbCalabresa.isChecked()){
                valorTotal = valorTotal + 2.0;
            }
            if(cbPresunto.isChecked()){
                valorTotal = valorTotal + 1.0;
            }
            if(cbMussarela.isChecked()){
                valorTotal = valorTotal + 1.0;
            }
            if(cbCheddar.isChecked()){
                valorTotal = valorTotal + 1.50;
            }
            if(cbRequeijao.isChecked()){
                valorTotal = valorTotal + 1.0;
            }
            if(cbAlface.isChecked()){
                valorTotal = valorTotal + 0.50;
            }
            if(cbTomate.isChecked()){
                valorTotal = valorTotal + 0.50;
            }
            if(cbMilho.isChecked()){
                valorTotal = valorTotal + 0.50;
            }
            if(cbErvilha.isChecked()){
                valorTotal = valorTotal + 0.50;
            }

            switch (spnPao.getSelectedItemPosition()){
                case 0:
                    valorTotal = valorTotal + 3.0;
                    break;
                case 1:
                    valorTotal = valorTotal + 2.50;
                    break;
                case 2:
                    valorTotal = valorTotal + 4.0;
                    break;
            }

            String total = String.format("Valor total: " + valorTotal);


            txtFinalizar.setText(total);

        });




    }
}