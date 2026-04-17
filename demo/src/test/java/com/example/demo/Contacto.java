package com.example.demo;

public class Contacto extends EntidadBase{
    private String cargo;
    private Client empresaAsociada;

    public Contacto(String name, String email, String cargo, Client empresa){
        super(name,email);
        this.cargo = cargo;
        this.empresaAsociada = empresa;
    }

    public String getCargo() { return cargo; }

    public Client getEmpresaAsociada() { return empresaAsociada; }

    @Override
    public String getDescription() {
        return cargo + " en " + empresaAsociada.getName();
    }
}
