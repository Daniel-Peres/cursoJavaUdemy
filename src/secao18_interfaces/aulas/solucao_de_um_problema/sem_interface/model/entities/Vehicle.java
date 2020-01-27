package secao18_interfaces.aulas.solucao_de_um_problema.sem_interface.model.entities;

public class Vehicle {

    private String model;

    public Vehicle() {
    }

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}