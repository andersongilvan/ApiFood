package dev.andersonGilvan.apiCadastro.Domain.Food.UseCases.UpdateFoodUseCase;


import dev.andersonGilvan.apiCadastro.Domain.Food.DTO.ListFoodDTO;
import dev.andersonGilvan.apiCadastro.Domain.Food.DTO.UpdateFoodDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/food")
public class UpdateFoodController {

    private final UpdateFoodService service;

    public UpdateFoodController(UpdateFoodService service) {
        this.service = service;
    }

    @PutMapping("/{id}")
    public ResponseEntity<ListFoodDTO> updateFood(@PathVariable UUID id, @RequestBody @Valid UpdateFoodDto dto) {

        var result = this.service.update(id, dto);

        return ResponseEntity.ok(result);

    }
}
