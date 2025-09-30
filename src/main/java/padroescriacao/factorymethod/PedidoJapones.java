package padroescriacao.factorymethod;

/**
 * ConcreteProduct: Implementação de um produto específico.
 * Representa um pedido de comida japonesa.
 */
public class PedidoJapones implements Pedido {

    @Override
    public String preparar() {
        return "Comida japonesa preparada com sucesso";
    }

    @Override
    public String validar() {
        return "Comida japonesa validada com sucesso";
    }
}
