package nutrinexus.com.backend.dto;

import java.util.List;
import java.util.UUID;

public class PlanNutricionalRequestDTO {
    private String objetivoNutricional;
    private Float caloriasObjetivo;
    private List<DiaPlanDTO> dias;

    // Getters y Setters
    public String getObjetivoNutricional() { return objetivoNutricional; }
    public void setObjetivoNutricional(String objetivoNutricional) { this.objetivoNutricional = objetivoNutricional; }

    public Float getCaloriasObjetivo() { return caloriasObjetivo; }
    public void setCaloriasObjetivo(Float caloriasObjetivo) { this.caloriasObjetivo = caloriasObjetivo; }

    public List<DiaPlanDTO> getDias() { return dias; }
    public void setDias(List<DiaPlanDTO> dias) { this.dias = dias; }
}

class DiaPlanDTO {
    private String diaSemana;
    private List<ComidaPlanDTO> comidas;

    public String getDiaSemana() { return diaSemana; }
    public void setDiaSemana(String diaSemana) { this.diaSemana = diaSemana; }

    public List<ComidaPlanDTO> getComidas() { return comidas; }
    public void setComidas(List<ComidaPlanDTO> comidas) { this.comidas = comidas; }
}

class ComidaPlanDTO {
    private String tipo;
    private List<UUID> recetas;
    private List<IngredienteItemDTO> ingredientesLibres;

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public List<UUID> getRecetas() { return recetas; }
    public void setRecetas(List<UUID> recetas) { this.recetas = recetas; }

    public List<IngredienteItemDTO> getIngredientesLibres() { return ingredientesLibres; }
    public void setIngredientesLibres(List<IngredienteItemDTO> ingredientesLibres) { this.ingredientesLibres = ingredientesLibres; }
}