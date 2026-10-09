package nutrinexus.com.backend.controller;

import nutrinexus.com.backend.dto.RecetaRequestDTO;
import nutrinexus.com.backend.entity.Receta;
import nutrinexus.com.backend.repository.RecetaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/recetas")
public class RecetaController {

    private final RecetaRepository recetaRepository;

    // Inyección de dependencias
    public RecetaController(RecetaRepository recetaRepository) {
        this.recetaRepository = recetaRepository;
    }

    @GetMapping
    public ResponseEntity<List<Receta>> getAllRecetas() {
        List<Receta> recetas = recetaRepository.findAll();
        return ResponseEntity.ok(recetas);
    }
    
    @GetMapping ("/{id}")
    public ResponseEntity<Receta> getRecetaById(@PathVariable("id") String id) {
        return recetaRepository.findById(java.util.UUID.fromString(id))
                .map(receta -> ResponseEntity.ok().body(receta))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
public ResponseEntity<Receta> createReceta(@RequestBody RecetaRequestDTO request) {
    Receta receta = new Receta();
    receta.setTitulo(request.getTitulo());
    receta.setTiempoPreparacion(request.getTiempoPreparacionMinutos()); // Asegúrate del nombre en la entidad
    receta.setDificultad(request.getDificultad());
    
    // Si manejas ingredientes mediante ID (relación en base de datos):
    // Lo ideal aquí es buscar los ingredientes en el IngredienteRepository usando su UUID.
    
    Receta savedReceta = recetaRepository.save(receta);
    return ResponseEntity.ok(savedReceta);
}
}