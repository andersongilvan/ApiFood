package dev.andersonGilvan.apiCadastro.Domain.Food.UseCases.UpdateFoodUseCase;


import dev.andersonGilvan.apiCadastro.Domain.Food.DTO.UpdateFoodDto;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/food")
public class UpdateFoodController {

    private UpdateFoodService service;

    public UpdateFoodController(UpdateFoodService service) {
        this.service = service;
    }

    @PutMapping("/{id}")
    public void updateFood(@PathVariable UUID id, @RequestBody @Valid UpdateFoodDto dto) {

        this.service.update(id, dto);

    }
}
