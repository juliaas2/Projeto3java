package br.insper.campeonato.Time;

public class Time {
    private String identificador;
    private String nome;
    private String estadio;
    private String estado;
    public Time( String identificador,String nome,String estadio, String estado) {
        this.identificador= identificador;
        this.nome = nome;
        this.estadio = estadio;
        this.estado = estado;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
