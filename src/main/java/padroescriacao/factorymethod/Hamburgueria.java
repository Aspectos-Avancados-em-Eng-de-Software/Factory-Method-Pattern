package padroescriacao.factorymethod;

/**
 * ConcreteCreator: Especializado em criar pedidos de hambúrguer.
 */
public class Hamburgueria extends Restaurante {
    @Override
    public Pedido criaPedido() {
        return new PedidoHamburguer();
    }
}
