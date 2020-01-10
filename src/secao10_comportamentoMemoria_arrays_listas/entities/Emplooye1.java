package secao10_comportamentoMemoria_arrays_listas.entities;

public class Emplooye1 {
    private Integer id;
    private String name;
    private Double salary;

    public Emplooye1() {}

    public Emplooye1(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentagem){
        this.salary += salary * percentagem / 100;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
