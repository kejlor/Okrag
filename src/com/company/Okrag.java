package com.company;

public class Okrag {
    private double polozenieNaOsiX;
    private double promien;

    public Okrag(double polozenieNaOsiX, double promien) {
        this.polozenieNaOsiX = polozenieNaOsiX;
        this.promien = promien;
        System.out.println("Jestem okręgiem z punktu(" + polozenieNaOsiX + ",0 o promieniu " + promien);
    }

    public double getPolozenieNaOsiX() {
        return polozenieNaOsiX;
    }

    public void setPolozenieNaOsiX(double polozenieNaOsiX) {
        this.polozenieNaOsiX = polozenieNaOsiX;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double obliczDlugoscOkregu(Double promien) {
        double dlugosc = 2 * 3.14 * promien;
        return dlugosc;
    }

    public boolean czyJestZawartyWOkregu(Okrag pierwszyOkrag, Okrag drugiOkrag) {
        boolean result;
        double krotszyPromien;
        double dluzszyPromien;
        double odlegloscMiedzyPunktami;
        double blizszaWsplX;
        double dalszaWsplX;
        if (pierwszyOkrag.getPromien() > drugiOkrag.getPromien()) {
            krotszyPromien = drugiOkrag.getPromien();
            dluzszyPromien = pierwszyOkrag.getPromien();
        } else {
            krotszyPromien = pierwszyOkrag.getPromien();
            dluzszyPromien = drugiOkrag.getPromien();
        }
        if (pierwszyOkrag.getPolozenieNaOsiX() > drugiOkrag.getPolozenieNaOsiX()) {
            blizszaWsplX = drugiOkrag.polozenieNaOsiX;
            dalszaWsplX = pierwszyOkrag.getPolozenieNaOsiX();
        } else {
            blizszaWsplX = pierwszyOkrag.polozenieNaOsiX;
            dalszaWsplX = drugiOkrag.getPolozenieNaOsiX();
        }
        odlegloscMiedzyPunktami = dalszaWsplX - blizszaWsplX;
        if (dluzszyPromien >= odlegloscMiedzyPunktami + krotszyPromien) {
            result = true;
        } else if (pierwszyOkrag.getPolozenieNaOsiX() == drugiOkrag.getPolozenieNaOsiX()) {
            result = true;
        } else {
            result = false;
        }
        System.out.println("Czy jest zawarty: " + result);
        return result;
    }

    public void finalize() throws Throwable {
        System.out.println("Okręg z punktu(" + polozenieNaOsiX + ",0 o promieniu " + promien + " o dlugosci " + obliczDlugoscOkregu(promien) + " znika");
    }

    public int ileRazyMiesciSie(Okrag pierwszyOkrag, Okrag drugiOkrag) {
        double pierwszaDlugosc = obliczDlugoscOkregu(pierwszyOkrag.getPromien());
        double drugaDlugosc = obliczDlugoscOkregu(drugiOkrag.getPromien());
        int ile = 0;
        while (drugaDlugosc / pierwszaDlugosc >= 1) {
            drugaDlugosc = drugaDlugosc / pierwszaDlugosc;
            ile++;
        }
        System.out.println("Dlugosc okregu I miescy sie " + ile + " w dlugosci okregu II");
        return ile;
    }
}
