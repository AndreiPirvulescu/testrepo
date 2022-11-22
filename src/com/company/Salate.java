package com.company;

public class Salate extends Mancare{
    private final String tipSalate;
    private final int timpPreparare;

    public String getTipSalate() {
        return tipSalate;
    }

    public Salate(String numeMancare, double pretMancare, String tipSalate) {
        super(numeMancare, pretMancare);
        this.tipSalate = tipSalate;
        timpPreparare=2;
    }

    @Override
    public void afiseazaElementul() {
        System.out.println("\t" + numeMancare + " " + tipSalate + " la pret de " + pretMancare + "lei!");
    }
}
