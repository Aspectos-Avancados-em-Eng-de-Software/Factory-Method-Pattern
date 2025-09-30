package padroescriacao.factorymethod;

/**
 * ConcreteCreator: Especializado em criar pedidos de comida japonesa.
 */
public class RestauranteJapones extends Restaurante {
    @Override
    public Pedido criaPedido() {
        return new PedidoJapones();
    }
}
