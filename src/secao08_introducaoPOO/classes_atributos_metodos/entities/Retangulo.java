package secao08_introducaoPOO.classes_atributos_metodos.entities;

public class Retangulo {
    public double width;
    public double height;

    public double Area(){
        return this.height * this.width;
    }

    public double Perimeter(){
        return 2 * this.width + 2 * this.height;
    }

    public double Diagonal(){
        return Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.width, 2));
    }

    @Override
    public String toString() {
        return "AREA = " + String.format("%.2f", this.Area())+
                "\nPERIMETER = " + String.format("%.2f" ,this.Perimeter()) +
                "\nDIAGONAL = " + String.format("%.2f" ,this.Diagonal())
                ;
    }
}
