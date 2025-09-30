package padroescriacao.factorymethod;

/**
 * Creator: A classe que declara o Factory Method.
 * Esta classe é abstrata e não sabe qual produto concreto será criado.
 * A responsabilidade é delegada para suas subclasses.
 */
public abstract class Restaurante {

    public abstract Pedido criaPedido();

    public void novoPedido() {
        Pedido pedido = criaPedido();
        System.out.println("Novo pedido recebido no restaurante!");
        System.out.println(pedido.preparar());
        System.out.println(pedido.validar());
        System.out.println("Pedido pronto para entrega!");
        System.out.println("---------------------------------");
    }
}

