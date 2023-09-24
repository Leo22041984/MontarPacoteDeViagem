
package montarpacotedeviagem;
public class Transporte {
    private String tipo;
    private double valor;

    public Transporte(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}

