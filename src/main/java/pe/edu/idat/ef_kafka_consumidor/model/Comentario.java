package pe.edu.idat.ef_kafka_consumidor.model;

public class Comentario {
    private String usuario;
    private Integer productoId;
    private String comentario;

    // Default constructor
    public Comentario() {
    }

    // All-args constructor
    public Comentario(String usuario, Integer productoId, String comentario) {
        this.usuario = usuario;
        this.productoId = productoId;
        this.comentario = comentario;
    }

    // Getters and Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Comentario{" + "usuario='" + usuario + "'" + ", productoId=" + productoId + ", comentario='" + comentario + "'" + '}';
    }
}
