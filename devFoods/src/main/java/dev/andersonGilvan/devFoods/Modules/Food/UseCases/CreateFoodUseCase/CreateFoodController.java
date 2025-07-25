package dev.andersonGilvan.devFoods.Modules.Food.UseCases.CreateFoodUseCase;


import dev.andersonGilvan.devFoods.Modules.Food.DTO.CreateFoodDTO;
import dev.andersonGilvan.devFoods.Modules.Food.DTO.ListFoodDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/food")
public class CreateFoodController {

    private final CreateFoodService createFoodService;

    public CreateFoodController(CreateFoodService createFoodService) {
        this.createFoodService = createFoodService;
    }

    @PostMapping
    public ResponseEntity createFood(@RequestBody @Valid CreateFoodDTO createFoodDTO, UriComponentsBuilder uriBuilder) {

        System.out.println(createFoodDTO);

      var newFoodDto =   this.createFoodService.create(createFoodDTO);

        var uri = uriBuilder.path("/food/{id}").buildAndExpand(newFoodDto.id()).toUri();

        return  ResponseEntity.created(uri).body(newFoodDto);

    }

}
