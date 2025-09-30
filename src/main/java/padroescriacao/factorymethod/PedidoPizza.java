package padroescriacao.factorymethod;

/**
 * ConcreteProduct: Implementação de um produto específico.
 * Representa um pedido de pizza.
 */
public class PedidoPizza implements Pedido {

    @Override
    public String preparar() {
        return "Pizza preparada com sucesso";
    }

    @Override
    public String validar() {
        return "Pizza validada com sucesso";
    }
}
