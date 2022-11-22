package com.company;

public abstract class Mancare implements ElementeComposite{
    protected final String numeMancare;
    protected double pretMancare;

    public String getNumeMancare() {
        return numeMancare;
    }

    public double getPretMancare() {
        return pretMancare;
    }

    public void setPretMancare(double pretMancare) {
        this.pretMancare = pretMancare;
    }

    public Mancare(String numeMancare, double pretMancare) {
        this.numeMancare = numeMancare;
        this.pretMancare = pretMancare;
    }
}
