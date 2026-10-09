package nutrinexus.com.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "reacciones_binarias")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReaccionBinaria {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "is_like", nullable = false)
    private Boolean isLike;


    @Column (name = "fecha_reaccion", nullable = false)
    private LocalDateTime fechaReaccion = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "receta_id", nullable = false)
    private Receta receta;
}