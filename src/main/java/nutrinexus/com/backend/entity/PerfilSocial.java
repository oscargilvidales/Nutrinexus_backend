package nutrinexus.com.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Table(name = "perfil_social")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PerfilSocial {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String avatar;
    
    @Column(length = 500)
    private String biografia;
    
    private Integer seguidores = 0;
    private Integer seguidos = 0;

    @Column(name = "is_private")
    private Boolean isPrivate = false;

    @OneToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}