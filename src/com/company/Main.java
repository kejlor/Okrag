package com.company;

public class Main {

    public static void main(String[] args) throws Throwable {
        Okrag pierwszyOkrag = new Okrag(1, 2);
        Okrag drugiOkrag = new Okrag(3, 6);
        pierwszyOkrag.czyJestZawartyWOkregu(pierwszyOkrag, drugiOkrag);
        pierwszyOkrag.ileRazyMiesciSie(pierwszyOkrag, drugiOkrag);
        pierwszyOkrag.finalize();
        drugiOkrag.finalize();
    }
}
