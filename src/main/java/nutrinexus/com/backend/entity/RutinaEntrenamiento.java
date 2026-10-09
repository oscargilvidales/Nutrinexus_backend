package nutrinexus.com.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Table(name = "rutinas_entrenamiento")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RutinaEntrenamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "objetivo_deportivo")
    private String objetivoDeportivo;

    private Integer series;
    private Integer repeticiones;

    @ManyToOne
    @JoinColumn(name = "plan_nutricional_id", nullable = false)
    private PlanNutricional planNutricional;
}