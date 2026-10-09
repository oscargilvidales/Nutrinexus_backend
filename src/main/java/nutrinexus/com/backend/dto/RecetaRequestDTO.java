package nutrinexus.com.backend.dto;

import java.util.List;

public class RecetaRequestDTO {
    private String titulo;
    private Integer tiempoPreparacionMinutos;
    private String dificultad;
    private String imagenUrl;
    private List<IngredienteItemDTO> ingredientes;

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Integer getTiempoPreparacionMinutos() { return tiempoPreparacionMinutos; }
    public void setTiempoPreparacionMinutos(Integer tiempoPreparacionMinutos) { this.tiempoPreparacionMinutos = tiempoPreparacionMinutos; }

    public String getDificultad() { return dificultad; }
    public void setDificultad(String dificultad) { this.dificultad = dificultad; }

    public String getImagenUrl() { return imagenUrl; }
    public void setImagenUrl(String imagenUrl) { this.imagenUrl = imagenUrl; }

    public List<IngredienteItemDTO> getIngredientes() { return ingredientes; }
    public void setIngredientes(List<IngredienteItemDTO> ingredientes) { this.ingredientes = ingredientes; }
}