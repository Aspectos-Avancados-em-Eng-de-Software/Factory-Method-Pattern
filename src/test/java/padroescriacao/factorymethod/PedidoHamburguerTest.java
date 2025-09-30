package padroescriacao.factorymethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste dedicada para PedidoHamburguer.
 * Valida o comportamento específico de preparação e validação de um pedido de hambúrguer,
 * utilizando a interface Pedido para a declaração do objeto e @BeforeEach para inicialização.
 */
class PedidoHamburguerTest {

    private Pedido pedido; // Declarado como a interface Pedido

    @BeforeEach
    void setUp() {
        pedido = new PedidoHamburguer(); // Inicializado com a implementação concreta
    }

    @Test
    @DisplayName("Deve garantir que o objeto PedidoHamburguer não é nulo após a inicialização")
    void deveNaoSerNulo() {
        assertNotNull(pedido, "O objeto Pedido não deve ser nulo após a inicialização.");
    }

    @Test
    @DisplayName("Deve verificar se o objeto é uma instância de PedidoHamburguer")
    void deveSerInstanciaDePedidoHamburguer() {
        assertInstanceOf(PedidoHamburguer.class, pedido, "O objeto deve ser uma instância de PedidoHamburguer.");
    }

    @Test
    @DisplayName("Deve retornar a mensagem correta ao preparar o hambúrguer")
    void devePrepararHamburguerCorretamente() {
        String resultado = pedido.preparar();
        assertNotNull(resultado, "O resultado da preparação não deve ser nulo.");
        assertFalse(resultado.isEmpty(), "O resultado da preparação não deve ser vazio.");
        assertEquals("Hambúrguer preparado com sucesso", resultado, "A mensagem de preparação do hambúrguer está incorreta.");
    }

    @Test
    @DisplayName("Deve retornar a mensagem correta ao validar o hambúrguer")
    void deveValidarHamburguerCorretamente() {
        String resultado = pedido.validar();
        assertNotNull(resultado, "O resultado da validação não deve ser nulo.");
        assertFalse(resultado.isEmpty(), "O resultado da validação não deve ser vazio.");
        assertEquals("Hambúrguer validado com sucesso", resultado, "A mensagem de validação do hambúrguer está incorreta.");
    }

    // Testes adicionais para cobrir mais cenários, mesmo que a implementação seja simples
    @Test
    @DisplayName("Deve garantir que preparar() e validar() são chamáveis múltiplas vezes")
    void deveSerChamavelMultiplasVezes() {
        pedido.preparar();
        pedido.validar();
        String resultadoPreparo = pedido.preparar();
        String resultadoValidacao = pedido.validar();

        assertEquals("Hambúrguer preparado com sucesso", resultadoPreparo, "A preparação deve ser consistente em chamadas múltiplas.");
        assertEquals("Hambúrguer validado com sucesso", resultadoValidacao, "A validação deve ser consistente em chamadas múltiplas.");
    }

    @Test
    @DisplayName("Deve verificar que o tipo de retorno de preparar() é String")
    void deveRetornarStringEmPreparar() {
        assertTrue(pedido.preparar() instanceof String, "O método preparar() deve retornar uma String.");
    }

    @Test
    @DisplayName("Deve verificar que o tipo de retorno de validar() é String")
    void deveRetornarStringEmValidar() {
        assertTrue(pedido.validar() instanceof String, "O método validar() deve retornar uma String.");
    }
}
