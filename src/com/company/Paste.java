package com.company;

public class Paste extends Mancare{
    private final String tipPaste;
    private final int timpPreparare;

    public String getTipPaste() {
        return tipPaste;
    }

    public Paste(String numeMancare, double pretMancare, String tipPastel) {
        super(numeMancare, pretMancare);
        this.tipPaste = tipPastel;
        timpPreparare=3;
    }

    @Override
    public void afiseazaElementul() {
        System.out.println("\t" + numeMancare + " " + tipPaste + " la pret de " + pretMancare + "lei!");
    }
}
