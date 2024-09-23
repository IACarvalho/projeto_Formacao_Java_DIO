public class ParametroInvalidoException extends Exception {
    public ParametroInvalidoException() {
        super("O primeiro parâmetro deve ser menor que o segundo parâmetro.");
    }
}
