package entity;

public class Usuario {

    private int codigo;
    private String dia_data;
    private int valor;
    private String  bandeira;
    private String  pagamento;
    private String parcelamento;

    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
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
    
    public String getParcelamento() {
        return parcelamento;
    }
    
    public void setParcelamento(String parcelamento) {
        this.parcelamento = parcelamento;
    }
    
    public String getPagamento() {
        return pagamento;
    }
    
    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
    
}