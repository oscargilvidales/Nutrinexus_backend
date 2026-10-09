package nutrinexus.com.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;
import java.util.List;

@Entity
@Table(name = "ingredientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nombre;

    private Float calorias;
    private Float proteinas;
    private Float carbohidratos;
    private Float grasas;
    private Float fibra;

    @ElementCollection
    @CollectionTable(name = "ingrediente_alergenos", joinColumns = @JoinColumn(name = "ingrediente_id"))
    @Column(name = "alergeno")
    private List<String> alergenos;

    @Column(name = "validado_por_ia")
    private Boolean validadoPorIA = false;
}