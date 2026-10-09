package nutrinexus.com.backend.repository;

import nutrinexus.com.backend.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
    // Spring genera la consulta SQL automáticamente solo con leer el nombre del método
    Optional<Usuario> findByEmail(String email);
}