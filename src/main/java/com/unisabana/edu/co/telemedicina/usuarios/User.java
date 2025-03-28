package com.unisabana.edu.co.telemedicina.usuarios;

import lombok.Data;

@Data
public class User {

    private String cedula;
    private String password;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
