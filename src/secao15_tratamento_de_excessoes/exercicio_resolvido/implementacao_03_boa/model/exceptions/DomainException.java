package secao15_tratamento_de_excessoes.exercicio_resolvido.implementacao_03_boa.model.exceptions;

public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}