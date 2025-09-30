package padroescriacao.factorymethod;

/**
 * ConcreteProduct: Implementação de um produto específico.
 * Representa um pedido de hambúrguer.
 */
public class PedidoHamburguer implements Pedido {

    @Override
    public String preparar() {
        return "Hambúrguer preparado com sucesso";
    }

    @Override
    public String validar() {
        return "Hambúrguer validado com sucesso";
    }
}
