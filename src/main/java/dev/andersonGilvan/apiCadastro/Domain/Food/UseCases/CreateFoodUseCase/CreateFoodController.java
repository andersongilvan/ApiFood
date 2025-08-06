package dev.andersonGilvan.apiCadastro.Domain.Food.UseCases.CreateFoodUseCase;


import dev.andersonGilvan.apiCadastro.Domain.Food.DTO.CreateFoodDTO;
import dev.andersonGilvan.apiCadastro.Domain.Food.DTO.ListFoodDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/food")
public class CreateFoodController {

    private final CreateFoodService service;

    public CreateFoodController(CreateFoodService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ListFoodDTO> createFood(@RequestBody @Valid CreateFoodDTO dto, UriComponentsBuilder uriComponentsBuilder) {

        var result = this.service.createFood(dto);

        var foodDto = new ListFoodDTO(result);

        var uri = uriComponentsBuilder.path("/{id}").buildAndExpand(result.getId()).toUri();

        return ResponseEntity.created(uri).body(foodDto);

    }

}
