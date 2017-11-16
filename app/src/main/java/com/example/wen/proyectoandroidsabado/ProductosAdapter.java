package com.example.wen.proyectoandroidsabado;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.ViewHolder>{

    private ArrayList<Producto> datos;

    public ProductosAdapter() {
        datos = new ArrayList<Producto>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_producto, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Producto p = datos.get(position);
        holder.codigoTextView.setText(p.getCodigo());
        holder.modeloTextView.setText(p.getModelo());
        holder.cantidadTextView.setText(p.getCantidad());
        holder.marcaTextView.setText(p.getMarca());
        holder.precioTextView.setText(p.getPrecio());


    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public void colocardatos(ArrayList<Producto> datos) {
        this.datos = datos;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView codigoTextView;
        TextView modeloTextView;
        TextView cantidadTextView;
        TextView marcaTextView;
        TextView precioTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            codigoTextView =(TextView) itemView.findViewById(R.id.TV_codigo);
            modeloTextView =(TextView) itemView.findViewById(R.id.TV_modelo);
            cantidadTextView =(TextView) itemView.findViewById(R.id.TV_cantidad);
            marcaTextView =(TextView) itemView.findViewById(R.id.TV_marca);
            precioTextView =(TextView) itemView.findViewById(R.id.TV_precio);
        }
    }
}
