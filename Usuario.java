package org.adaitw.botcondb.model;

public class Usuario {
    private int id;
    private String nombres;
    private String apellidos;
    private String nombre_usuario;
    private double contraseña;
    private String mail;
    private double celular;

    public Usuario(int id, String nombres, String apellidos, String nombre_usuario, double contraseña, String mail, double celular) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
        this.mail = mail;
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public double getContraseña() {
        return contraseña;
    }

    public void setContraseña(double contraseña) {
        this.contraseña = contraseña;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getCelular() {
        return celular;
    }

    public void setCelular(double celular) {
        this.celular = celular;
    }
}