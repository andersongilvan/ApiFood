package dev.andersonGilvan.devFoods.Modules.Food.UseCases.DeleteDoodUseCase;


import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
@Transactional
public class DeleteFoodController {


    private final DeleteFoodService service;

    public DeleteFoodController(DeleteFoodService service) {
        this.service = service;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteFood(@PathVariable Long id) {

        this.service.delete(id);

        return ResponseEntity.noContent().build();

    }

}
