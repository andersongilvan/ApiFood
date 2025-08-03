package dev.andersonGilvan.apiCadastro.Domain.Food.UseCases.CreateFoodUseCase;


import dev.andersonGilvan.apiCadastro.Domain.Food.DTO.CreateFoodDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class CreateFoodController {

    private CreateFoodService service;

    public CreateFoodController(CreateFoodService service) {
        this.service = service;
    }

    @PostMapping
    public void createFood(@RequestBody @Valid CreateFoodDTO dto) {

        this.service.createFood(dto);

    }

}
