package secao17_trabalhando_com_arquivos.exercicio_proposto.entities;

public class Product {
    private String name;
    private Double valor;
    private Integer quantidade;

    public Product(String name, Double valor, Integer quantidade) {
        this.name = name;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double total(){
        return this.valor * this.quantidade;
    }
}
