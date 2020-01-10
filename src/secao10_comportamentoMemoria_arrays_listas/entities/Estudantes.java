package secao10_comportamentoMemoria_arrays_listas.entities;

public class Estudantes {
    private String name;
    private String email;

    public Estudantes(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + ", " + email;
    }
}
