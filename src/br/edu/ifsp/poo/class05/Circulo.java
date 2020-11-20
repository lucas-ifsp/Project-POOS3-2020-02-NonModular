package br.edu.ifsp.poo.class05;

import java.util.Objects;

public class Circulo extends Figura{
    private Double raio;

    public Circulo(Integer x, Integer y, Double raio) {
        super(x, y);
        this.raio = raio;
    }

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }


    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 10;
    }
}
