package secao14_heranca_e_polimorfismo.exercicios_resolvidos.exercicio02.entities;

import secao14_heranca_e_polimorfismo.exercicios_resolvidos.exercicio02.entities.enums.Color;

public class Circle extends Shape {

    private Double radius;

    public Circle() {
        super();
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}