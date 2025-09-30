package padroescriacao.factorymethod;

/**
 * ConcreteCreator: Especializado em criar pedidos de pizza.
 */
public class Pizzaria extends Restaurante {
    @Override
    public Pedido criaPedido() {
        return new PedidoPizza();
    }
}
