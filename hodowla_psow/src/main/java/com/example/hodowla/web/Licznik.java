package com.example.hodowla.web;

import java.io.*;

public class Licznik{
    private int licznik;

    public int getlicznik() { return licznik;}
    public void setlicznik(int licznik) { this.licznik=licznik; }

    public void plus(){ setlicznik(getlicznik()+1); }

    public void zero() { setlicznik(0); }
}