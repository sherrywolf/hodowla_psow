package hodowla;

import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class Pies {

    private String imie;
    private int rok;
    private String plec;
    private String zdjUrl;

    public Pies() {
        super();
    }

    public Pies(String imie, int rok, String plec, String zdjUrl) {
        super();

        this.imie = imie;
        this.rok = rok;
        this.plec = plec;
        this.zdjUrl = zdjUrl;
    }

   public String getimie() {
        return imie;
    }

    public void setimie(String imie) {
        this.imie = imie;
    }

    public int getrok() {
        return rok;
    }

    public void setrok(int rok) {
        this.rok = rok;
    }

    public String getplec() {
        return plec;
    }

    public void setplec(String plec) {
        this.plec = plec;
    }

    public String getzdjUrl() {
        return zdjUrl;
    }

    public void setzdjUrl(String zdjUrl) {
        this.zdjUrl = zdjUrl;
    }
}
