package dev.andersonGilvan.devFoods.Modules.Food.UseCases.DeleteDoodUseCase;


import dev.andersonGilvan.devFoods.Modules.Food.Repository.FoodRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteFoodService {

    private final FoodRepository repository;

    public DeleteFoodService(FoodRepository repository) {
        this.repository = repository;
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}
