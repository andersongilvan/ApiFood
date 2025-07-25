package dev.andersonGilvan.devFoods.Modules.Food.Repository;

import dev.andersonGilvan.devFoods.Modules.Food.Model.FoodModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<FoodModel, Long> {
}
