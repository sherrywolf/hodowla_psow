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

    public List<Pies> gethodowla() {
        return db;
    }

    }
