package dev.andersonGilvan.apiCadastro.Domain.Food.UseCases.DeletFoodUseCase;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/food")
public class DeleteFoodController {

    private final DeleteFoodService service;

    public DeleteFoodController(DeleteFoodService service) {
        this.service = service;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteFood(@PathVariable UUID id) {

        this.service.delete(id);

        return ResponseEntity.noContent().build();

    }
}
