package com.example.wen.proyectoandroidsabado;

public class Producto {
    private String codigo;
    private String modelo;
    private String cantidad;
    private String marca;
    private String precio;

    public Producto(String codigo, String modelo, String cantidad, String marca, String precio) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.cantidad = cantidad;
        this.marca = marca;
        this.precio = precio;
    }

    public Producto() {
        codigo="";
        modelo="";
        cantidad="";
        marca="";
        precio="";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
