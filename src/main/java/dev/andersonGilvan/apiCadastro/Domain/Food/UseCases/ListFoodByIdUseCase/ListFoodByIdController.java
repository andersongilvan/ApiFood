package dev.andersonGilvan.apiCadastro.Domain.Food.UseCases.ListFoodByIdUseCase;


import dev.andersonGilvan.apiCadastro.Domain.Food.DTO.ListFoodDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequestMapping("/food")
public class ListFoodByIdController {

    private final ListFoodByIdService service;

    public ListFoodByIdController(ListFoodByIdService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ListFoodDTO> listFoodById(@PathVariable UUID id) {

        var food = this.service.getById(id);
        return ResponseEntity.ok(food);

    }
}
