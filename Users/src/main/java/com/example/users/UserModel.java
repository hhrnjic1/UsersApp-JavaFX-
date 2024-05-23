package com.example.users;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class UserModel {
    private ObservableList<User> lista = FXCollections.observableArrayList();
    private SimpleObjectProperty<User> trenutniKorisnik = new SimpleObjectProperty<>();

    public ObservableList<User> getLista() {
        return lista;
    }

    public void setLista(ObservableList<User> lista) {
        this.lista = lista;
    }

    public User getTrenutniKorisnik() {
        return trenutniKorisnik.get();
    }

    public SimpleObjectProperty<User> trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public void setTrenutniKorisnik(User trenutniKorisnik) {
        this.trenutniKorisnik.set(trenutniKorisnik);
    }

    public void napuni(){
        lista.add(new User("Hamza","Hrnjic","hhrnjic1@etf.unsa.ba","hhrnjic1","hamza123"));
        lista.add(new User("Denan","Poturak","dpoturak1@etf.unsa.ba","dpoturak1","denan123"));
        lista.add(new User("Vedran","Ljubovic","vljubovic1@etf.unsa.ba","vljubovic1","veca123"));
        trenutniKorisnik.set(null);
    }
}
