package com.tincio.twitterproject.bean;

/**
 * Created by GMD on 18/02/2017.
 */

public class Contact {

    private String nombre;
    private String iamge;

    public Contact(){}
    public Contact(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIamge() {
        return iamge;
    }

    public void setIamge(String iamge) {
        this.iamge = iamge;
    }
}
