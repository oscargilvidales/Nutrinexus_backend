package nutrinexus.com.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;
import java.util.List;

@Entity
@Table(name = "datos_medicos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DatosMedicos {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "ratio_insulina_carbo_icr")
    private Float ratioInsulinaCarbo_ICR;

    @Column(name = "factor_sensibilidad_isf")
    private Float factorSensibilidad_ISF;

    @ElementCollection
    @CollectionTable(name = "alergias_personales", joinColumns = @JoinColumn(name = "datos_medicos_id"))
    @Column(name = "alergia")
    private List<String> alergiasPersonales;

    @OneToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}