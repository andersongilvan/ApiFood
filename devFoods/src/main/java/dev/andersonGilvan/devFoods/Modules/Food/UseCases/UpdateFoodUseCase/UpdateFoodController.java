package dev.andersonGilvan.devFoods.Modules.Food.UseCases.UpdateFoodUseCase;


import dev.andersonGilvan.devFoods.Modules.Food.DTO.ListFoodDTO;
import dev.andersonGilvan.devFoods.Modules.Food.DTO.UpdateFoodDTO;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/food")
public class UpdateFoodController {

    private final UpdateFoodService service;

    public UpdateFoodController(UpdateFoodService service) {
        this.service = service;
    }

    @PutMapping()
    @Transactional
    public ResponseEntity<ListFoodDTO> updateFood(@RequestBody @Valid UpdateFoodDTO dto) {

        var foodDto = this.service.update(dto);

        return ResponseEntity.ok(foodDto);
    }
}
