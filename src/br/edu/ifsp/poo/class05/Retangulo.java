package br.edu.ifsp.poo.class05;

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
}
