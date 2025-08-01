package dev.andersonGilvan.apiCadastro.Domain.Food.Repository;

import dev.andersonGilvan.apiCadastro.Domain.Food.Model.FoodModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FoodRepository  extends JpaRepository<FoodModel, UUID> {
}
