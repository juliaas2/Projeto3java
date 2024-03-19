package br.insper.campeonato.Partidas;

import br.insper.campeonato.Time.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PartidaController {
    @Autowired
    private PartidaService partidaService;
    @GetMapping("/partida")
    public ArrayList<Partida> getPartidas(@RequestParam(required = false) String mandante) {
        return partidaService.listarPartidas(mandante);
    }

    @PostMapping("/partida")
    public Partida salvarPartida(@RequestBody Partida partida) {
        return partidaService.cadastrarPartida(partida);
    }

    @GetMapping("/partida/{time}")
    public Integer getVitorias(@PathVariable String time) {
        return partidaService.vencedorPartidas(time);
    }


}
