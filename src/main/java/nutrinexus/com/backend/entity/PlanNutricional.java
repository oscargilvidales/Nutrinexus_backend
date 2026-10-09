package nutrinexus.com.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;
import java.util.List;

@Entity
@Table(name = "planes_nutricionales")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanNutricional {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "objetivo_nutricional")
    private String objetivoNutricional;

    @Column(name = "calorias_objetivo")
    private Float caloriasObjetivo;

    @ManyToOne
    @JoinColumn(name = "creador_id", nullable = false)
    private Usuario creador;

    @OneToMany(mappedBy = "planNutricional", cascade = CascadeType.ALL)
    private List<RutinaEntrenamiento> rutinas;

    @ManyToMany
    @JoinTable(
        name = "plan_receta",
        joinColumns = @JoinColumn(name = "plan_id"),
        inverseJoinColumns = @JoinColumn(name = "receta_id")
    )
    private List<Receta> recetasAsociadas;

    @ManyToMany
    @JoinTable(
        name = "plan_ingrediente",
        joinColumns = @JoinColumn(name = "plan_id"),
        inverseJoinColumns = @JoinColumn(name = "ingrediente_id")
    )
    private List<Ingrediente> ingredientesLibres;
}