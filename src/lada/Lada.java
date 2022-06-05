package lada;

import adatok.Ladak;

public class Lada {

    private boolean BenneVan;
    private String szin;
    private Ladak szoveg;

    public Lada(String szin, Ladak szoveg, boolean BenneVan) {
        this.szin = szin;
        this.szoveg = szoveg;
        this.BenneVan = BenneVan;

    }

    public boolean isBenneVan() {
        return BenneVan;
    }

    public String getSzin() {
        return szin;
    }

    public Ladak getSzoveg() {
        return szoveg;
    }

    @Override
    public String toString() {
        return "Lada{" + "BenneVan=" + BenneVan + ", szin=" + szin + ", szoveg=" + szoveg +'}';
    }


    
    }

