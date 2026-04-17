package com.example.demo;

import lombok.RequiredArgsConstructor;


public abstract class EntidadBase {
    private Long id;
    private String name;
    private String email;
    private boolean activo;

    public EntidadBase(String name, String email){
        this.name = name;
        this.email = email;
        this.activo = true;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public boolean isActivo() { return activo; }

    public void desactivar(boolean activo){
        this.activo = false;
    }

    public abstract String getDescription();
}
