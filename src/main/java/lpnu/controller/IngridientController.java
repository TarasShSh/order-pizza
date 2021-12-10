
package lpnu.controller;

        import lpnu.dto.IngridientDTO;
        import lpnu.service.IngridientService;
        import org.springframework.http.ResponseEntity;
        import org.springframework.validation.annotation.Validated;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class IngridientController {
    private final IngridientService ingridientService;

    public IngridientController(final IngridientService ingridientService) {
        this.ingridientService = ingridientService;
    }

    @GetMapping("/ingridients")
    public ResponseEntity<List<IngridientDTO>> getAllWords() {
        return ResponseEntity.ok().body(ingridientService.getAllIngridients());
    }

    @GetMapping("/ingridients/{id}")
    public ResponseEntity<IngridientDTO> getWordById(@PathVariable final Long id) {
        return ResponseEntity.ok().body(ingridientService.getIngridientById(id));
    }

    @PostMapping("/ingridients")
    public ResponseEntity<IngridientDTO> saveWord(@Validated @RequestBody final IngridientDTO wordDTO) {
        return ResponseEntity.ok().body(ingridientService.saveIngridient(wordDTO));
    }

    @PutMapping("/ingridients")
    public ResponseEntity<IngridientDTO> updateWord(@Validated @RequestBody final IngridientDTO wordDTO) {
        return ResponseEntity.ok().body(ingridientService.updateIngridient(wordDTO));
    }

    @DeleteMapping("/ingridients/{id}")
    public ResponseEntity deleteWordById(@PathVariable final Long id) {
        ingridientService.deleteIngridientById(id);
        return ResponseEntity.ok().build();
    }
}
