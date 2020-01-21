package secao14_heranca_e_polimorfismo.exercicios_resolvidos.exercicio02.entities;

import secao14_heranca_e_polimorfismo.exercicios_resolvidos.exercicio02.entities.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}