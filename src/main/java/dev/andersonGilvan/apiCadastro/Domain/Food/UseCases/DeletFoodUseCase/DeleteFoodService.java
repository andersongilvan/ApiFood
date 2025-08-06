package dev.andersonGilvan.apiCadastro.Domain.Food.UseCases.DeletFoodUseCase;


import dev.andersonGilvan.apiCadastro.Domain.Food.Repository.FoodRepository;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DeleteFoodService {

    private final FoodRepository repository;

    public DeleteFoodService(FoodRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void delete(UUID id) {
        this.repository.deleteById(id);

    }
}
