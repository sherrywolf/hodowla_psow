package com.example.hodowla.service;

import com.example.hodowla.domain.Pies;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class Dane {

    static private List<Pies> db = new ArrayList<Pies>();

    private Pies fixedPies(Pies pies) {
        String imie = pies.getimie().substring(0, 1).toUpperCase() + pies.getimie().substring(1);
        return new Pies(imie, pies.getrok(), pies.getplec(), pies.getzdjUrl());
    }

    public void dodaj(Pies pies) {
        Pies nPies = fixedPies(pies);
        db.add(nPies);
    }

    public void edytuj(Pies pies,int id) {
        Pies ed_pies = fixedPies(pies);
        db.set(id, ed_pies);
    }

    public void usun(int id){
        db.remove(id);
    }

    public void przykladowe_dodaj(){
        Pies pies1 = new Pies("Fafik",2012,"samiec","https://www.cbdzoe.pl/img/artykuly/mowa-ciala-pies-2.jpg");
        db.add(pies1);
        Pies pies2 = new Pies("Lola",2014,"samica","https://www.cbdzoe.pl/img/artykuly/rzeczy-ktore-wie-twoj-pies-artykuly-cbdzoe-02.jpg");
        db.add(pies2);
        Pies pies3 = new Pies("Szarik",2000,"samiec","http://cdn.psy-pies.com/artykuly/psy/duze/kufa-psa-rasy-pies-gorski-z-estrela1585.jpg");
        db.add(pies3);
    }

    public List<Pies> gethodowla() {
        return db;
    }

    }
