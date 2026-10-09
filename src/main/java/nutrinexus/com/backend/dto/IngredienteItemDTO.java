package nutrinexus.com.backend.dto;

import java.util.UUID;

public class IngredienteItemDTO {
    private UUID ingredienteId;
    private Float cantidadGramos;

    // Getters y Setters
    public UUID getIngredienteId() { return ingredienteId; }
    public void setIngredienteId(UUID ingredienteId) { this.ingredienteId = ingredienteId; }

    public Float getCantidadGramos() { return cantidadGramos; }
    public void setCantidadGramos(Float cantidadGramos) { this.cantidadGramos = cantidadGramos; }
}