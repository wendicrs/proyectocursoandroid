package com.example.wen.proyectoandroidsabado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainListaActivity extends AppCompatActivity {

    private RecyclerView productoRecyclerView;
    private Bundle b;
    private String cod, mod, can, mar, pre;
    private Producto p = new Producto();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lista);

        productoRecyclerView = (RecyclerView) findViewById(R.id.productoRecyclerView);
        productoRecyclerView.setHasFixedSize(true);
        productoRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Producto> datos= new ArrayList<Producto>();

        b=getIntent().getExtras();
        cod=b.getString("codigo");
        mod=b.getString("modelo");
        can=b.getString("cantidad");
        mar=b.getString("marca");
        pre=b.getString("precio");




        //Producto p = new Producto("","","","","");
        p.setCodigo(cod);
        p.setModelo(mod);
        p.setCantidad(can);
        p.setMarca(mar);
        p.setPrecio(pre);
        datos.add(p);



        ProductosAdapter adaptador = new ProductosAdapter();
        adaptador.colocardatos(datos);

        productoRecyclerView.setAdapter(adaptador);


    }
}
