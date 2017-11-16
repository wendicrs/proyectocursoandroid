package com.example.wen.proyectoandroidsabado;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_registrar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_registrar = (Button) findViewById(R.id.btnRegistrar);


        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainRegistroActivity.class);
                startActivity(intent);

            }
        });


    }


    public void verlista(View view) {
        Intent intent = new Intent(this, MainListaActivity.class);
        startActivity(intent);
    }
}
