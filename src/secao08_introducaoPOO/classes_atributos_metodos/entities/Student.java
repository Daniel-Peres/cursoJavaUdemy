package secao08_introducaoPOO.classes_atributos_metodos.entities;

public class Student {
    public String name;
    public double nota1, nota2, nota3;

    public double finalGrade(){
        return this.nota1 + this.nota2 + this.nota3;
    }

    public String aprovado(){
        if(this.finalGrade() >= 60.0){
            return "\nFINAL GRADE = " + String.format("%.2f", this.finalGrade()) +  "\nPASS";
        }else{
            double aux = (60.0 - this.finalGrade());
            return "\nFINAL GRADE = " + String.format("%.2f", this.finalGrade()) + "\nFAILED" + "\nMISSING " + String.format("%.2f",aux) + " POINTS";
        }
    }
}
