package padroescriacao.factorymethod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste dedicada para a RestauranteFactory.
 * Valida a correta criação de instâncias de Restaurante e o tratamento de exceções
 * para tipos de restaurante inválidos ou desconhecidos.
 */
class RestauranteFactoryTest {

    // --- Testes de Criação de Restaurantes pela Fábrica --- //

    @Test
    @DisplayName("Deve criar uma Pizzaria corretamente")
    void deveCriarPizzariaCorretamente() {
        Restaurante restaurante = RestauranteFactory.getRestaurante("Pizza");
        assertNotNull(restaurante, "A Pizzaria não deve ser nula.");
        assertInstanceOf(Pizzaria.class, restaurante, "O objeto criado deve ser uma instância de Pizzaria.");
    }

    @Test
    @DisplayName("Deve criar uma Hamburgueria corretamente")
    void deveCriarHamburgueriaCorretamente() {
        Restaurante restaurante = RestauranteFactory.getRestaurante("Hamburguer");
        assertNotNull(restaurante, "A Hamburgueria não deve ser nula.");
        assertInstanceOf(Hamburgueria.class, restaurante, "O objeto criado deve ser uma instância de Hamburgueria.");
    }

    @Test
    @DisplayName("Deve criar um RestauranteJapones corretamente")
    void deveCriarRestauranteJaponesCorretamente() {
        Restaurante restaurante = RestauranteFactory.getRestaurante("Japones");
        assertNotNull(restaurante, "O Restaurante Japonês não deve ser nulo.");
        assertInstanceOf(RestauranteJapones.class, restaurante, "O objeto criado deve ser uma instância de RestauranteJapones.");
    }

    // --- Testes de Exceção da RestauranteFactory --- //

    @Test
    @DisplayName("Deve lançar IllegalArgumentException para tipo de restaurante desconhecido")
    void deveLancarExcecaoParaTipoDesconhecido() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            RestauranteFactory.getRestaurante("Churrasco");
        });
        assertEquals("Tipo de restaurante desconhecido.", exception.getMessage(), "A mensagem da exceção deve ser 'Tipo de restaurante desconhecido.'.");
    }

    @Test
    @DisplayName("Deve lançar IllegalArgumentException para tipo de restaurante nulo")
    void deveLancarExcecaoParaTipoNulo() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            RestauranteFactory.getRestaurante(null);
        });
        assertEquals("Tipo de restaurante inválido.", exception.getMessage(), "A mensagem da exceção deve ser 'Tipo de restaurante inválido.'.");
    }

    @Test
    @DisplayName("Deve lançar IllegalArgumentException para tipo de restaurante vazio")
    void deveLancarExcecaoParaTipoVazio() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            RestauranteFactory.getRestaurante("");
        });
        assertEquals("Tipo de restaurante inválido.", exception.getMessage(), "A mensagem da exceção deve ser 'Tipo de restaurante inválido.'.");
    }

    @Test
    @DisplayName("Deve lançar IllegalArgumentException para tipo de restaurante com espaços em branco")
    void deveLancarExcecaoParaTipoComEspacosEmBranco() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            RestauranteFactory.getRestaurante("   ");
        });
        assertEquals("Tipo de restaurante inválido.", exception.getMessage(), "A mensagem da exceção deve ser 'Tipo de restaurante inválido.'.");
    }
}