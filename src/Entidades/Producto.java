/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author CCMEW
 */
public class Producto {
    private int codigo;
    private String descripcion;
    private int stock;
    private double precio;
    private Rubro categoria;

    public Producto() {
        
    }

    public Producto(int codigo, String descripcion, double precio, Rubro rubro, int stock) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Producto(int codigo, String descripcion, double precio, String categoria, int stock) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Rubro getCategoria() {
        return categoria;
    }

    public void setCategoria(Rubro categoria) {
        this.categoria = categoria;
    }

   


    public Producto(int codigo, String descripcion, int stock, int precio, Rubro categoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.categoria = categoria;
    }

   
    }

