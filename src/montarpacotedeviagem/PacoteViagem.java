
package montarpacotedeviagem;

public class PacoteViagem {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;

    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantidadeDias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantidadeDias = quantidadeDias;
    }

    public String getDestino() {
        return destino;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public double calcularTotalPacote(double margemLucro, double taxasAdicionais) {
        double totalTransporte = transporte.getValor();
        double totalHospedagem = hospedagem.calcularTotalHospedagem(quantidadeDias);
        double totalAdicionais = totalTransporte + totalHospedagem + taxasAdicionais;
        double lucro = (totalAdicionais * margemLucro) / 100;
        return totalAdicionais + lucro;
    }
}
