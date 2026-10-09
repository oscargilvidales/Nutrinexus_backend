package nutrinexus.com.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.UUID;

import java.util.List;

@Entity
@Table(name = "recetas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String titulo;

    @Column(name = "tiempo_preparacion_minutos")
    private Integer tiempoPreparacion;

    private String dificultad;
    private Float pesoTotalGramos;
    private Float caloriasPor100g;
    private Float proteinasPor100g;
    private Float carbohidratosPor100g;
    private Float grasasPor100g;
    private Float fibraPor100g;

    @Column(name = "is_verified")
    private Boolean isVerified = false;

    @Column (name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "autor_id", nullable = false)
    private Usuario autor;

    @ManyToMany
    @JoinTable(
        name = "receta_ingrediente",
        joinColumns = @JoinColumn(name = "receta_id"),
        inverseJoinColumns = @JoinColumn(name = "ingrediente_id")
    )
    private List<Ingrediente> ingredientes;

    @OneToMany(mappedBy = "receta", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "receta", cascade = CascadeType.ALL)
    private List<ReaccionBinaria> reacciones;
}