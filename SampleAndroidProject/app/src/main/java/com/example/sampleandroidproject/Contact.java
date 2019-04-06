package com.example.sampleandroidproject;

import java.io.Serializable;

public class Contact implements Serializable {
    public String namesurname;
    public String idno;
    public String email;
    public String telephone;
    public String image;

    public Contact(String namesurname, String idno, String email, String telephone, String image) {
        this.namesurname = namesurname;
        this.idno = idno;
        this.email = email;
        this.telephone = telephone;
        this.image = image;
    }
}
