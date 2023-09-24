
package montarpacotedeviagem;

public class Venda {
    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacoteViagem;

    public Venda(String nomeCliente, String formaPagamento, PacoteViagem pacoteViagem) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacoteViagem = pacoteViagem;
    }

    public double converterValorReais(double valorDolar, double cotacao) {
        return valorDolar * cotacao;
    }

    public void mostrarInformacoesVenda(double cotacaoDolar) {
        double valorDolar = pacoteViagem.calcularTotalPacote(10.0, 50.0); // exemplo de margem de lucro e taxas adicionais
        double valorReais = converterValorReais(valorDolar, cotacaoDolar);

        System.out.println("Informações da Venda:");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Forma de Pagamento: " + formaPagamento);
        System.out.println("Pacote de Viagem - Destino: " + pacoteViagem.getDestino());
        System.out.println("Valor Total (em dólar): " + valorDolar);
        System.out.println("Valor Total (em reais): " + valorReais);
    }
}

