package padroescriacao.factorymethod;

/**
 * Uma fábrica de fábricas (Factory of Creators).
 * Esta classe centraliza a lógica de decisão para instanciar o restaurante (Creator) correto
 * com base em um identificador. Isso facilita os testes, especialmente para cenários de exceção.
 */
public class RestauranteFactory {

    /**
     * Cria e retorna uma instância de um Restaurante com base no tipo fornecido.
     *
     * @param tipoRestaurante O tipo do restaurante a ser criado (ex: "Pizza", "Hamburguer").
     * @return Uma instância de uma subclasse de Restaurante.
     * @throws IllegalArgumentException se o tipo de restaurante for desconhecido ou inválido.
     */
    public static Restaurante getRestaurante(String tipoRestaurante) {
        if (tipoRestaurante == null || tipoRestaurante.trim().isEmpty()) {
            throw new IllegalArgumentException("Tipo de restaurante inválido.");
        }
        switch (tipoRestaurante.toLowerCase()) {
            case "pizza":
                return new Pizzaria();
            case "hamburguer":
                return new Hamburgueria();
            case "japones":
                return new RestauranteJapones();
            default:
                throw new IllegalArgumentException("Tipo de restaurante desconhecido.");
        }
    }
}
