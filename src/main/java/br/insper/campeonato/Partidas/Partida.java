package br.insper.campeonato.Partidas;

public class Partida {
    private String mandante;
    private String visitante;
    private Integer placarMandante;
    private Integer placarVisitante;
    private String campeonato;

    public Partida( String mandante,String visitante,Integer placarMandante, Integer placarVisitante, String campeonato) {
        this.mandante= mandante;
        this.visitante = visitante;
        this.placarMandante = placarMandante;
        this.placarVisitante = placarVisitante;
        this.campeonato = campeonato;
    }

    public String getMandante() {
        return mandante;
    }

    public void setMandante(String mandante) {
        this.mandante = mandante;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public Integer getPlacarMandante() {
        return placarMandante;
    }

    public void setPlacarMandante(Integer placarMandante) {
        this.placarMandante = placarMandante;
    }

    public Integer getPlacarVisitante() {
        return placarVisitante;
    }

    public void setPlacarVisitante(Integer placarVisitante) {
        this.placarVisitante = placarVisitante;
    }

    public String getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }
}
