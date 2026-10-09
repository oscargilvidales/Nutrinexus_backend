package nutrinexus.com.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;
import java.util.List;

@Entity
@Table(name = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String passwordHash;

    @Column(nullable = false)
    private String rol;

    @Column(name = "is_2fa_enabled")
    private Boolean is2FAEnabled = false;

    @Column(name = "is_banned")
    private Boolean isBanned = false;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private PerfilSocial perfilSocial;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private DatosMedicos datosMedicos;

    @OneToMany(mappedBy = "autor")
    private List<Receta> recetasPublicadas;

    @OneToMany(mappedBy = "creador")
    private List<PlanNutricional> planesNutricionales;
}