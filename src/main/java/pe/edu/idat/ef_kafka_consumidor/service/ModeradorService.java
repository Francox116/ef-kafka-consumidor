package pe.edu.idat.ef_kafka_consumidor.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import pe.edu.idat.ef_kafka_consumidor.model.Comentario;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModeradorService {

    private final List<Comentario> comentarios = new ArrayList<>();

    @KafkaListener(topics = "comentarios_usuarios", groupId = "comentarios-group")
    public void consumirComentario(Comentario comentario) {
        System.out.println("Comentario recibido: " + comentario);
        comentarios.add(comentario);
    }

    public List<Comentario> listarComentarios() {
        return comentarios;
    }
}
