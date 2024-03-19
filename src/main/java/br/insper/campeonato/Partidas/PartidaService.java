package br.insper.campeonato.Partidas;

import br.insper.campeonato.Time.Time;
import br.insper.campeonato.Time.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class PartidaService {
    @Autowired
    private TimeService timeService;

    private ArrayList<Partida> partidas = new ArrayList<>();
    public Partida cadastrarPartida(Partida partida) {

        if (partida.getVisitante().equals("") || partida.getMandante().equals("")|| partida.getCampeonato().equals("")|| partida.getPlacarMandante()== null || partida.getPlacarVisitante() == null) {
            return null;
        } else if (partida.getVisitante().equals(partida.getMandante())) {
            return null;
        } else if (timeService.getTime(partida.getMandante())== null||timeService.getTime(partida.getVisitante())== null ) {
            return null;
        } else {
            partidas.add(partida);
            return partida;
        }

    }

    public ArrayList<Partida> listarPartidas(String mandante) {
        if (mandante != null) {
            ArrayList<Partida> lista = new ArrayList<>();
            for (Partida partida : partidas) {
                if (partida.getMandante().startsWith(mandante)) {
                    lista.add(partida);
                }
            }
            return lista;
        }
        return partidas;
    }

    public Integer vencedorPartidas(String time){
        int vitoria=0;
        for (Partida partida : partidas){
            if (partida.getMandante().startsWith(time)){
                if (partida.getPlacarMandante()> partida.getPlacarVisitante()){
                    vitoria+=1;
                }
            }
            if (partida.getVisitante().startsWith(time)){
                if (partida.getPlacarMandante()< partida.getPlacarVisitante()){
                    vitoria+=1;
                }
            }
        }
        return vitoria;
    }

}
