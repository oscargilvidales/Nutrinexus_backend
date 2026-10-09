package nutrinexus.com.backend.repository;

import nutrinexus.com.backend.entity.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IngredienteRepository extends JpaRepository<Ingrediente, UUID> {
}