package br.edu.ifsp.poo.class05;

import java.util.Objects;

public class Retangulo extends Figura{

    private Double largura;
    private Double comprimento;

    public Retangulo(int x, int y, Double largura, Double comprimento) {
        super(x, y);
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public Double getArea() {
        return largura * comprimento;
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
