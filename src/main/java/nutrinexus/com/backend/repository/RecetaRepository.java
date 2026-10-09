package nutrinexus.com.backend.repository;

import nutrinexus.com.backend.entity.Receta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RecetaRepository extends JpaRepository<Receta, UUID> {
    // Este método te servirá para cargar el feed de recetas paginado
    Page<Receta> findAllByOrderByFechaPublicacionDesc(Pageable pageable);
}