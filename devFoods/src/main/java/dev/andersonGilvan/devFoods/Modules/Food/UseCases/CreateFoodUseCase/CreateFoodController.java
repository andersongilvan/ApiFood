package dev.andersonGilvan.devFoods.Modules.Food.UseCases.CreateFoodUseCase;


import dev.andersonGilvan.devFoods.Modules.Food.DTO.CreateFoodDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class CreateFoodController {

    private final CreateFoodService createFoodService;

    public CreateFoodController(CreateFoodService createFoodService) {
        this.createFoodService = createFoodService;
    }

    @PostMapping
    public void createFood(@RequestBody @Valid CreateFoodDTO createFoodDTO) {

        System.out.println(createFoodDTO);

        this.createFoodService.create(createFoodDTO);

    }

}
