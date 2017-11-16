package com.example.wen.proyectoandroidsabado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainRegistroActivity extends AppCompatActivity {
    private EditText etcodigo;
    private EditText etmodelo;
    private EditText etcantidad;
    private EditText etmarca;
    private EditText etprecio;
    private Button btn_guardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_registro);


        btn_guardar = (Button) findViewById(R.id.btn_guardar);

        btn_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainRegistroActivity.this, MainListaActivity.class);
                etcodigo = (EditText) findViewById(R.id.et_codigo);
                etmodelo = (EditText) findViewById(R.id.et_modelo);
                etcantidad = (EditText) findViewById(R.id.et_cantidad);
                etmarca = (EditText) findViewById(R.id.et_marca);
                etprecio = (EditText) findViewById(R.id.et_precio);

                intent.putExtra("codigo",String.valueOf(etcodigo.getText()));
                intent.putExtra("modelo",String.valueOf(etmodelo.getText()));
                intent.putExtra("cantidad",String.valueOf(etcantidad.getText()));
                intent.putExtra("marca",String.valueOf(etmarca.getText()));
                intent.putExtra("precio",String.valueOf(etprecio.getText()));

                etcodigo.setText("");
                etmodelo.setText("");
                etcantidad.setText("");
                etmarca.setText("");
                etprecio.setText("");

                startActivity(intent);
            }
        });

    }

    public void volvermenu(View view) {
        finish();
    }
}
