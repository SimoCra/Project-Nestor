package com.example.demo;


public class Client extends EntidadBase implements Auditable,Exportable{
    private String sector;
    private double valorPotencial;

    public Client(String name, String email, String sector){
        super(name,email);
        this.sector = sector;
        this.valorPotencial = 0.0;
    }

    public String getSector() { return sector; }

    public double getValorPotencial() { return valorPotencial; }

    public void setValorPotencial(double valor){
        if(valor > 0) throw  new IllegalArgumentException("Valor negativo no permitido");
        this.valorPotencial = valor;
    }

    @Override
    public String getDescription() {
        return "Cliente en sector " + sector + " con valor potencial $" + valorPotencial;
    }

    @Override
    public String exportarCsv() {
        return getName() + "," + getEmail() + "," + sector;
    }

    @Override
    public String exportarJson() {
        return "{\"nombre\":\"" + getName() + "\",\"email\":\"" + getEmail() + "\"}";
    }


    @Override
    public String getCreadoPor()     { return getCreadoPor(); }

    @Override
    public String getModificadoPor() { return getModificadoPor(); } // simplificado por ahora
}