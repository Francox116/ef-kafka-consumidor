package pe.edu.idat.ef_kafka_consumidor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.idat.ef_kafka_consumidor.model.Comentario;
import pe.edu.idat.ef_kafka_consumidor.service.ModeradorService;

import java.util.List;

@RestController
@RequestMapping("/api/comentarios")
public class ModeradorController {

    private final ModeradorService moderadorService;

    public ModeradorController(ModeradorService moderadorService) {
        this.moderadorService = moderadorService;
    }

    @GetMapping
    public ResponseEntity<List<Comentario>> listarComentarios() {
        return ResponseEntity.ok(moderadorService.listarComentarios());
    }
}
