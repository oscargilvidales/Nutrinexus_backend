package nutrinexus.com.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "comentarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 1000)
    private String texto;

    @Column(name = "valoracion_estrellas")
    private Integer valoracionEstrellas;

    @Column(name = "archivo_multimedia")
    private String archivoMultimedia;

    @Column(name = "fecha_comentario", nullable = false)
    private LocalDateTime fechaComentario = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "receta_id", nullable = false)
    private Receta receta;
}