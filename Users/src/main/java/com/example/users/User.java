package com.example.users;

import javafx.beans.property.SimpleStringProperty;

public class User {
    private SimpleStringProperty ime,prezime,e_mail,korisnickoIme,lozinka;

    public User() {
        ime = new SimpleStringProperty("");
        prezime = new SimpleStringProperty("");
        e_mail = new SimpleStringProperty("");
        korisnickoIme = new SimpleStringProperty("");
        lozinka = new SimpleStringProperty("");
    }

    public User(String ime, String prezime, String e_mail, String korisnickoIme, String lozinka) {
        this.ime = new SimpleStringProperty(ime);
        this.prezime = new SimpleStringProperty(prezime);
        this.e_mail = new SimpleStringProperty(e_mail);
        this.korisnickoIme = new SimpleStringProperty(korisnickoIme);
        this.lozinka = new SimpleStringProperty(lozinka);
    }

    public String getIme() {
        return ime.get();
    }

    public SimpleStringProperty imeProperty() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime.set(ime);
    }

    public String getPrezime() {
        return prezime.get();
    }

    public SimpleStringProperty prezimeProperty() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime.set(prezime);
    }

    public String getE_mail() {
        return e_mail.get();
    }

    public SimpleStringProperty e_mailProperty() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail.set(e_mail);
    }

    public String getKorisnickoIme() {
        return korisnickoIme.get();
    }

    public SimpleStringProperty korisnickoImeProperty() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme.set(korisnickoIme);
    }

    public String getLozinka() {
        return lozinka.get();
    }

    public SimpleStringProperty lozinkaProperty() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka.set(lozinka);
    }

    @Override
    public String toString(){
        return ime.get() + " " + prezime.get();
    }
}
