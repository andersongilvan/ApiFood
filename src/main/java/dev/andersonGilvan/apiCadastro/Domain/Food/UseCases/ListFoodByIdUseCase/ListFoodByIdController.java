package dev.andersonGilvan.apiCadastro.Domain.Food.UseCases.ListFoodByIdUseCase;


import dev.andersonGilvan.apiCadastro.Domain.Food.DTO.ListFoodDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequestMapping("/food")
public class ListFoodByIdController {

    private ListFoodByIdService service;

    public ListFoodByIdController(ListFoodByIdService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ListFoodDTO listFoodById(@PathVariable UUID id) {

        return this.service.getById(id);

    }
}
