package entity;

public class Usuario {

    private String  dia_data;
    private int valor;
    private int valor_creditado;
    private String  bandeira;
    private String percentual;
    private String parcelamento;

    public String getDia_data() {
        return dia_data;
    }

    public void setDia_data(String dia_data) {
        this.dia_data = dia_data;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor_creditado() {
        return valor_creditado;
    }

    public String getParcelamento() {
        return parcelamento;
    }

    public String getPercentual() {
        return percentual;
    }

    public void setParcelamento(String parcelamento) {
        this.parcelamento = parcelamento;
    }

    public void setPercentual(String percentual) {
        this.percentual = percentual;
    }

    public void setValor_creditado(int valor_creditado) {
        this.valor_creditado = valor_creditado;
    }
}