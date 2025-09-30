package padroescriacao.factorymethod;

/**
 * Product: A interface que define o objeto a ser criado.
 * Agora inclui um metodo para validação, além da preparação.
 */
public interface Pedido {

    String preparar();

    String validar();
}
