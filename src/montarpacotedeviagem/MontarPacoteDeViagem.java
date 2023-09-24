
package montarpacotedeviagem;

import java.util.Scanner;

public class MontarPacoteDeViagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do Pacote de Viagem
        System.out.println("Cadastro de Pacote de Viagem\n");
        System.out.println("Informe o tipo de transporte: ");
        String tipoTransporte = scanner.nextLine();
        System.out.println("Informe o valor do transporte (em dólar): ");
        double valorTransporte = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Informe a descrição da hospedagem: ");
        String descricaoHospedagem = scanner.nextLine();
        System.out.println("Informe o valor da diária da hospedagem (em dólar): ");
        double valorDiariaHospedagem = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Informe o destino do pacote de viagem: ");
        String destino = scanner.nextLine();
        System.out.println("Informe a quantidade de dias: ");
        int quantidadeDias = scanner.nextInt();

        Transporte transporte = new Transporte(tipoTransporte, valorTransporte);
        Hospedagem hospedagem = new Hospedagem(descricaoHospedagem, valorDiariaHospedagem);
        PacoteViagem pacoteViagem = new PacoteViagem(transporte, hospedagem, destino, quantidadeDias);

        // Mostrar informações do Pacote de Viagem
        System.out.println("\nInformações do Pacote de Viagem:");
        System.out.println("Tipo de Transporte: " + transporte.getTipo());
        System.out.println("Valor do Transporte (em dólar): " + transporte.getValor());
        System.out.println("Descrição da Hospedagem: " + hospedagem.getDescricao());
        System.out.println("Valor da Diária da Hospedagem (em dólar): " + hospedagem.getValorDiaria());
        System.out.println("Destino: " + pacoteViagem.getDestino());
        System.out.println("Quantidade de Dias: " + pacoteViagem.getQuantidadeDias());
        System.out.println("Total da Hospedagem (em dólar): " + hospedagem.calcularTotalHospedagem(quantidadeDias));

        // Criação da Venda
        System.out.println("\nCadastro da Venda");
        scanner.nextLine();
        System.out.println("Informe o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Informe a forma de pagamento: ");
        String formaPagamento = scanner.nextLine();
        System.out.println("Informe a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        Venda venda = new Venda(nomeCliente, formaPagamento, pacoteViagem);

        // Mostrar informações da Venda
        venda.mostrarInformacoesVenda(cotacaoDolar);

        scanner.close();
    }
}
